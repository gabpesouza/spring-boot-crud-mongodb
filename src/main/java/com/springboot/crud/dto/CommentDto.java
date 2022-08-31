package com.springboot.crud.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String comment;
	private Date date;
	private AuthorDto author;

	
	public CommentDto() {
		
	}
	
	
	
	public CommentDto(String comment, Date date,AuthorDto author) {
		super();
		this.comment = comment;
		this.date = date;
		this.author = author;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public AuthorDto getAuthor() {
		return author;
	}
	
	public void setAuthor(AuthorDto author) {
		this.author = author;
	}

}
