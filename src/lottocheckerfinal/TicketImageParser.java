package lottocheckerfinal;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.JTextField;
import net.sourceforge.tess4j.*;
import net.sourceforge.vietocr.ImageHelper;

/**
 *
 * @author Group 3
 */
public class TicketImageParser {
    
	ArrayList<int[]> picks;
    
	/**
 	* reads lottery numbers from the ticket image and
 	* displays them onto a jtextfield
 	* @param ticketImage the image to read from
 	* @param picks the textfield to display results to
 	* @throws IOException in case the file does not exist
 	*/
	public TicketImageParser(File ticketImage, JTextField[][] picks) throws IOException{
    	File imageFile = ticketImage;
   	 
    	Tesseract instance = Tesseract.getInstance();
    	instance.setTessVariable("tessedit_char_whitelist", "0123456789");
    	instance.setTessVariable("load_system_dawg", "F");
    	instance.setTessVariable("load_freq_dawg", "F");
   	 
   	 	//create a temp file
   	 	File BlackAndWhiteTmp = File.createTempFile("BlackAndWhite", "png");
        	File croppedTmp = File.createTempFile("cropped", "png");
        	File croppedBinTmp = File.createTempFile("croppedBin", "png");
   	 
    	BufferedImage originalImage = ImageIO.read(imageFile);
    	BufferedImage blackAndWhite = ImageHelper.convertImageToGrayscale(originalImage);

    	ImageIO.write(blackAndWhite, "png", BlackAndWhiteTmp);
   	 
    	BufferedImage cropped = blackAndWhite.getSubimage(25, 130, 250, 70);

    	ImageIO.write(cropped, "png", croppedTmp);
    	BufferedImage croppedBin = ImageHelper.convertImageToBinary(cropped);

    	ImageIO.write(croppedBin, "png", croppedBinTmp);
   	 
    	try {
        	String result = instance.doOCR(cropped);

        	String[] parts = result.split("\n");
        	String[] col = new String[parts.length];
        	for(int n = 0; n < parts.length; n++) {
            	if(!parts[n].contentEquals("")){
                	col[n] = parts[n];
            	}
        	}

        	String[] rows = new String[parts[0].length()];
        	for(int j = 0; j < rows.length; j++){
            	for(int i = col.length - 1 ; i >= 0; i--){
                	if(col[i] != null){
                    	rows[j] = rows[j] + col[i].charAt(j);
                	}
            	}
        	}

        	this.picks = new ArrayList<int[]>(rows.length);
        	for(int i = 0; i< rows.length; i++){
            	this.picks.add(cleanTicket(rows[i]));
            	picks[i][0].setVisible(true);
            	picks[i][1].setVisible(true);
            	picks[i][2].setVisible(true);
            	picks[i][3].setVisible(true);
            	picks[i][4].setVisible(true);
            	picks[i][5].setVisible(true);
        	}

    	} catch (TesseractException e) {
    	System.err.println(e.getMessage());
    	}
	}
    
	public int[] cleanTicket(String toClean){
    	int[] cleanRow = new int[6];
    	String temp = new String();
    	temp = toClean.substring(4);
    	temp = temp.replaceAll("..(?!$)", "$0 ");
    	String[] parts = temp.split(" ");

    	for(int i= 0; i < parts.length ; i++){
        	cleanRow[i] = Integer.parseInt(parts[i]);
    	}
    	return cleanRow;
	}
    
	public ArrayList<int[]> getPicks() {
	return this.picks;    
	}
}



