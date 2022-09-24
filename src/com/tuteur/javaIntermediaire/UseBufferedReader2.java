package com.tuteur.javaIntermediaire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UseBufferedReader2 {

	public static void main(String[] args) {
		
		try (BufferedReader bR = new BufferedReader(new FileReader("momo/goMyCode.txt"))) {
			String line;
			while((line = bR.readLine()) != null) {
				System.out.println(line);
			}
		
     } catch (IOException e) {

		e.printStackTrace();
	}

}
	
}

