package jp.te4a.spring.boot.team3_dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditController {
	
	@GetMapping(path="equipment/edit")
	String loginForm() {
		return "equipment/edit";
	}
}