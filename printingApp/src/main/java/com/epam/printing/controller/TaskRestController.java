package com.epam.printing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.printing.service.NoteServiceImple;

@RestController
@RequestMapping("/")
public class TaskRestController {

	@Autowired
	NoteServiceImple noteService;

	@GetMapping("message/{name}")
	public ResponseEntity<String> printMessage(@PathVariable String name) {
		String message = null;
		ResponseEntity<String> responseEntity;
		message = noteService.getMessage(name);
		responseEntity = new ResponseEntity<>(message, HttpStatus.OK);
		return responseEntity;
	}
}
