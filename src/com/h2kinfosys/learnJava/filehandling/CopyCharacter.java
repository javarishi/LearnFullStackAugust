package com.h2kinfosys.learnJava.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {

	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			reader = new FileReader("/RISHI/H2K/FileIO/demofile.txt");
			writer = new FileWriter("/RISHI/H2K/FileIO/demofile_aug2019_chara.txt");
			
			int c = 0;
			while((c= reader.read()) != -1) {
				writer.write(c);
			}
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
		finally {
			reader.close();
			writer.close();
		}
	}

}
