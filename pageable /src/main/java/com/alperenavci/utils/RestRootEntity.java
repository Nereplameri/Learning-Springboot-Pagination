package com.alperenavci.utils;

import org.springframework.http.HttpStatus;

import lombok.Data;

// Tüm çıktılar bu root varlık ile şekillenerek output olur.
@Data
public class RestRootEntity <T>{
	private Integer status;
	private T payload;
	private String errorMessage;
	
	public static <T> RestRootEntity<T> ok(T payload) {
		RestRootEntity<T> rootEntity = new RestRootEntity<>();
		rootEntity.setStatus(HttpStatus.OK.value());
		rootEntity.setErrorMessage(null);
		rootEntity.setPayload(payload);
		return rootEntity;
	}
}
