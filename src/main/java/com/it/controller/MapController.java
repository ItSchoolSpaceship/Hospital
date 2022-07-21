package com.it.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
	@GetMapping("/list.map")
	public String map(HttpSession session) {
		session.setAttribute("category", "map");
		return "map";
	}

}
