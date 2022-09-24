package com.tuteur.javaIntermediaire;

public interface TDNCloseable extends AutoCloseable
{
	public void close() throws TDNException;
}
