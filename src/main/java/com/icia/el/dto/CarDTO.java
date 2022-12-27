package com.icia.el.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CarDTO {
	
	private CarDTO() {
	}
	private CarDTO(String c_scail) {
		this.c_scail = c_scail;
	}

	
	//차 번호
	private String c_num;
	//차 제조사
	private String c_brand;
	//차 모델
	private String c_name;
	//차 크기 
//	tinyCar"  >경차
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
	private String img_dir_1;
	
	//view에서 차 모델과 차 등급이 같이 표시되게 함
}
