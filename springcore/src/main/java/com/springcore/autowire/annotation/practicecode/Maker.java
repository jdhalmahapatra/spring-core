package com.springcore.autowire.annotation.practicecode;

public class Maker {
	private String makerName;
	private String headoffice;
	
	public String getMakerName() {
		return makerName;
	}
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
	public String getHeadoffice() {
		return headoffice;
	}
	public void setHeadoffice(String headoffice) {
		this.headoffice = headoffice;
	}
	
	@Override
	public String toString() {
		return "Maker [makerName=" + makerName + ", headoffice=" + headoffice + "]";
	}
		
	
}
