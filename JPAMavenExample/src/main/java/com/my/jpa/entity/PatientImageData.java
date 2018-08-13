package com.my.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_image_data")
public class PatientImageData {

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "soid")
	private String soId;

	@Column(name = "pid")
	private String pId;

	@Column(name = "filepath")
	private String filePath;

	@Column(name = "filename")
	private String fileName;

	public PatientImageData() {

	}

	public PatientImageData(long id, String soId, String pId, String filePath, String fileName) {
		super();
		this.id = id;
		this.soId = soId;
		this.pId = pId;
		this.filePath = filePath;
		this.fileName = fileName;
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

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
