package com.Files.Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeleteFile {

	public static void main(String[] args) {
				
		File f=new File("E:\\Files\\Create file\\loga.txt");
			
			if(f.delete()) {
				System.out.println(f.getName()+" The file is successfully deleted");
			}else {
				System.out.println(" The file is Not delete");
			}
	
	 
		

	}

}
