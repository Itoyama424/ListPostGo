package com.example.ListPostGo.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ApiCallController {
	
	@PostMapping(value="weather", produces = MediaType.APPLICATION_JSON_VALUE)
	public String call(Model model) {
		
		RestTemplate restTmplate = new RestTemplate();
		
		final String endpoint = "https://weather.tsukumijima.net/api/forecast/city/400040";
		
		ResponseEntity<String> response = restTmplate.getForEntity(endpoint, String.class);
		
		String json = response.getBody();
		
		model.addAttribute("apires", json);
		return "weather";
	}
	

}
