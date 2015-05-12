package lottocheckerfinal;

import java.util.ArrayList;

/**
 * @author Group 3
 */

/*
 * Interface for multiple ticket types
 * eg powerball, fantasy 5, superlotto plus
*/

public interface Ticket
{
	/**
 	* Checks for specific lottery ticket number matches.
 	* The algorithm works by initializing an
 	* @param drawnNumbers the lottery numbers drawn for the specific week.
 	*/
	public void setMatches(int[] drawnNumbers);
    
	/**
 	* Mutator method for picks variable
 	* @param picksToSet data of picks to update
 	*/
	public void setPicks(ArrayList<int[]> picksToSet);
    
	/**
 	* Accesses the successful matches of the lottery ticket.
 	* @return matches
 	*/
	public ArrayList<int[]> getMatches();
    
	/**
 	* Accesses the picks of the lottery ticket.
 	* @return picks
 	*/
	public ArrayList<int[]> getPicks();
    
	/**
 	* determines if the objects are of the same type and with the same value
 	* @param o the object to compare the ticket to
 	* @return true or false whether or not it is a match
 	*/
	public boolean equals(Object o);
}



