package com.alperenavci.utils;

import lombok.Data;

@Data
public class RestPageableRequest {
	private int pageNumber;
	private int pageSize;
	private String columName;
	private boolean asc;
}
