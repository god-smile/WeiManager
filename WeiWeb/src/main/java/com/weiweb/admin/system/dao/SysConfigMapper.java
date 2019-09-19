package com.weiweb.admin.system.dao;

import java.util.List;

import com.weiweb.admin.system.model.SysConfig;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Fri Aug 25 14:05:11 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Fri Aug 25 14:05:11 CST 2017
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Fri Aug 25 14:05:11 CST 2017
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Fri Aug 25 14:05:11 CST 2017
     */
    SysConfig selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Fri Aug 25 14:05:11 CST 2017
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbggenerated Fri Aug 25 14:05:11 CST 2017
     */
    int updateByPrimaryKey(SysConfig record);
    
    List<SysConfig> findAll();
}