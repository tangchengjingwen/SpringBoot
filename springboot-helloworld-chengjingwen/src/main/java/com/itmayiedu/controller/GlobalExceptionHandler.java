package com.itmayiedu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String, Object> exceptionHandle() {
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("error", "系统错误");
		return hashMap;
	}
}
