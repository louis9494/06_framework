package edu.kh.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Maincontroller {

	@RequestMapping("/")
	public String mainPage() {
		// forward : 요청 위임
		
		// thymeleaf : Spring Boot에서 사용하는 템플릿 엔진 (html 파일 사용)
		
		// thymeleaf 를 이용한 html 파일로 forward 시
		// 사용되는 접두사, 접미사가 존재
		
		// 접두사 : classpath:/templates/
		// 접미사 : .html
		
		// -> classpath:/templates/common/main.html
		return "commeon/main";
	}
}
