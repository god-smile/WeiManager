package com.weiweb.admin.gen.dao;

import java.util.List;
import java.util.Map;



public interface SysGeneratorMapper {

	Map<String, String> queryTable(String tableName);
	
	List<Map<String, String>> queryColumns(String tableName);
	
}
