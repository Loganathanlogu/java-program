package com.Files.Program;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		
		File name=new File("E:\\Files\\sample\\loga.txt");
		File rename = new File("E:\\Files\\sample\\loganathan.txt");
		if(name.renameTo(rename)) {
			System.out.println("The file is renamed successfully");
	}else {
		System.out.println("Unexcepted error");
	}

}
}
