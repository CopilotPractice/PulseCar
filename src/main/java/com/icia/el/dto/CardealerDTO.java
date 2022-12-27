package com.icia.el.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CardealerDTO {

	//차 번호
		private String c_num;
		//차 제조사
		private String c_brand;
		//차 모델
		private String c_name;
		//차 크기 
//		tinyCar"  >경차
	//  smallCar"   >소형차
	//  semi-midsizeCar"  >준중형차
	//  midsizeCar"  >중형차
	//  bigCar"  >대형차
	//  sportsCar"  >스포츠카
		private String c_scail;
		//차 등급
		private String c_grade;
		//차 연식
		private String c_year;
		//차 주행거리
		private int c_mile;
		//차 색깔
		private String c_coler;
		
		private String cp_price;
		private String cp_address;
		private String cp_content;
		
		private String dr_id;

		private String dr_pw;	

		private String dr_name;

		private String dr_phone;

		private String dr_email;

		private String dr_c_name;
		
		private String dr_c_address;
		
		private String dr_c_phone;
		
		private int dr_selling;
		
		private int dr_sold;
		
		private String dr_icon;
}