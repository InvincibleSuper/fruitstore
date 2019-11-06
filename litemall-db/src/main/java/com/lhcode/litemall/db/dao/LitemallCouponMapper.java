package com.lhcode.litemall.db.dao;

import java.util.List;

import com.lhcode.litemall.db.domain.LitemallCoupon;
import com.lhcode.litemall.db.domain.LitemallCouponExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    long countByExample(LitemallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int insert(LitemallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int insertSelective(LitemallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCoupon selectOneByExample(LitemallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCoupon selectOneByExampleSelective(@Param("example") LitemallCouponExample example, @Param("selective") LitemallCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallCoupon> selectByExampleSelective(@Param("example") LitemallCouponExample example, @Param("selective") LitemallCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    List<LitemallCoupon> selectByExample(LitemallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCoupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    LitemallCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCoupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallCoupon record, @Param("example") LitemallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallCoupon record, @Param("example") LitemallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}