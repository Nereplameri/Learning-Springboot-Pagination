package com.alperenavci.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alperenavci.controller.IRestPersonelController;
import com.alperenavci.model.Personel;
import com.alperenavci.service.IPersonelService;

@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl implements IRestPersonelController{
	
	@Autowired
	private IPersonelService personelService;
	
	@GetMapping("/list/pageable")
	@Override
	public Page<Personel> findAllPageable(@RequestParam(value = "pageNumber") int pageNumber, 
										  @RequestParam(value = "pageSize") int pageSize) {
		
		
		PageRequest pageable = PageRequest.of(pageNumber, pageSize, Sort.by(Direction.DESC, "id"));
		// PageRequest, Pageable 'yi implament ettiği için pageable veri türü olarak kullanıyoruz
		return personelService.findAllPageable(pageable);
	}

}
