package com.example.demo.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiagnoseForm {
	
//	private int diseaseId;
//	private int diagnosticId;
//	private int baseValue;
//	private String diseaseName;
	private int kettochi;
	private double hba1c;
	private int kakutyo;
	private int syusyuku;
	private int hdl;
	private int ldl;
	private int tg;
	private String diseaseName;

//    public int get() {
//        if (kettochi >= 200 && hba1c >= 6.5){
//        	int a = 2;
//           return a;
//        } else {
//        	return 0;
//        }
//    }

}

