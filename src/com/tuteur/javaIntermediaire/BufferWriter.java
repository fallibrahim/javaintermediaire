package com.tuteur.javaIntermediaire;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		 
		File file = new File("test2.txt");
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
			
			bufferedWriter.write("Hello World!");
			bufferedWriter.newLine();
			bufferedWriter.write("Bonjour le monde!");
			bufferedWriter.newLine();
			bufferedWriter.write("Hola mundo!");
			
		}

	}

}
