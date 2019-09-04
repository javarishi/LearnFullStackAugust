package com.h2kinfosys.learnJava.filehandling;

import java.io.File;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		File file = new File("C:\\RISHI\\H2K\\FileIO\\demofile.txt");
		File fileNotExists = new File("C:\\RISHI\\H2K\\FileIO\\demofile_donestExists.txt");
		try {
			if(fileNotExists.exists()) {
				System.out.println("File Exists!");
			}else {
				System.out.println("Not exists");
				fileNotExists.createNewFile();
			}
			
			System.out.println("file.getName() :: " + file.getName());
			System.out.println("file.getAbsolutePath() :: " + file.getAbsolutePath());
			System.out.println("file.getCanonicalPath() :: " + file.getCanonicalPath());
			System.out.println("file.getParent() :: " + file.getParent());
			System.out.println("file.getPath() :: " + file.getPath());
			
			
			if(file.canRead()) System.out.println("file.canRead()");
			if(file.canWrite()) System.out.println("file.canWrite()");
			if(file.canExecute()) System.out.println("file.canExecute()");
			
			File dirFile = new File("C:\\RISHI\\H2K\\FileIO");
			if(dirFile.isDirectory()) System.out.println("dirFile.isDirectory()");
			
			File[] listFiles = dirFile.listFiles();
			File aug2019Dir = new File("C:\\RISHI\\H2K\\FileIO\\aug2019");
			
			if(!aug2019Dir.exists()) {
				aug2019Dir.mkdir();
			}
			
			String augFileName = null;
			for(File eachFile : listFiles) {
				System.out.println(eachFile.getName());
				
				if(eachFile.getName().indexOf("aug2019") != -1) {
					augFileName = aug2019Dir.getPath() + "\\" + eachFile.getName();
					eachFile.renameTo(new File(augFileName));
				}
				
				if(eachFile.getName().indexOf("demo") ==  -1) {
					System.out.println(eachFile.getName() + " Deleted !! " + eachFile.delete());
				}
			}
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		

	}

}
