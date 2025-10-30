package com.alperenavci.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoPersonel {
	private Long id;
	private String firstName;
	private String lastName;
	private DtoDepartment department;
}