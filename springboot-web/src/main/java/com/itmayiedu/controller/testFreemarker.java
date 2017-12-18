package com.itmayiedu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class testFreemarker {
	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name", "美丽的迪丽热巴");
		List<String> list = new ArrayList<String>();
		list.add("唐成靖文");
		list.add("❤");
		list.add("迪丽热巴");
		map.addAttribute("list", list);
		return "index";
	}
}
