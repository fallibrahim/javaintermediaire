package com.tuteur.javaIntermediaire;

import java.util.ArrayList;

public class TestEtreHumain {

public static void main(String[] args) {
ArrayList<EtreHumain> tab = new ArrayList<EtreHumain>();
 tab.add(new Male());
 tab.add(new Femelle());
 tab.add(new Femelle());
 tab.add(new Male());
 for (EtreHumain eh : tab)
 {
	eh.uriner();
 }
}

}
