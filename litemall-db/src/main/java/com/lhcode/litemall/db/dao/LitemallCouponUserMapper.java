package com.lhcode.litemall.db.dao;

import java.util.List;

import com.lhcode.litemall.db.domain.LitemallCouponUser;
import com.lhcode.litemall.db.domain.LitemallCouponUserExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallCouponUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    long countByExample(LitemallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int insert(LitemallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int insertSelective(LitemallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCouponUser selectOneByExample(LitemallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCouponUser selectOneByExampleSelective(@Param("example") LitemallCouponUserExample example, @Param("selective") LitemallCouponUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallCouponUser> selectByExampleSelective(@Param("example") LitemallCouponUserExample example, @Param("selective") LitemallCouponUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    List<LitemallCouponUser> selectByExample(LitemallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCouponUser selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallCouponUser.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    LitemallCouponUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallCouponUser selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallCouponUser record, @Param("example") LitemallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallCouponUser record, @Param("example") LitemallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallCouponUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallCouponUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_coupon_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}