package com.cam.employees;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexView {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}