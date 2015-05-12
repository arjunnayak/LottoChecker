package lottocheckerfinal;

import java.util.ArrayList;

/**
 *
 * @author Group 3
 */
public class PowerBallTicket implements Ticket{
	private ArrayList<int[]> picks;
	private ArrayList<int[]> matches;
	private static final int POWER_POS = 5;
    
	public PowerBallTicket(ArrayList<int[]> picks){
    	this.picks = new ArrayList<int[]>();
    	this.picks = picks;
	}

	/**
 	* Checks for specific lottery ticket number matches.
 	* The algorithm works by initializing an
 	* @param drawnNumbers the lottery numbers drawn for the specific week.
 	*/
	@Override
	public void setMatches(int[] drawnNumbers) {
    	//initialize an array for the matches based off of the pick size
    	this.matches = new ArrayList<int[]>(this.picks.size());

    for(int pick = 0; pick < picks.size(); pick ++){
        	int[] tempMatches = new int[] {0,0,0,0,0,0};
   	 for(int pickPos =0; pickPos < picks.get(pick).length; pickPos++){
                	if(pickPos != POWER_POS){//match can be anywhere
                    	for(int drawPos = 0; drawPos < drawnNumbers.length; drawPos++){
                        	if(picks.get(pick)[pickPos] == drawnNumbers[drawPos]){
                           	tempMatches[pickPos] = picks.get(pick)[pickPos];
                        	}
                    	}
                	}else{//check for PowerBall match only in last position
                    	if(picks.get(pick)[pickPos] == drawnNumbers[POWER_POS]){
                        	tempMatches[pickPos] = picks.get(pick)[pickPos];
                    	}
                	}
   	 }
        	matches.add(pick, tempMatches);
    }
	}
    
	@Override
	public void setPicks(ArrayList<int[]> picksToSet){
    	this.picks = new ArrayList<int[]>();
    	this.picks = picksToSet;
	}

	@Override
	/**
 	* Accesses the successful matches of the lottery ticket.
 	* @return matches
 	*/
	public ArrayList<int[]> getMatches() {
   	 
    	return this.matches;
	}

	@Override
	/**
 	* Accesses the picks of the lottery ticket.
 	* @return picks
 	*/
	public ArrayList<int[]> getPicks() {
    	return this.picks;
	}

	@Override
	public boolean equals(Object o)
	{
    	if(this == o)
    	{return true;}
    	if(o == null)
    	{return false;}
    	if(getClass() != o.getClass())
    	{return false;}
    	return false;
	}
    
}



