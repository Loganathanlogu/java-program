package com.Files.Program;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		File c= new File("E:\\Files\\sample\\logu.txt");
		File copy= new File("E:\\Files\\sample\\loganathan.txt");
		try {
			
			Files.copy(c.toPath(),copy.toPath());//copy method
			Scanner sc=new Scanner(copy);//object to read a copy file
			System.out.println("The file is copied");
			while(sc.hasNextLine()) {
				String read=sc.nextLine();
				System.out.println(read);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
