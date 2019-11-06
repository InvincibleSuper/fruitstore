package com.lhcode.litemall.db.dao;

import java.util.List;

import com.lhcode.litemall.db.domain.LitemallAddress;
import com.lhcode.litemall.db.domain.LitemallAddressExample;
import org.apache.ibatis.annotations.Param;

public interface LitemallAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    long countByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int insert(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int insertSelective(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAddress selectOneByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAddress selectOneByExampleSelective(@Param("example") LitemallAddressExample example, @Param("selective") LitemallAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallAddress> selectByExampleSelective(@Param("example") LitemallAddressExample example, @Param("selective") LitemallAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    List<LitemallAddress> selectByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAddress selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    LitemallAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallAddress selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallAddress record, @Param("example") LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallAddress record, @Param("example") LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);


    /**
     * 查询用户的收货地址列表
     * @param example
     * @return
     */
    List<LitemallAddress> selectAddressByUserId(LitemallAddressExample example);
}