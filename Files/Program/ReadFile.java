package com.Files.Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File f=new File("E:\\Files\\Create file\\logu.txt");
	
			try {
				Scanner in=new Scanner(f);
			
				while(in.hasNextLine()) {
				String data=in.nextLine();
					System.out.println(data);
				
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		



	}

}
