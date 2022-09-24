package com.tuteur.javaIntermediaire;

import java.text.ParseException;

public class TestMultiException {

	public static void main(String[] args) {
		
		MultiException mE =  new MultiException("ibrahima", "fall");
   
        try 
        {
            mE.setAge("22");
            System.out.println(mE);
        }
        catch (AgeInvalideException e) 
        {
        	System.err.println(e.getMessage());
        	
        }catch (ParseException e) 
        {
        	System.err.println(e.getMessage());
        }
    

	}

}
