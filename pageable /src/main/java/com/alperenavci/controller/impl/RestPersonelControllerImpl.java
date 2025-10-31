package com.alperenavci.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
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
import com.alperenavci.dto.DtoDepartment;
import com.alperenavci.dto.DtoPersonel;
import com.alperenavci.model.Personel;
import com.alperenavci.service.IPersonelService;
import com.alperenavci.utils.RestPageableEntity;
import com.alperenavci.utils.RestPageableRequest;

@RestController
@RequestMapping("/rest/api/personel")
public class RestPersonelControllerImpl extends RestBaseController implements IRestPersonelController{
	
	@Autowired
	private IPersonelService personelService;
	
	@GetMapping("/list/pageable")
	@Override
	public RestPageableEntity<DtoPersonel> findAllPageable(@ModelAttribute RestPageableRequest pageable) {
		Page<Personel> page = personelService.findAllPageable(toPageable(pageable));
		RestPageableEntity<DtoPersonel> pageableResponse = toPageableResponse(page, personelService.toDTOList(page.getContent()));
		return pageableResponse;
	}
}
