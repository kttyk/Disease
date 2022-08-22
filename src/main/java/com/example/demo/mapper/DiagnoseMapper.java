package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Disease;
import com.example.demo.form.DiagnoseForm;

@Mapper
public interface DiagnoseMapper {
//	List<Disease> findAll();
	List<Disease> getDiseaseName(DiagnoseForm form);
}
