package com.alperenavci.controller;

import org.springframework.data.domain.Page;

import com.alperenavci.model.Personel;

public interface IRestPersonelController {
	public Page<Personel> findAllPageable(int pageNumber, int pageSize);
}
