package com.lhcode.litemall.admin.web;

import com.lhcode.litemall.admin.annotation.RequiresPermissionsDesc;
import com.lhcode.litemall.db.domain.LitemallCategory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.lhcode.litemall.admin.vo.CategoryVO;
import com.lhcode.litemall.core.util.ResponseUtil;
import com.lhcode.litemall.db.service.LitemallCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/category")
@Validated
@ApiIgnore
public class AdminCategoryController {
    private final Log logger = LogFactory.getLog(AdminCategoryController.class);

    @Autowired
    private LitemallCategoryService categoryService;

    @RequiresPermissions("admin:category:list")
    @RequiresPermissionsDesc(menu={"商场管理" , "类目管理"}, button="查询")
    @GetMapping("/list")
    public Object list() {
        List<CategoryVO> categoryVOList = new ArrayList<>();
        List<LitemallCategory> categoryList = categoryService.queryByPid(0);
        for(LitemallCategory category : categoryList){
            CategoryVO categoryVO = new CategoryVO();
            categoryVO.setId(category.getId());
            categoryVO.setDesc(category.getDesc());
            categoryVO.setIconUrl(category.getIconUrl());
            categoryVO.setPicUrl(category.getPicUrl());
            categoryVO.setKeywords(category.getKeywords());
            categoryVO.setName(category.getName());
            categoryVO.setLevel(category.getLevel());
            categoryVO.setStatus(category.getStatus());
            categoryVO.setPid(category.getPid());
            List<CategoryVO> children = new ArrayList<>();
            List<LitemallCategory> subCategoryList = categoryService.queryByPid(category.getId());
            for(LitemallCategory subCategory : subCategoryList){
                CategoryVO subCategoryVO = new CategoryVO();
                subCategoryVO.setId(subCategory.getId());
                subCategoryVO.setDesc(subCategory.getDesc());
                subCategoryVO.setIconUrl(subCategory.getIconUrl());
                subCategoryVO.setPicUrl(subCategory.getPicUrl());
                subCategoryVO.setKeywords(subCategory.getKeywords());
                subCategoryVO.setName(subCategory.getName());
                subCategoryVO.setLevel(subCategory.getLevel());
                subCategoryVO.setStatus(subCategory.getStatus());
                subCategoryVO.setPid(subCategory.getPid());
                children.add(subCategoryVO);
            }

            categoryVO.setChildren(children);
            categoryVOList.add(categoryVO);
        }

        return ResponseUtil.ok(categoryVOList);
    }

    private Object validate(LitemallCategory category) {
        String name = category.getName();
        if (StringUtils.isEmpty(name)) {
            return ResponseUtil.badArgument();
        }

        String level = category.getLevel();
        if (StringUtils.isEmpty(level)) {
            return ResponseUtil.badArgument();
        }
        if (!level.equals("L1") && !level.equals("L2")) {
            return ResponseUtil.badArgumentValue();
        }

        Integer pid = category.getPid();
        if (level.equals("L2") && (pid == null)) {
            return ResponseUtil.badArgument();
        }

        return null;
    }

    @RequiresPermissions("admin:category:create")
    @RequiresPermissionsDesc(menu={"商场管理" , "类目管理"}, button="添加")
    @PostMapping("/create")
    public Object create(@RequestBody LitemallCategory category) {
        Object error = validate(category);
        if (error != null) {
            return error;
        }
        categoryService.add(category);
        return ResponseUtil.ok(category);
    }

    @RequiresPermissions("admin:category:read")
    @RequiresPermissionsDesc(menu={"商场管理" , "类目管理"}, button="详情")
    @GetMapping("/read")
    public Object read(@NotNull Integer id) {
        LitemallCategory category = categoryService.findById(id);
        return ResponseUtil.ok(category);
    }

    @RequiresPermissions("admin:category:update")
    @RequiresPermissionsDesc(menu={"商场管理" , "类目管理"}, button="编辑")
    @PostMapping("/update")
    public Object update(@RequestBody LitemallCategory category) {
        Object error = validate(category);
        if (error != null) {
            return error;
        }

        if (categoryService.updateById(category) == 0) {
            return ResponseUtil.updatedDataFailed();
        }
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:category:delete")
    @RequiresPermissionsDesc(menu={"商场管理" , "类目管理"}, button="删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody LitemallCategory category) {
        Integer id = category.getId();
        if (id == null) {
            return ResponseUtil.badArgument();
        }
        categoryService.deleteById(id);
        return ResponseUtil.ok();
    }

    @RequiresPermissions("admin:category:list")
    @GetMapping("/l1")
    public Object catL1() {
        // 所有一级分类目录
        List<LitemallCategory> l1CatList = categoryService.queryL1();
        List<Map<String, Object>> data = new ArrayList<>(l1CatList.size());
        for (LitemallCategory category : l1CatList) {
            Map<String, Object> d = new HashMap<>(2);
            d.put("value", category.getId());
            d.put("label", category.getName());
            data.add(d);
        }
        return ResponseUtil.ok(data);
    }
}
