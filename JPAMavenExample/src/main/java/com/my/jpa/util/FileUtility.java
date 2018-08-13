package com.my.jpa.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileUtility {

	public static String createDirIfNotExists(String baseDir, String dir) {
		String fullPath = baseDir + "/" + dir;
		File d = new File(fullPath);
		if (!d.exists()) {
			d.mkdirs();
		}
		return d.getAbsolutePath();
	}
	
	public static boolean copyFile(String sourceDir, String destDir, String fileName) {
		boolean success = false;
		File srcFile = new File(sourceDir+"/"+fileName);
		File destFile = new File(destDir+"/"+fileName);
		try {
			Files.copy(srcFile.toPath(), destFile.toPath());
			success = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return success;
	}
}
