package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.response.Response;
import com.example.demo.services.WaveCacheServiceImpl;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/wave")
public class WaveController {

    @Autowired
    private WaveCacheServiceImpl waveCacheService;
    
    /**
     * This method update client.
     * @param registrationDTO
     * @param request
     * @return
     */
    @PostMapping("/test")
    public ResponseEntity<Response> onUpdate(/*@RequestBody PersonDTO personDTO, */HttpServletRequest request) {
        try {
        	return new ResponseEntity<>(new Response("Test success"), HttpStatus.OK);        	
//        	Client client = userService.getClientById(personDTO.getId());
//    		
//    		if (client != null) {
//	    		if (userService.update(personDTO.fromClientDTO())) {
//		    		return new ResponseEntity<>(new Message("/client/update", "Success"), HttpStatus.OK);
//		    	}
//    		} else {
//	    		return new ResponseEntity<>(new Message("/client/update", "ID not found"), HttpStatus.NOT_FOUND);
//    		}
        } catch (Exception ex) {
        	ex.toString();
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
