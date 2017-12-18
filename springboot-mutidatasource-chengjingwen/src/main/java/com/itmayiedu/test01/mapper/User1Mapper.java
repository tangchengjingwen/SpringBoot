package com.itmayiedu.test01.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface User1Mapper {
	@Insert("insert into user values(null,#{name},#{age})")
	public int  addUser(@Param("name")String name, @Param("age")Integer age);
}
