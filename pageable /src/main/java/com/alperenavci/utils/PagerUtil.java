package com.alperenavci.utils;

import java.util.List;

import org.springframework.data.domain.Page;
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
	
	// Content 'i ayrı, bütün page bilgilerini ayrı bir yerden alıp birleştirme işlemi.
	// page 'nin içinde page.getcontent() zaten var ama 
	// biz onu DTO ya çevrilmiş halini parametre olarak vereceğiz.
	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
		
		RestPageableEntity<T> pageableEntity = new RestPageableEntity<>();
		pageableEntity.setContent(content);
		pageableEntity.setPageNumber(page.getPageable().getPageNumber());
		pageableEntity.setPageSize(page.getPageable().getPageSize());
		pageableEntity.setTotalElements(page.getTotalElements());
		return pageableEntity;
	}
}
