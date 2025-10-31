package com.alperenavci.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alperenavci.controller.IRestPersonelController;
import com.alperenavci.model.Personel;
import com.alperenavci.service.IPersonelService;
import com.alperenavci.utils.RestPageableRequest;

@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController{
	
	@Autowired
	private IPersonelService personelService;
	
	@GetMapping("/list/pageable")
	@Override
	public Page<Personel> findAllPageable(@ModelAttribute RestPageableRequest pageable) {
		return personelService.findAllPageable(toPageable(pageable));
	}

}
