package crudlemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeyController {

	@RequestMapping("/")
	public String hello() {
		return "ooopaa";
	}
		
}
