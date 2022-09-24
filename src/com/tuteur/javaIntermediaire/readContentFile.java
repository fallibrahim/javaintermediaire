package com.tuteur.javaIntermediaire;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class readContentFile {



	public static void main(String[] args) throws IOException {
		
		
		   Path path = Paths.get("nice/go.txt");
	
		   List<String> listes  = Files.readAllLines(path, Charset.forName("ISO-8859-1"));
		       
		   for(String list : listes) {
		    	   
		      JOptionPane.showMessageDialog(null, list);
		  }

	}

}
