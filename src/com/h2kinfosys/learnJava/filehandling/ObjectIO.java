package com.h2kinfosys.learnJava.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// Copying Byte - No text files
// Copying character 
// Copy Lines - Buffer , printWriter
// StringBuffer , String Builder
// Object Output strea -- Searlizable - short creating accessors 
// ClassCastException - ClassNotFoundException, IOException, FileNotFoundException
public class ObjectIO {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee();
		emp.setEmpId(100);
		emp.setFirstName("David");
		emp.setLastName("Nix");
		
		try {
			FileOutputStream outFile = new FileOutputStream("C:\\RISHI\\H2K\\FileIO\\empOne.obj");
			ObjectOutputStream outStream = new ObjectOutputStream(outFile);
			
			outStream.writeObject(emp);
			outStream.close();
			
			FileInputStream inFile = new FileInputStream("C:\\RISHI\\H2K\\FileIO\\empOne.obj");
			ObjectInputStream inObj = new ObjectInputStream(inFile);
			
			try {
				Object obj = inObj.readObject();
				// How to check if object is instance of some class : use instanceof operator
				if(obj instanceof Employee) {
					Employee empRead = (Employee) obj; // casting - if not possible you get ClassCastException
					System.out.println(empRead.getFirstName() + "  " + empRead.getLastName());
				}
				inObj.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}finally {
			System.out.println("Done!");
		}
	}

}
