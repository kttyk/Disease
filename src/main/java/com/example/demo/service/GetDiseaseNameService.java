package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.example.demo.common.MessageConst;
import com.example.demo.entity.Disease;
import com.example.demo.form.DiagnoseForm;
import com.example.demo.mapper.DiagnoseMapper;

@Service
public class GetDiseaseNameService {
	@Autowired
	private DiagnoseMapper diagnoseMapper;

	@Transactional
	public String getDiseaseName(DiagnoseForm form) {
		List<Disease> disease = diagnoseMapper.getDiseaseName(form);
		return this.convertDiseaseNameForDisplay(disease);
	}

	private String convertDiseaseNameForDisplay(List<Disease> disease) {
		if (CollectionUtils.isEmpty(disease)) {
			return MessageConst.MESSAGE_HEALTH;
		}

		String diseaseResult;

		if (disease.size() == 1) {
			diseaseResult = MessageConst.MESSAGE_YOU + disease.get(0).getDisease_name() + MessageConst.MESSAGE_IS;
		} else {
			List<String> diseases = disease.stream().map(d -> d.getDisease_name()).collect(Collectors.toList());
			diseaseResult = MessageConst.MESSAGE_DISAPPOINTIG + String.join("・", diseases) + MessageConst.MESSAGE_IS;
		}

		return diseaseResult;
	}

	public List<Disease> getDiseaseNameList(DiagnoseForm form) {
		return diagnoseMapper.getDiseaseName(form);
	}
}
