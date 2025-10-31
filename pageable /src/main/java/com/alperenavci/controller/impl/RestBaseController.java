package com.alperenavci.controller.impl;

import org.springframework.data.domain.Pageable;

import com.alperenavci.utils.PagerUtil;
import com.alperenavci.utils.RestPageableRequest;

public class RestBaseController {
	
	public Pageable toPageable(RestPageableRequest request) {
		return PagerUtil.toPageable(request);
	}
}
