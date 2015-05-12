
package lottocheckerfinal;

import java.util.ArrayList;

public class LottoChecker //implements Runnable
{    
	/**
 	* Takes in a ticket and processes the the picks and matches for a static array
 	* to be passed to the UI
 	* @param tick Ticket with information that holds the picks
 	* @return Picks and Matches to be set in the UI
 	*/
	static ArrayList<StringBuilder> processResults(Ticket tick)
	{
    	ArrayList<StringBuilder> results = new ArrayList<StringBuilder>();
   	 
    	StringBuilder picksInfo = new StringBuilder();
    	//sets the scanned picks again
    	ArrayList<int[]> picks = tick.getPicks();
    	 
    	for(int i = 0; i < picks.size(); i++){
        	picksInfo.append("Pick " + i + ": ");
        	for(int j = 0; j < picks.get(0).length; j++){
            	picksInfo.append(picks.get(i)[j] + " ");
        	}
        	picksInfo.append("\n");
    	}
    	//adds the picks to the static array to be displayed on the ui
    	results.add(picksInfo);
   	 
    	StringBuilder matchesInfo = new StringBuilder();
    	//gets the matches from the old ticket
    	ArrayList<int[]> matches = new ArrayList<int[]>(tick.getMatches());
   	 
    	//rechecks the matches after the user edits the ticket
    	for(int i = 0; i < matches.size(); i++){
        	matchesInfo.append("Pick " + i + " matches : ");
        	for(int j = 0; j < matches.get(0).length; j++){
            	matchesInfo.append(matches.get(i)[j] + " ");
        	}
        	matchesInfo.append("\n");
    	}
    	//adds the new results to the ui
    	results.add(matchesInfo);

    	return results;
	}
}



