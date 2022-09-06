package com.example.demo.form;

import lombok.Data;

@Data
public class DiagnoseForm {
	private Integer kettochi;
	private double hba1c;
	private Integer kakutyo;
	private Integer syusyuku;
	private Integer hdl;
	private Integer ldl;
	private Integer tg;
	
	public boolean isFormEmpty() {
		return kettochi == null && 
			   hba1c == 0 &&
			   kakutyo == null &&
			   syusyuku == null &&
			   hdl == null &&
			   ldl == null &&
			   tg == null;
		}

}
