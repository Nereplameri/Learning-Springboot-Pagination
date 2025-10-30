package com.alperenavci.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.alperenavci.model.Personel;
import com.alperenavci.repository.PersonelRepository;
import com.alperenavci.service.IPersonelService;

@Service
public class PersonelServiceImpl implements IPersonelService{

	@Autowired
	private PersonelRepository personelRepository;
	
	@Override
	public Page<Personel> findAllPageable(Pageable pageable) {
		return personelRepository.findAllPageable(pageable);
	}
	
}
