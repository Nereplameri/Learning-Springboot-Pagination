package com.alperenavci.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alperenavci.dto.DtoPersonel;
import com.alperenavci.model.Personel;

public interface IPersonelService {
	Page<Personel> findAllPageable(Pageable pageable);
	List<DtoPersonel> toDTOList(List<Personel> personelList);
}
