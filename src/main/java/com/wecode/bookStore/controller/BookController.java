package com.wecode.bookStore.controller;

import org.springframework.web.bind.annotation.*;
import com.wecode.bookStore.dto.BookDto;
import java.util.*;
import org.springframework.http.*; 
import lombok.Builder;
@RestController
@RequestMapping("api/v1/books")
public class BookController {
	
	@GetMapping
	public ResponseEntity<List<BookDto>> getBooks()
	{
		BookDto book=new BookDto("hii my 1st book");
		List<BookDto> books=new ArrayList<>();
		books.add(book);
		System.out.println(books);
		return ResponseEntity.ok(books);
		
	}
	

}
