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
	
	StringBuilder sb = new StringBuilder();
	
	@Transactional
	public List<Supplement> getSupplement(List<Disease> disease) {
		for(Disease d:disease) {
			String dName = "'" + d.getDisease_name() + "'";
			if(disease.size() > 1) {
				
			}
//		if(disease.size() > 1) {
//			sb.append(dName + ',');
//		}
		}
		return supplementMapper.getSupplement(disease);
	}
}