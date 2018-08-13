package com.my.jpa.service;

import java.util.List;

import com.my.jpa.common.Constants;
import com.my.jpa.entity.PatientImageData;
import com.my.jpa.repository.PatientRepository;
import com.my.jpa.util.FileUtility;

public class PatientService {

	PatientRepository repository = new PatientRepository();

	public void process() {
		int index = 0;
		// fetch first set
		List<PatientImageData> imageDataBatch = repository.getPatientImageData(index);
		while (imageDataBatch.size() > 0) {
			System.out.println("************** Batch " + index);
			for (PatientImageData pid : imageDataBatch) {
				// create destination directory
				String destAbsPath = FileUtility.createDirIfNotExists(Constants.NEW_BASE_LOCATION, pid.getFilePath());
				String sourceAbsPath = Constants.OLD_BASE_LOCATION + "/" + pid.getFilePath();

				boolean copySuccess = FileUtility.copyFile(sourceAbsPath, destAbsPath, pid.getFileName());
				if (!copySuccess) {
					System.out.println("Copy failed for " + pid.getSoId() + "    " + pid.getpId());
				}

			}
			index += Constants.BATCH_SIZE;
			imageDataBatch = repository.getPatientImageData(index);
		}
	}

}
