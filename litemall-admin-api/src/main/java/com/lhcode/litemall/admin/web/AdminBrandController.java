package com.lhcode.litemall.admin.web;

import com.lhcode.litemall.admin.annotation.RequiresPermissionsDesc;
import com.github.pagehelper.PageInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.lhcode.litemall.core.util.ResponseUtil;
import com.lhcode.litemall.core.validator.Order;
import com.lhcode.litemall.core.validator.Sort;
import com.lhcode.litemall.db.domain.LitemallBrand;
import com.lhcode.litemall.db.service.LitemallBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin/brand")
@Validated
@ApiIgnore
public class AdminBrandController {
    private final Log logger = LogFactory.getLog(AdminBrandController.class);

    @Autowired
    private LitemallBrandService brandService;

//    @RequiresPermissions("admin:brand:list")
//    @RequiresPermissionsDesc(menu={"商场管理" , "品牌管理"}, button="查询")
//    @GetMapping("/list")
//    public Object list(String id, String name,
//                       @RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer limit,
//                       @Sort @RequestParam(defaultValue = "add_time") String sort,
//                       @Order @RequestParam(defaultValue = "desc") String order) {
//        List<LitemallBrand> brandList = brandService.querySelective(id, name, page, limit, sort, order);
//        long total = PageInfo.of(brandList).getTotal();
//        Map<String, Object> data = new HashMap<>();
//        data.put("total", total);
//        data.put("items", brandList);
//
//        return ResponseUtil.ok(data);
//    }
//
//    private Object validate(LitemallBrand brand) {
//        String name = brand.getName();
//        if (StringUtils.isEmpty(name)) {
//            return ResponseUtil.badArgument();
//        }
//
//        String desc = brand.getDesc();
//        if (StringUtils.isEmpty(desc)) {
//            return ResponseUtil.badArgument();
//        }
//
//        BigDecimal price = brand.getFloorPrice();
//        if (price == null) {
//            return ResponseUtil.badArgument();
//        }
//        return null;
//    }
//
//    @RequiresPermissions("admin:brand:create")
//    @RequiresPermissionsDesc(menu={"商场管理" , "品牌管理"}, button="添加")
//    @PostMapping("/create")
//    public Object create(@RequestBody LitemallBrand brand) {
//        Object error = validate(brand);
//        if (error != null) {
//            return error;
//        }
//        brandService.add(brand);
//        return ResponseUtil.ok(brand);
//    }
//
//    @RequiresPermissions("admin:brand:read")
//    @RequiresPermissionsDesc(menu={"商场管理" , "品牌管理"}, button="详情")
//    @GetMapping("/read")
//    public Object read(@NotNull Integer id) {
//        LitemallBrand brand = brandService.findById(id);
//        return ResponseUtil.ok(brand);
//    }
//
//    @RequiresPermissions("admin:brand:update")
//    @RequiresPermissionsDesc(menu={"商场管理" , "品牌管理"}, button="编辑")
//    @PostMapping("/update")
//    public Object update(@RequestBody LitemallBrand brand) {
//        Object error = validate(brand);
//        if (error != null) {
//            return error;
//        }
//        if (brandService.updateById(brand) == 0) {
//            return ResponseUtil.updatedDataFailed();
//        }
//        return ResponseUtil.ok(brand);
//    }
//
//    @RequiresPermissions("admin:brand:delete")
//    @RequiresPermissionsDesc(menu={"商场管理" , "品牌管理"}, button="删除")
//    @PostMapping("/delete")
//    public Object delete(@RequestBody LitemallBrand brand) {
//        Integer id = brand.getId();
//        if (id == null) {
//            return ResponseUtil.badArgument();
//        }
//        brandService.deleteById(id);
//        return ResponseUtil.ok();
//    }

}
