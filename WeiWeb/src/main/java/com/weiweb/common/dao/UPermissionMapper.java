package com.weiweb.common.dao;

import java.util.List;
import java.util.Set;

import com.weiweb.admin.permission.bo.UPermissionBo;
import com.weiweb.admin.system.bo.Menu;
import com.weiweb.common.model.UPermission;



public interface UPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UPermission record);

    int insertSelective(UPermission record);

    UPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UPermission record);

    int updateByPrimaryKey(UPermission record);

	List<UPermissionBo> selectPermissionById(Long id);
	//根据用户ID获取权限的Set集合
	Set<String> findPermissionByUserId(Long id);

	List<Menu> findLevelMenu(int level);
}