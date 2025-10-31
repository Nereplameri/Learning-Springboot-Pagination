package com.alperenavci.controller;

import java.util.List;

import org.springframework.data.domain.Page;

import com.alperenavci.dto.DtoPersonel;
import com.alperenavci.model.Personel;
import com.alperenavci.utils.RestPageableEntity;
import com.alperenavci.utils.RestPageableRequest;

public interface IRestPersonelController {
	public RestPageableEntity<DtoPersonel> findAllPageable(RestPageableRequest pageable);
}
