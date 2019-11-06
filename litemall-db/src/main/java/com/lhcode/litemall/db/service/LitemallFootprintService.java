package com.lhcode.litemall.db.service;

import com.lhcode.litemall.db.domain.LitemallAddress;
import com.lhcode.litemall.db.domain.LitemallAddressExample;
import com.github.pagehelper.PageHelper;
import com.lhcode.litemall.db.dao.LitemallFootprintMapper;
import com.lhcode.litemall.db.domain.LitemallFootprint;
import com.lhcode.litemall.db.domain.LitemallFootprintExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class LitemallFootprintService {
    @Resource
    private LitemallFootprintMapper footprintMapper;

    public List<LitemallFootprint> queryByAddTime(Integer userId, Integer page, Integer size) {
        LitemallFootprintExample example = new LitemallFootprintExample();
        example.or().andUserIdEqualTo(userId).andDeletedEqualTo(false);
        example.setOrderByClause(LitemallFootprint.Column.addTime.desc());
        PageHelper.startPage(page, size);
        return footprintMapper.selectByExample(example);
    }

    public LitemallFootprint findById(Integer id) {
        return footprintMapper.selectByPrimaryKey(id);
    }

    public void deleteById(Integer id) {
        footprintMapper.logicalDeleteByPrimaryKey(id);
    }

    public void add(LitemallFootprint footprint) {
        footprint.setAddTime(LocalDateTime.now());
        footprint.setUpdateTime(LocalDateTime.now());
        footprintMapper.insertSelective(footprint);
    }

    public List<LitemallFootprint> querySelective(String userId, String goodsId, Integer page, Integer size, String sort, String order) {
        LitemallFootprintExample example = new LitemallFootprintExample();
        LitemallFootprintExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(userId)) {
            criteria.andUserIdEqualTo(Integer.valueOf(userId));
        }
        if (!StringUtils.isEmpty(goodsId)) {
            criteria.andGoodsIdEqualTo(Integer.valueOf(goodsId));
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return footprintMapper.selectByExample(example);
    }

    /**
     * 根据用户id获取足迹
     * @param id
     * @return
     */
    public List<LitemallFootprint> selectFootprintByUserId(Integer id, String sort, String order){
        LitemallFootprintExample example = new LitemallFootprintExample();
        LitemallFootprintExample.Criteria criteria = example.createCriteria();
        if (id != null){
            criteria.andUserIdEqualTo(id);
        }
        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }
        return footprintMapper.selectFootprintByUserId(example);
    }


}
