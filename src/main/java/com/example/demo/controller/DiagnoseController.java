package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Supplement;
import com.example.demo.form.DiagnoseForm;
import com.example.demo.service.GetDiseaseNameService;
import com.example.demo.service.GetSupplementService;

@Controller
public class DiagnoseController {
	@Autowired
	private GetDiseaseNameService getdiseaseNameService;

	@Autowired
	private GetSupplementService getSupplementService;

	@GetMapping("/index")
	public String getForm(@ModelAttribute("diagnoseForm") DiagnoseForm diagnose, BindingResult result, Model model) {
		model.addAttribute("Diagnose", new DiagnoseForm());
		return "index";
	}

	@PostMapping("/result")
	public String getResult(@ModelAttribute("diagnoseForm") DiagnoseForm diagnose, BindingResult result, Model model) {
		if (diagnose.isFormEmpty()) {
			return "redirect:/index";
		}
		String disease = getdiseaseNameService.getDiseaseName(diagnose);
		List<Supplement> supplementList = getSupplementService
				.getSupplement(getdiseaseNameService.getDiseaseNameList(diagnose));
		model.addAttribute("disease", disease);
		model.addAttribute("supplement", supplementList);
		return "result";
	}
}
