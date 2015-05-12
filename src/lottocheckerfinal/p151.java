package lottocheckerfinal;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Group 3
 */
public class p151 extends javax.swing.JFrame {
 	private Ticket tick;
 	private int numPicks;
 	private int[] drawnNumbers;
 	private File ticketImg;
 	private Boolean fileChosen = false;
 	TicketImageParser ticketImgParser;
	/**
 	* Creates new form p151 and an static array
 	*/
	public p151() {
    	initComponents();
    	this.picks = new JTextField[][] {{pick1_1, pick1_2, pick1_3, pick1_4, pick1_5, pick1_6}
        	,{pick2_1, pick2_2, pick2_3, pick2_4, pick2_5, pick2_6}
        	,{pick3_1, pick3_2, pick3_3, pick3_4, pick3_5, pick3_6}
        	,{pick4_1, pick4_2, pick4_3, pick4_4, pick4_5, pick4_6}
        	,{pick5_1, pick5_2, pick5_3, pick5_4, pick5_5, pick5_6}};
	}
	// <editor-fold defaultstate="collapsed" desc="Generated Code">                     	 
	private void initComponents() {

    	jPanel1 = new javax.swing.JPanel();
    	jLabel1 = new javax.swing.JLabel();
    	jButton5 = new javax.swing.JButton();
    	jLabel2 = new javax.swing.JLabel();
    	megaMillion = new javax.swing.JButton();
    	superLotto = new javax.swing.JButton();
    	jPanel3 = new javax.swing.JPanel();
    	jScrollPane1 = new javax.swing.JScrollPane();
    	drawnArea = new javax.swing.JTextArea();
    	jPanel4 = new javax.swing.JPanel();
    	pick1_1 = new javax.swing.JTextField();
    	pick1_1.setVisible(false);
    	pick1_2 = new javax.swing.JTextField();
    	pick1_2.setVisible(false);
    	pick1_3 = new javax.swing.JTextField();
    	pick1_3.setVisible(false);
    	pick1_4 = new javax.swing.JTextField();
    	pick1_4.setVisible(false);
    	pick1_5 = new javax.swing.JTextField();
    	pick1_5.setVisible(false);
    	pick1_6 = new javax.swing.JTextField();
    	pick1_6.setVisible(false);
    	pick2_1 = new javax.swing.JTextField();
    	pick2_1.setVisible(false);
    	pick2_2 = new javax.swing.JTextField();
    	pick2_2.setVisible(false);
    	pick2_3 = new javax.swing.JTextField();
    	pick2_3.setVisible(false);
    	pick2_4 = new javax.swing.JTextField();
    	pick2_4.setVisible(false);
    	pick2_5 = new javax.swing.JTextField();
    	pick2_5.setVisible(false);
    	pick2_6 = new javax.swing.JTextField();
    	pick2_6.setVisible(false);
    	pick3_1 = new javax.swing.JTextField();
    	pick3_1.setVisible(false);
    	pick3_2 = new javax.swing.JTextField();
    	pick3_2.setVisible(false);
    	pick3_3 = new javax.swing.JTextField();
    	pick3_3.setVisible(false);
    	pick3_4 = new javax.swing.JTextField();
    	pick3_4.setVisible(false);
    	pick3_5 = new javax.swing.JTextField();
    	pick3_5.setVisible(false);
    	pick3_6 = new javax.swing.JTextField();
    	pick3_6.setVisible(false);
    	pick4_1 = new javax.swing.JTextField();
    	pick4_1.setVisible(false);
    	pick4_2 = new javax.swing.JTextField();
    	pick4_2.setVisible(false);
    	pick4_3 = new javax.swing.JTextField();
    	pick4_3.setVisible(false);
    	pick4_4 = new javax.swing.JTextField();
    	pick4_4.setVisible(false);
    	pick4_5 = new javax.swing.JTextField();
    	pick4_5.setVisible(false);
    	pick4_6 = new javax.swing.JTextField();
    	pick4_6.setVisible(false);
    	pick5_1 = new javax.swing.JTextField();
    	pick5_1.setVisible(false);
    	pick5_2 = new javax.swing.JTextField();
    	pick5_2.setVisible(false);
    	pick5_3 = new javax.swing.JTextField();
    	pick5_3.setVisible(false);
    	pick5_4 = new javax.swing.JTextField();
    	pick5_4.setVisible(false);
    	pick5_5 = new javax.swing.JTextField();
    	pick5_5.setVisible(false);
    	pick5_6 = new javax.swing.JTextField();
    	pick5_6.setVisible(false);
    	fantasyFive = new javax.swing.JButton();
    	powerBall = new javax.swing.JButton();
    	jScrollPane2 = new javax.swing.JScrollPane();
    	jTextPane1 = new javax.swing.JTextPane();

    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    	setPreferredSize(new java.awt.Dimension(698, 500));

    	jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Insert"));
    	jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    	jPanel1.setName(""); // NOI18N

    	jLabel1.setText("Picture");

    	jButton5.setText("Choose File");
    	jButton5.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	chooseFileAction(evt);
        	}
    	});

    	jLabel2.setIcon(jButton5.getIcon());
    	jLabel2.setPreferredSize(new java.awt.Dimension(150, 150));

    	javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    	jPanel1.setLayout(jPanel1Layout);
    	jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel1Layout.createSequentialGroup()
            	.addContainerGap()
            	.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                	.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                	.addGroup(jPanel1Layout.createSequentialGroup()
                    	.addComponent(jLabel1)
                    	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    	.addComponent(jButton5)
                    	.addGap(0, 119, Short.MAX_VALUE)))
            	.addContainerGap())
    	);
    	jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel1Layout.createSequentialGroup()
            	.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(jLabel1)
                	.addComponent(jButton5))
            	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            	.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            	.addContainerGap())
    	);

    	megaMillion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottochecker/megamillions.png"))); // NOI18N
    	megaMillion.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	megaMillionActionPerformed(evt);
        	}
    	});

    	superLotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottochecker/superlotto.png"))); // NOI18N
    	superLotto.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	superLottoActionPerformed(evt);
        	}
    	});

    	jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Drawn Numbers"));

    	jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    	jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

    	drawnArea.setColumns(20);
    	drawnArea.setRows(5);
    	jScrollPane1.setViewportView(drawnArea);

    	javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    	jPanel3.setLayout(jPanel3Layout);
    	jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel3Layout.createSequentialGroup()
            	.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
            	.addContainerGap())
    	);
    	jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel3Layout.createSequentialGroup()
            	.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    	);

    	jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Your Picks"));

    	javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    	jPanel4.setLayout(jPanel4Layout);
    	jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel4Layout.createSequentialGroup()
            	.addGap(36, 36, 36)
            	.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                	.addGroup(jPanel4Layout.createSequentialGroup()
                    	.addComponent(pick2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                	.addGroup(jPanel4Layout.createSequentialGroup()
                    	.addComponent(pick1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                	.addGroup(jPanel4Layout.createSequentialGroup()
                    	.addComponent(pick3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                	.addGroup(jPanel4Layout.createSequentialGroup()
                    	.addComponent(pick4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                	.addGroup(jPanel4Layout.createSequentialGroup()
                    	.addComponent(pick5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(pick5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
            	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    	);
    	jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(jPanel4Layout.createSequentialGroup()
            	.addContainerGap()
            	.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(pick1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick1_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            	.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(pick2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick2_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            	.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(pick3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick3_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            	.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(pick4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick4_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick4_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick4_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            	.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                	.addComponent(pick5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick5_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick5_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(pick5_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    	);

    	fantasyFive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottochecker/fantasy5.png"))); // NOI18N
    	fantasyFive.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	fantasyFiveActionPerformed(evt);
        	}
    	});

    	powerBall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lottochecker/powerball.png"))); // NOI18N
    	powerBall.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
            	powerBallActionPerformed(evt);
        	}
    	});

    	jTextPane1.setEditable(false);
    	jTextPane1.setBorder(null);
    	jTextPane1.setText("Verify Your Picks, Then Select a game to see if you are a Winner!");
    	jScrollPane2.setViewportView(jTextPane1);

    	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    	getContentPane().setLayout(layout);
    	layout.setHorizontalGroup(
        	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(layout.createSequentialGroup()
            	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                	.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    	.addComponent(superLotto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(powerBall, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
            	.addGap(28, 28, 28)
            	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                	.addGroup(layout.createSequentialGroup()
                    	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        	.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        	.addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    	.addContainerGap())
                	.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    	.addGap(0, 0, Short.MAX_VALUE)
                    	.addComponent(megaMillion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(18, 18, 18)
                    	.addComponent(fantasyFive, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addGap(31, 31, 31))))
        	.addGroup(layout.createSequentialGroup()
            	.addGap(129, 129, 129)
            	.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    	);
    	layout.setVerticalGroup(
        	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        	.addGroup(layout.createSequentialGroup()
            	.addContainerGap()
            	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                	.addGroup(layout.createSequentialGroup()
                    	.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    	.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                	.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            	.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            	.addGap(18, 18, 18)
            	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                	.addComponent(fantasyFive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(megaMillion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(powerBall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                	.addComponent(superLotto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
            	.addGap(22, 22, 22))
    	);

    	pack();
	}// </editor-fold>                   	 

/**
 * Handles the MegaMillion option for lottery checking
 * @param evt MegaMillions button being pressed
 */
	private void megaMillionActionPerformed(java.awt.event.ActionEvent evt) {                                       	 
    	if(this.fileChosen == false){
        	JOptionPane.showMessageDialog(null, "Please select an image file", "ERROR", JOptionPane.INFORMATION_MESSAGE);
    	}else{
        	 
    	tick = new PowerBallTicket(this.ticketImgParser.getPicks());
     	try {
         	this.drawnNumbers = seek("megaMillions");
     	} catch (IOException ex) {
         	Logger.getLogger(p151.class.getName()).log(Level.SEVERE, null, ex);
     	}
     	revalidateResults();
    	}
	}                                      	 

 /**
 * Handles the PowerBall option for lottery checking
 * @param evt PowerBall button being pressed
 */
	private void powerBallActionPerformed(java.awt.event.ActionEvent evt) {                                     	 
    	// TODO add your handling code here:
    	if(this.fileChosen == false){
        	JOptionPane.showMessageDialog(null, "Please select an image file", "ERROR", JOptionPane.INFORMATION_MESSAGE);
    	}else{
     	tick = new PowerBallTicket(this.ticketImgParser.getPicks());
     	try {
         	this.drawnNumbers = seek("powerBall");
     	} catch (IOException ex) {
         	Logger.getLogger(p151.class.getName()).log(Level.SEVERE, null, ex);
     	}
    	 
     	revalidateResults();
    	}
	}                                    	 

/**
 * Handles the SuperLotto option for lottery checking
 * @param evt SuperLotto button being pressed
 */
	private void superLottoActionPerformed(java.awt.event.ActionEvent evt) {                                      	 
    	// TODO add your handling code here:
    	if(this.fileChosen == false){
        	JOptionPane.showMessageDialog(null, "Please select an image file", "ERROR", JOptionPane.INFORMATION_MESSAGE);
    	}else{  
    	tick = new PowerBallTicket(this.ticketImgParser.getPicks());
     	try {
         	this.drawnNumbers = seek("superLotto");
     	} catch (IOException ex) {
         	Logger.getLogger(p151.class.getName()).log(Level.SEVERE, null, ex);
     	}
     	revalidateResults();
    	}
	}                                     	 

/**
 * Allows user to choose image file of user's lottery ticket and displays the ticket.
 * User chooses image and the program approves of it
 * Reads image and sets it as the image of the correct UI JLabel
 * @param evt "Choose File" button being pressed
 */
	private void chooseFileAction(java.awt.event.ActionEvent evt) {                             	 
    	JFileChooser fileChooser = new JFileChooser();
    	fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
    	int result = fileChooser.showOpenDialog(this);
    	if (result == JFileChooser.APPROVE_OPTION) {
        	File selectedFile = fileChooser.getSelectedFile();
        	this.fileChosen=true;
        	this.ticketImg = selectedFile;
        	try {
            	BufferedImage bufferedImage = ImageIO.read(ticketImg);
            	ImageIcon icon = new ImageIcon(bufferedImage.getScaledInstance(200, 200, HEIGHT));
            	jLabel2.setIcon(icon);
            	jLabel2.setSize(icon.getIconHeight(), icon.getIconWidth());
        	} catch (IOException ex) {
            	Logger.getLogger(p151.class.getName()).log(Level.SEVERE, null, ex);
        	}

        	try {
            	this.ticketImgParser = new TicketImageParser(this.ticketImg, picks);
            	populatePicks(ticketImgParser.getPicks());
            	jPanel4.revalidate();
        	} catch (IOException ex) {
            	Logger.getLogger(p151.class.getName()).log(Level.SEVERE, null, ex);
        	}
    	}
	}                            	 

/**
 * Handles the FantasyFive option for lottery checking
 * @param evt FantasyFive button being pressed
 */
	private void fantasyFiveActionPerformed(java.awt.event.ActionEvent evt) {                                       	 
    	if(this.fileChosen == false){
        	JOptionPane.showMessageDialog(null, "Please select an image file", "ERROR", JOptionPane.INFORMATION_MESSAGE);
    	}else{
        	tick = new PowerBallTicket(this.ticketImgParser.getPicks());
        	try {
            	this.drawnNumbers = seek("fantasyFive");
        	} catch (IOException ex) {
            	Logger.getLogger(p151.class.getName()).log(Level.SEVERE, null, ex);
        	}
        	revalidateResults();
    	}
	}                                      	 

	private void revalidateResults(){
    	ArrayList<int[]> validatedPicks;
    	validatedPicks = new ArrayList<int[]>(5);
        	ArrayList<int[]> oldPicks = tick.getPicks();
        	int[][] cleanRow = new int[5][6];
        	for(int i = 0; i < oldPicks.size(); i++){
        	for(int j = 0; j < oldPicks.get(0).length; j++){
          	 
           	cleanRow[i][j] = Integer.parseInt(this.picks[i][j].getText());
        	}
    	}
        	//adds the numbers to the array
        	for(int i = 0; i < cleanRow.length; i ++){
            	validatedPicks.add(cleanRow[i]);
        	}

        	tick.setPicks(validatedPicks);
        	populatePicks(tick.getPicks());
        	//validates the right numbers
        	tick.setMatches(drawnNumbers);
        	printResults(tick);
	}
/**
 * Populates the static array editable array for any error in the tickets
 * @param curPicks the current lottery numbers of the image
 */    
	private void populatePicks(ArrayList<int[]> curPicks){
    	ArrayList<int[]> picksTmp = curPicks;
    	for(int i = 0; i < picksTmp.size(); i++){
        	for(int j = 0; j < picksTmp.get(0).length; j++){
            	this.picks[i][j].setText(picksTmp.get(i)[j] + "");
        	}   	 
    	}
	}
    
/**
 * Main Method.
 * Creates the UI(our thread)
 * @param args the command line arguments
 */
public static void main(String args[]) throws MalformedURLException, IOException{
	/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
 	* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
 	*/
	try {
    	for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        	if ("Nimbus".equals(info.getName())) {
            	javax.swing.UIManager.setLookAndFeel(info.getClassName());
            	break;
        	}
    	}
	} catch (ClassNotFoundException ex) {
    	java.util.logging.Logger.getLogger(p151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
    	java.util.logging.Logger.getLogger(p151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
    	java.util.logging.Logger.getLogger(p151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
    	java.util.logging.Logger.getLogger(p151.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>
	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
    	public void run() {
        	new p151().setVisible(true);
    	}
	});
}

/**
 * Prints results of the picks and matches to the UI
 * Colors green if numbers match red if they don't
 * @param tick User's chosen lottery ticket
 */
private void printResults(Ticket tick){
	//ArrayList<StringBuilder> update = LottoChecker.processResults(tick);
	ArrayList<int[]> matches = new ArrayList<int[]>(tick.getMatches());
   	 
	for(int i = 0; i < matches.size(); i++){
    	for(int j = 0; j < matches.get(0).length; j++){
        	if(matches.get(i)[j] != 0){
            	picks[i][j].setForeground(Color.green);
        	}else{
            	picks[i][j].setForeground(Color.red);
        	}
    	}
	}
}
/**
 * Displays the winning lottery numbers for the week
 * @param gameChoice the type of lottery game
 * @return the drawn winning numbers for the week
 * @throws MalformedURLException if url missing
 * @throws IOException if theres an empty url
 */
public int[] seek(String gameChoice) throws MalformedURLException, IOException
{
    	int[] drawn = new int[6];
    	URL url = new URL("http://test.com");
    	Seeker s = Seeker.getInstance();
   	 
    	switch (gameChoice) {
      	case "fantasyFive":
          	drawn = (s.Seek(new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=fantasy-5")));
          	break;
      	case "powerBall":
          	drawn = (s.Seek(new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=powerball")));
          	break;
      	case "superLotto":       	 
          	drawn = (s.Seek(new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=superlotto-plus")));
          	break;
      	case "megaMillions":
          	drawn = (s.Seek(new URL("http://www.calottery.com/sitecore/content/Miscellaneous/download-numbers/?GameName=mega-millions")));
          	break;
  	}
    	StringBuilder drawnNumString = new StringBuilder();
 	 
    	for(int i = 0; i < drawn.length; i++){
    	drawnNumString.append(Integer.toString(drawn[i]) + " ");
    	}
    	drawnArea.setText(drawnNumString.toString());
    	return drawn;
}

	// Variables declaration - do not modify                	 
	private javax.swing.JTextArea drawnArea;
	private javax.swing.JButton fantasyFive;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextPane jTextPane1;
	private javax.swing.JButton megaMillion;
	private javax.swing.JTextField pick1_1;
	private javax.swing.JTextField pick1_2;
	private javax.swing.JTextField pick1_3;
	private javax.swing.JTextField pick1_4;
	private javax.swing.JTextField pick1_5;
	private javax.swing.JTextField pick1_6;
	private javax.swing.JTextField pick2_1;
	private javax.swing.JTextField pick2_2;
	private javax.swing.JTextField pick2_3;
	private javax.swing.JTextField pick2_4;
	private javax.swing.JTextField pick2_5;
	private javax.swing.JTextField pick2_6;
	private javax.swing.JTextField pick3_1;
	private javax.swing.JTextField pick3_2;
	private javax.swing.JTextField pick3_3;
	private javax.swing.JTextField pick3_4;
	private javax.swing.JTextField pick3_5;
	private javax.swing.JTextField pick3_6;
	private javax.swing.JTextField pick4_1;
	private javax.swing.JTextField pick4_2;
	private javax.swing.JTextField pick4_3;
	private javax.swing.JTextField pick4_4;
	private javax.swing.JTextField pick4_5;
	private javax.swing.JTextField pick4_6;
	private javax.swing.JTextField pick5_1;
	private javax.swing.JTextField pick5_2;
	private javax.swing.JTextField pick5_3;
	private javax.swing.JTextField pick5_4;
	private javax.swing.JTextField pick5_5;
	private javax.swing.JTextField pick5_6;
	private javax.swing.JButton powerBall;
	private javax.swing.JButton superLotto;
	// End of variables declaration              	 
	private javax.swing.JTextField[][] picks;
    
    
}


