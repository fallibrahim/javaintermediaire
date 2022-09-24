package com.tuteur.javaIntermediaire;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FichierDriver {

	public static void main(String[] args) throws IOException {
		
    Path source = Paths.get("fichier_test.txt");
	
	Path destination = Paths.get("fichier_copie.txt");
	
	// je vais essayer de copier le fichier de l'objet source vers la destination
	Files.copy(source, destination,StandardCopyOption.REPLACE_EXISTING);
	
	Files.delete(destination);
//	System.out.println(path);
//	JOptionPane.showMessageDialog(null, path.getName(0));
//	JOptionPane.showMessageDialog(null, path.toRealPath(LinkOption.NOFOLLOW_LINKS));
	
	Path dossierNice = Paths.get("nice");
	if (!Files.exists(dossierNice)) {
		
		Files.createDirectory(dossierNice);
	}
//	else {
//		System.out.println("Ce dossier existe dèja.");
//	}
//	
//	
	Files.move(source,dossierNice.resolve("go.txt"),
	 StandardCopyOption.REPLACE_EXISTING);
//	
//	Path fgo = Paths.get("nice/go.txt");
//	
//	Path dest = Paths.get("momo");
//	Files.move(fgo, dest,
//	StandardCopyOption.REPLACE_EXISTING);
	}

}
