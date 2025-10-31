package com.alperenavci.controller;


import com.alperenavci.dto.DtoPersonel;
import com.alperenavci.utils.RestPageableEntity;
import com.alperenavci.utils.RestPageableRequest;
import com.alperenavci.utils.RestRootEntity;

public interface IRestPersonelController {
	public RestRootEntity<RestPageableEntity<DtoPersonel>> findAllPageable(RestPageableRequest pageable);
}
