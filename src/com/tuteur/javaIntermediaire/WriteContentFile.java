package com.tuteur.javaIntermediaire;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteContentFile 
{

	public static void main(String[] args) throws IOException 
	{
		
	  Path path = Paths.get("momo/goMyCode.txt");
	  String texte = "je suis cool! mère";
      Files.write(path, texte.getBytes(StandardCharsets.UTF_8),
	  StandardOpenOption.CREATE,
	  StandardOpenOption.WRITE,StandardOpenOption.APPEND);
		  
	}

}
