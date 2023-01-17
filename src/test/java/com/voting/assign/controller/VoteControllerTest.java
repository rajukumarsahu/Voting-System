package com.voting.assign.controller;

import java.util.UUID;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;

import com.voting.assign.model.Candidate;

public class VoteControllerTest {

	private final VoteController voteController=new VoteController();
	private final UUID defaultUuid=UUID.fromString("fc3731b6-968b-11ed-a1eb-0242ac120002");
	  
	@Autowired
    @MockBean
   
    private VoteController voteController1;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void enterCandidate(){
//       MockedStatic<UUID>mockedStatic=Mockito.mockStatic(UUID.class){
//    	   mockedStatic.when(UUID::randomUUID).thenReturn(defaultUuid);
//    	   Order result=CutAction; 
       }
    
    	
    	
    }

