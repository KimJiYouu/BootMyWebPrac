package com.prac.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topic")
public class TopicController {

	@GetMapping("/topicListAll")
	public String topicListAll() {
		return "topic/topicListAll";
	}
	
	@GetMapping("/topicListMe")
	public String topicListMe() {
		return "topic/topicListMe";
	}
	
	@GetMapping("/topicReg")
	public String topicReg() {
		return "topic/topicReg";
	}
	
	@GetMapping("/topicDetail")
	public String topicDetail() {
		return "topic/topicDetail";
	}
	
	@GetMapping("/topicModify")
	public String topicModify() {
		return "topic/topicModify";
	}
}
