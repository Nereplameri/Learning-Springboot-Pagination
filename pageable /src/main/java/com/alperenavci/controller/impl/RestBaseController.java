package com.alperenavci.controller.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alperenavci.utils.PagerUtil;
import com.alperenavci.utils.RestPageableEntity;
import com.alperenavci.utils.RestPageableRequest;
import com.alperenavci.utils.RestRootEntity;

// Controller 'de karmaşayı azltmak için vardır.
public class RestBaseController {
	
	public Pageable toPageable(RestPageableRequest request) {
		return PagerUtil.toPageable(request);
	}
	
	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
		return PagerUtil.toPageableResponse(page, content);
	}
	
	public <T> RestRootEntity<T> ok(T payload){
		return RestRootEntity.ok(payload);
	}
	
}
