package com.h2kinfosys.learnJava.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
	
	public static void main(String[] args) throws IOException {
		// Reading - Input Stream - Byte - 
		// FileInputStream
		FileInputStream fileIn = null;
		// Writing a file with bytes - FileOutputStream
		FileOutputStream outFile = null;
		
		try {
			fileIn = new FileInputStream("/RISHI/H2K/FileIO/demofile.txt");
			outFile  = new FileOutputStream("/RISHI/H2K/FileIO/demofile_aug2019_byte.txt");
			int c = 0; // EOF c = -1
			while((c = fileIn.read()) != -1) {
				outFile.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			fileIn.close();
		}

	}

}
