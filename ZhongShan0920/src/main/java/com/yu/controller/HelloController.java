package com.yu.controller;

import com.yu.util.Log4jUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hehe.do")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        Log4jUtil.logger.debug("qqqqqqqqqqqqqqqqqqqq");
		return "hello";
	}

}