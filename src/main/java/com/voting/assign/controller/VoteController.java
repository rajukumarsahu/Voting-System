package com.voting.assign.controller;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.voting.assign.database.Data;

@RestController
public class VoteController {
	@Autowired
	Data data;
	@PostMapping("/castvote")
	public String castvote(@RequestParam String name) {
		if(data.vote(name)) {
			return "vote given";	
		}
		else {
			return "No User Present";
		}
	}
	
	@GetMapping("/countvote")
	public String countvote(@RequestParam String name) {
		Integer count=data.votecount(name);
		if(count==null) {
			return "No User found";
		}
		else {
			return name+" Vote count is :"+count;
			
		}
		
	}
	
	@PostMapping("/entercandidate")
	public String entercandidate(@RequestParam String name){
	  if(data.addcandidate(name)) {
		  return "candidate is added sucessfully";
		  }
	  else {
		  return "candidate is already present";
	  }
	}
	@GetMapping("/listvote")
	public Map<String,Integer> listvote(){
		return data.listvote();
	}
	@GetMapping("/getwinner")
	public String getwinner()
	{
		return "The Winner Is :"+data.getwinner();
	}
	
}
