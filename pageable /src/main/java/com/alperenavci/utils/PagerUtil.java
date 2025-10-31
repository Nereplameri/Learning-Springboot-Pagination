package com.alperenavci.utils;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import lombok.experimental.UtilityClass;

@UtilityClass
public class PagerUtil {
	
	// URL ile girilen field'lerden "columnName" nin boş olup olmadığına bakacak araç
	public boolean isNullOrEmpty(String value) {
		return value == null || value.trim().length() == 0;
	}
		
	
	public Pageable toPageable(RestPageableRequest request) {
		if (!isNullOrEmpty(request.getColumName())) {
			// filitreleme yapılacak
			Sort sortBy = request.isAsc() ? Sort.by(Direction.ASC, request.getColumName())
					: Sort.by(Direction.DESC, request.getColumName());
			return PageRequest.of(request.getPageNumber(), request.getPageSize(), sortBy);
		}
		return PageRequest.of(request.getPageNumber(), request.getPageSize());
	}
}
