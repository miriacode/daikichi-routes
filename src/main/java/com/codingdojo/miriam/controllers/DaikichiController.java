package com.codingdojo.miriam.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping(value="",method=RequestMethod.GET)
	public String deployWelcome() {
		return "<h1>Welcome!</h1>";
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String deployToday() {
		return "<h1>Today, you'll find luck in your endeavors!</h1>";
	}
	
	@RequestMapping(value="/tomorrow", method=RequestMethod.GET)
	public String deployTomorrow() {
		return "<h1>Tomorrow, an opportunity will arise, so be sure to be open to new ideas!</h1>";
	}
	
	@RequestMapping(value="/travel/{destino}",method=RequestMethod.GET)
	public String deployTravel(@PathVariable("destino") String destination) {
		return "<h1>Congratulations! You will soon travel to " + destination + ". </h1>";
	}
	
	@RequestMapping(value="/lotto/{numero}", method=RequestMethod.GET)
	public String randomNumber(@PathVariable("numero") Integer number) {
		String response = "<h1>";
		if(number % 2 ==0) {
			response += "You will take a grand journey in the near future, but be aware of tempting offers.";
		}else {
			response += "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
		}
		response += "</h1>";
		return response;
	}
}
