package com.epam.printing.service;

import org.springframework.stereotype.Service;

@Service
public class NoteServiceImple implements NoteService {

	@Override
	public String getMessage(String name) {
		return "Hello! "+name;
	}
}
