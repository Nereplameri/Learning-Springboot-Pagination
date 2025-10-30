package com.alperenavci.controller;

import org.springframework.data.domain.Page;

import com.alperenavci.model.Personel;
import com.alperenavci.utils.RestPageableRequest;

public interface IRestPersonelController {
	public Page<Personel> findAllPageable(RestPageableRequest pageable);
}
