package com.wecode.bookStore.dto;

public class BookDto {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookDto(String title) {
		super();
		this.title = title;
	}
	

}
