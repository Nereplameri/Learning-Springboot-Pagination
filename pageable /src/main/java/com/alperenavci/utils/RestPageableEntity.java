package com.alperenavci.utils;

import java.util.List;

import lombok.Data;

// JSON olarak bu yazılacak.
@Data
public class RestPageableEntity<T> {
	
	private List<T> content; // Dto gelecek
	private int pageNumber;
	private int pageSize;
	private Long totalElements;
	
}
