package com.hw.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class FoodDTO {
	 private String seq, productClsCode, productClsName,  categoryCode, categoryName, productno,
     lastestDay, productName, itemName ,  unit, day1,
     dpr1, day2, dpr2, day3, dpr3, day4, dpr4, direction, price;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getProductClsCode() {
		return productClsCode;
	}

	public void setProductClsCode(String productClsCode) {
		this.productClsCode = productClsCode;
	}

	public String getProductClsName() {
		return productClsName;
	}

	public void setProductClsName(String productClsName) {
		this.productClsName = productClsName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getProductno() {
		return productno;
	}

	public void setProductno(String productno) {
		this.productno = productno;
	}

	public String getLastestDay() {
		return lastestDay;
	}

	public void setLastestDay(String lastestDay) {
		this.lastestDay = lastestDay;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDay1() {
		return day1;
	}

	public void setDay1(String day1) {
		this.day1 = day1;
	}

	public String getDpr1() {
		return dpr1;
	}

	public void setDpr1(String dpr1) {
		this.dpr1 = dpr1;
	}

	public String getDay2() {
		return day2;
	}

	public void setDay2(String day2) {
		this.day2 = day2;
	}

	public String getDpr2() {
		return dpr2;
	}

	public void setDpr2(String dpr2) {
		this.dpr2 = dpr2;
	}

	public String getDay3() {
		return day3;
	}

	public void setDay3(String day3) {
		this.day3 = day3;
	}

	public String getDpr3() {
		return dpr3;
	}

	public void setDpr3(String dpr3) {
		this.dpr3 = dpr3;
	}

	public String getDay4() {
		return day4;
	}

	public void setDay4(String day4) {
		this.day4 = day4;
	}

	public String getDpr4() {
		return dpr4;
	}

	public void setDpr4(String dpr4) {
		this.dpr4 = dpr4;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
