package com.h2kinfosys.learnJava.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		FileWriter writer = null;
		FileWriter pwriter = null;
		BufferedReader bufferRead = null;
		BufferedWriter bufferWriter = null;
		PrintWriter printWriter = null;
		try {
			reader = new FileReader("/RISHI/H2K/FileIO/demofile.txt");
			bufferRead = new BufferedReader(reader);
			
			writer = new FileWriter("/RISHI/H2K/FileIO/demofile_aug2019_bufferWrite1.txt");
			bufferWriter = new BufferedWriter(writer);

			pwriter = new FileWriter("/RISHI/H2K/FileIO/demofile_aug2019_printWrite1.txt");
			printWriter = new PrintWriter(pwriter);
			
			String line = null;
			// EOF line = null
			StringBuffer strBuffer = new StringBuffer();
			StringBuilder builder = new StringBuilder();
			while((line = bufferRead.readLine())!= null) {
				strBuffer.append(line);
				strBuffer.append("\n");
				builder.append(line);
				builder.append("\n");
			}
			bufferWriter.write(strBuffer.toString());
			printWriter.println(builder.toString());
			System.out.println(builder.toString());
			
			/* while((line = bufferRead.readLine()) != null) {
				System.out.println(line);
				bufferWriter.write(line + "\n");
				printWriter.write(line);
				printWriter.write("\n");
			}*/
			
		}catch(IOException ioEx) {
			ioEx.printStackTrace();
		}
		finally {
			bufferRead.close();
			bufferWriter.flush(); // anything waiting to write - will be written
			bufferWriter.close();
			printWriter.close();
		}
	}

}
