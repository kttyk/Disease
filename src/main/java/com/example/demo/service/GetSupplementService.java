package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Disease;
import com.example.demo.entity.Supplement;
import com.example.demo.mapper.SupplementMapper;

@Service
public class GetSupplementService {
	@Autowired
	private SupplementMapper supplementMapper;
	
	@Transactional
	public List<Supplement> getSupplement(List<Disease> disease) {
		String diseaseName = convertDisease(disease);

		return supplementMapper.getSupplement(diseaseName);
	}
	public String convertDisease(List<Disease> disease) {
		if (disease.size() > 1) {
			return "その他";
		}else if (disease.size() == 1) {
			return disease.get(0).getDiseaseName();
		}
		return "";
	}
}