package com.Files.Program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("E:\\Files\\Create file\\welcome.txt");
			f.write("Hi,I'm LOGANATHAN,i am a java Devoleper.");
			f.close();
			System.out.println("content is successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("Unexpectedly error");
			e.printStackTrace();
		}
		
		

	}

}
