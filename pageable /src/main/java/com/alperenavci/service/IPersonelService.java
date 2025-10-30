package com.alperenavci.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alperenavci.model.Personel;

public interface IPersonelService {
	Page<Personel> findAllPageable(Pageable pageable);
}
