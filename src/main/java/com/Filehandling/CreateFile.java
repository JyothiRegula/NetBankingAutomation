package com.Filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* Create a fille in java using
 * 1. File
 * 2. FileOutstream
 * 3. java NIO utils
 * 
 */

public class CreateFile {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\JyothiRegula\\Downloads\\Filehandle\\sample.txt ";
		
		// 1. using file
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if(flag) {
				System.out.println(" file is created");
			}
			else {
				System.out.println("file is already present....");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		/*// 2. FileOutputtStream along with scanner
		try {
				Scanner sc  = new Scanner(System.in);
				System.out.println("enter the file name with location path:");
				String fileName= sc.nextLine();
				
				
				FileOutputStream fos = new FileOutputStream(fileName, true);
				System.out.println("enter the file content: ");
				String content = sc.nextLine();
				byte b[]= content.getBytes();
				fos.write(b);
				fos.close();
				System.out.println("file is saved on the given location path");
				
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}*/
		// 3. java NIO package
		
		try {	
				Path pathlocation= Paths.get("C:\\Users\\JyothiRegula\\Downloads\\Filehandle\\sample3.txt");
			    Path newPath= Files.createFile(pathlocation);
			    System.out.println("new file is created at:"+newPath);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
