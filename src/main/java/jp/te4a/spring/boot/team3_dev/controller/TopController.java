package jp.te4a.spring.boot.team3_dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopController {
	
	@GetMapping(path="top")
	String loginForm() {
		return "top";
	}
}
