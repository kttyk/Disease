package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Disease;
import com.example.demo.form.DiagnoseForm;
import com.example.demo.mapper.DiagnoseMapper;

@Service
public class GetDiseaseNameService {
	@Autowired
	private DiagnoseMapper diagnoseMapper;
	
	@Transactional
	public List<Disease> getDiseaseName(DiagnoseForm form) {
		return diagnoseMapper.getDiseaseName(form);
	}
}
