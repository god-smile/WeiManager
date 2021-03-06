package com.weiweb.admin.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.ui.ModelMap;

import com.weiweb.admin.permission.bo.URoleBo;
import com.weiweb.admin.permission.bo.UserRoleAllocationBo;
import com.weiweb.common.model.UUser;
import com.weiweb.core.mybatis.page.Pagination;
import com.weiweb.core.shiro.po.Message;


public interface UUserService {

	int deleteByPrimaryKey(Long id);

	UUser insert(UUser record);

    UUser insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
    
    UUser login(String email ,String pswd);

	List<UUser> findUserByEmail(String email);

	Pagination<UUser> findByPage(Map<String, Object> resultMap, Integer pageNo,
			Integer pageSize);

	boolean deleteUserById(String ids);

	Map<String, Object> updateForbidUserById(Long id, Long status);

	Pagination<UserRoleAllocationBo> findUserAndRole(ModelMap modelMap,
			Integer pageNo, Integer pageSize);

	List<URoleBo> selectRoleByUserId(Long id);

	Message addRole2User(Long userId, String ids);

	Map<String, Object> deleteRoleByUserIds(String userIds);

	List<UUser> getUserByNickname(String nickname);

	Pagination<UUser> findUserByroleId( ModelMap modelMap, int pageNo, int pageSize);

}
