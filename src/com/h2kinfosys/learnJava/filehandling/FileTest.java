package com.h2kinfosys.learnJava.filehandling;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:\\RISHI\\H2K\\FileIO\\demofile.txt");
		File dirFile = new File("C:\\RISHI\\H2K\\FileIO");
		try {
			if(file.exists()) {
				System.out.println("File Exists!!");
			}else{
					file.createNewFile();
			}
			
			System.out.println("file.getName() :: " + file.getName());
			System.out.println("file.getAbsolutePath() :: " + file.getAbsolutePath());
			System.out.println("file.getPath() " + file.getPath());
			System.out.println("file.getParent() " +file.getParent());
			System.out.println("file.getCanonicalPath() " + file.getCanonicalPath());
			
			if (file.canRead()) System.out.println("Can Read");
			if (file.canWrite()) System.out.println("Can Write");
			if (file.canExecute()) System.out.println("Can Execute");
			if(dirFile.isDirectory()) System.out.println("Is Directory");
			
			System.out.println("***** Listing all File Names from Directory **** ");
			File[] files = dirFile.listFiles();
			
			String objectDirectory = "C:\\RISHI\\H2K\\FileIO\\ObjFiles";
			File newDir = new File(objectDirectory);
			if(!newDir.exists()) {
				boolean isCreated = newDir.mkdir(); // creates a directory
				System.out.println("Directory Created :: " + isCreated);
			}
			String objFile = null;
			for(File eachFile : files) {
				if(eachFile.getName().indexOf(".obj") != -1) {
					objFile = objectDirectory + "\\" + eachFile.getName();
					System.out.println(objFile);
					eachFile.renameTo(new File(objFile));
				}
				if(eachFile.getName().indexOf("Nov18") != -1) {
					System.out.println(eachFile.getName() + " Deleted !!" + eachFile.delete());
				}
			}
			
			
			
			
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
