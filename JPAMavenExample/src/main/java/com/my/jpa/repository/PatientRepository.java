package com.my.jpa.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.my.jpa.common.Constants;
import com.my.jpa.entity.PatientImageData;

public class PatientRepository {

	private static EntityManager entityManager;

	private static String query_fetch_image_data_by_impression = "select pimage from PatientImpressionData pid, PatientImageData pimage where pimage.soId = pid.soId and pimage.pId = pid.pId and pid.impression like '%thrombosis%'";

	public PatientRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("patientdata");
		entityManager = emf.createEntityManager();

	}

	public List<PatientImageData> getPatientImageData(int index) {

		List<PatientImageData> data = entityManager.createQuery(query_fetch_image_data_by_impression)
				.setFirstResult(index).setMaxResults(Constants.BATCH_SIZE).getResultList();
		
		return data;
	}

}
