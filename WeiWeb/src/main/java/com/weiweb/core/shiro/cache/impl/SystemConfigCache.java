package com.weiweb.core.shiro.cache.impl;

import com.weiweb.admin.system.model.SysConfig;
import com.weiweb.core.shiro.cache.VCache;

public class SystemConfigCache{

	/**
	 * 根据名字获取系统实体
	 * 
	 * @param name
	 * @return
	 */
	public static SysConfig findByName(String name) {
		return VCache.getVByMap("sysMap", name, SysConfig.class);
	}

	/**
	 * 根据名字获取系统参数
	 * 
	 * @param name
	 * @return
	 */
	public static String findValueByName(String name) {
		SysConfig sysConfig=VCache.getVByMap("sysMap", name, SysConfig.class);
		return sysConfig == null ? "" : sysConfig.getParamValue();
	}

	
	
	

}
