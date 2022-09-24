package com.tuteur.javaIntermediaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverPersonnel {

	public static void main(String[] args) {
		
		List<Personnel> personnes = new ArrayList<>();
		
		personnes.add(new Personnel("fall"," Yacine"));
		personnes.add(new Personnel("fall"," Guile"));
		personnes.add(new Personnel("fall","Maimouna"));
		personnes.add(new Personnel("fall","Coumba"));
		personnes.add(new Personnel("fall","assane"));
		
		System.out.println(personnes);
		Collections.sort(personnes);
		System.out.println(personnes);
	}

}
