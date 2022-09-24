package com.tuteur.javaIntermediaire;

import java.util.ArrayList;

public class getDataFromNetwork {
 public static ArrayList<String> importantData;
 
 static {
	 importantData = getDataFromNetWork();
 }
	public static void main(String[] args) {
	  System.out.println(getDataFromNetwork.importantData);
	}
	private static ArrayList<String> getDataFromNetWork() {
	  System.out.println("telechargement en cours...");
	  ArrayList<String> data = new ArrayList<String>();
	  data.add("Google");
	  data.add("Twitter");
	  data.add("whatsApp");
	  data.add("FaceBook");
	  data.add("Instagram");
	  data.add("TikTok");
	  data.add("Youtube");
	  return data;
	}

}
