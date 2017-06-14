package com.tyzx.ams.dao;

import com.tyzx.ams.bo.SysUser;

public interface SysUserMapper {
    /**
     * 
     * 根据主键删除一条记录
     * @param  userId
     * 
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * 
     * 新增一条记录
     * @param  record
     * 
     */
    int insert(SysUser record);

    /**
     * 
     * 新增一条记录（跳过未设置值的字段，将会使用数据库的默认值）
     * @param  record
     * 
     */
    int insertSelective(SysUser record);

    /**
     * 
     * 查询一条记录
     * @param  userId
     * 
     */
    SysUser selectByPrimaryKey(Integer userId);

    /**
     * 
     * 动态更新（只更新设置的字段，未设置的字段将不受影响）
     * @param  record
     * 
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * 
     * @param  record
     * 
     */
    int updateByPrimaryKeyWithBLOBs(SysUser record);

    /**
     * 
     * 更新一条记录（更新所有记录，未设置的字段将设置为空）
     * @param  record
     * 
     */
    int updateByPrimaryKey(SysUser record);
}