package com.Files.Program;

import java.io.File;

public class GetFilesInformation {

	public static void main(String[] args) {
		File f=new File("E:\\Files\\Create file\\logu.txt");
		if(f.exists()) {
			System.out.println("The file name is: "+f.getName());//geting file name
			System.out.println("The file path is: "+f.getAbsolutePath());
			System.out.println("The file is readable?: "+f.canRead());
			System.out.println("The file is writeable?: "+f.canWrite());
			System.out.println("The file length is: "+f.length());
		}else
		{
			System.out.println("The file is not exists");
		}

	}

}
