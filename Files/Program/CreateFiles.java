package com.Files.Program;

import java.io.File;
import java.io.IOException;

public class CreateFiles {

	public static void main(String[] args) {
		
		File f=new File("E:\\Files\\sample\\loga.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("File Created");
			}
			else {
				System.out.println("File not created");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
