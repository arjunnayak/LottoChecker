/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottocheckerfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Group 3
 */
public class Seeker
{
	private int[] drawn = new int[6];
	private static Seeker instance;
    
	public static Seeker getInstance()
	{
    	if(instance == null)
        	instance = new Seeker();
    	return instance;
	}
    
	public int[] Seek(URL url) throws IOException
	{
    	ArrayList<String> drawnNumbers = new ArrayList();
    	String inputLine;
    	try{
        	BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        	while ((inputLine = in.readLine()) != null)
        	{
            	drawnNumbers.add(inputLine);
        	}

        	in.close();

        	String toComb = drawnNumbers.get(5);
        	toComb = toComb.substring(30);
        	toComb = toComb.trim();
        	toComb = toComb.replaceAll("      	", " ");

        	int[] cleanRow = new int[6];
        	String temp = new String();
        	temp = toComb;
        	String[] parts = temp.split(" ");

        	for(int i= 0; i < parts.length ; i++){
            	this.drawn[i] = Integer.parseInt(parts[i]);
        	}
    	}catch (UnknownHostException ex) {
            	JOptionPane.showMessageDialog(null, "No Network Connection", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        	}
   	 
    	return drawn;
	}
}



