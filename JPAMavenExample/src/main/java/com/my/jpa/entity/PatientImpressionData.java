package com.my.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_impression_data", schema="public")
public class PatientImpressionData {
	
	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "soid")
	private String soId;
	
	@Column(name = "pid")
	private String pId;
	
	@Column(name = "impression")
	private String impression;
	
	public PatientImpressionData() {

	}



	public PatientImpressionData(long id, String soId, String pId, String impression) {
		super();
		this.id = id;
		this.soId = soId;
		this.pId = pId;
		this.impression = impression;
	}



	public String getSoId() {
		return soId;
	}

	public void setSoId(String soId) {
		this.soId = soId;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getImpression() {
		return impression;
	}

	public void setImpression(String impression) {
		this.impression = impression;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
