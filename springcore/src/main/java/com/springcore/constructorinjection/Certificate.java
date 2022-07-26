package com.springcore.constructorinjection;

public class Certificate {
	private Long certificateId;
	private String certificateName;
	
	public Certificate(Long certificateId, String certificateName) {
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}
	
	public Long getCertificateId() {
		return this.certificateId;
	}
	public String getCertificateName() {
		return this.certificateName;
	}
	
	@Override
	public String toString() {
		return this.certificateId + " : " + this.certificateName;
	}
	
	
	
}
