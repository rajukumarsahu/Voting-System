package com.voting.assign.database;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.voting.assign.model.Candidate;

@Service
public class Data {
	static Map<String,Integer> person=new HashMap<>();
	
	public Boolean addcandidate(String name)
	{
	  if(!person.containsKey(name)) {
		  Candidate candidate=new Candidate();
		  candidate.setName(name);
		  candidate.setVote(0);
		  person.put(candidate.getName(),candidate.getVote());
		  return true;
	  }
	  else {
		  return false;
	  }
	}
	public boolean vote(String name) {
		
		if(person.containsKey(name)) {
			person.put(name,person.get(name)+1);
		}
		else {
			return false;
		}
		System.out.println(person);
		return true;
		
	}
	public Integer votecount(String name) {
		Integer count=person.get(name);
		return count;
	}
	public Map<String, Integer> listvote() {
		return person;
	}
	
	public Entry<String, Integer> getwinner() {
		Map.Entry<String,Integer> maxEntry = null;

		for (Map.Entry<String,Integer> entry : person.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		return maxEntry;
		
	}
	
	
}
