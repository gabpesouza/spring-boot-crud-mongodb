package com.springboot.crud.services.exception;

import com.springboot.crud.domain.User;

public class ObjectNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String id) {
		super("Objeto nao encontrado, id: " + id);
	}
		
	

}
