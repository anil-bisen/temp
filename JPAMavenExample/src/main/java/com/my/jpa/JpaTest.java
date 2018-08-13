package com.my.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.my.jpa.entity.PatientImageData;
import com.my.jpa.entity.PatientImpressionData;
import com.my.jpa.service.PatientService;

public class JpaTest {

	public static void main(String[] args) {
		PatientService ps = new PatientService();
		ps.process();
		//insert2();
		System.out.println("END");
	}

	public static void insert() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("patientdata");
		EntityManager em = emf.createEntityManager();
		PatientImpressionData pid = null;
		em.getTransaction().begin();
		for (int i = 20; i < 30; i++) {
			pid = new PatientImpressionData();
			pid.setId(i);
			pid.setImpression("I" + i);
			pid.setpId("P" + i);
			pid.setSoId("S" + i);
			em.persist(pid);
		}

		em.getTransaction().commit();
	}
	
	public static void insert2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("patientdata");
		EntityManager em = emf.createEntityManager();
		PatientImageData pid = null;
		em.getTransaction().begin();
		for (int i = 1; i < 30; i++) {
			pid = new PatientImageData();
			pid.setId(i);
			pid.setpId("P" + i);
			pid.setSoId("S" + i);
			pid.setFilePath(pid.getpId() + "/" + pid.getSoId());
			pid.setFileName("file"+i+".txt");
			em.persist(pid);
		}

		em.getTransaction().commit();
	}
}
