/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package ui.command;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * Invoker class contains commands and buttons
 */
public class Invoker extends Frame implements ActionListener 
{
	protected JButton btnNorth, btnSouth, btnEast, btnWest;
	Command turnNorth,turnSouth,turnEast,turnWest;
	/**
	 * constructor to create GUI
	 */
	public Invoker()
	{
		createGui();
	}
	/**
	 * Create/Adding buttons and commands to GUI
	 */
	private void createGui() 
	{
		setLayout(new BorderLayout());
	    JPanel panal=new JPanel();
	    panal.setLayout(new BorderLayout(3,3));
	    btnNorth = new JButton("NORTH");
	    btnNorth.addActionListener(this);
	    panal.add(btnNorth, BorderLayout.NORTH);
	    btnSouth = new JButton("SOUTH");
	    btnSouth.addActionListener(this);
	    panal.add(btnSouth, BorderLayout.CENTER);
	    btnEast = new JButton("EAST");
	    btnEast.addActionListener(this);
	    panal.add(btnEast, BorderLayout.EAST);
	    btnWest = new JButton("WEST");
	    btnWest.addActionListener(this);
	    panal.add(btnWest, BorderLayout.WEST);
	    add("North",panal);
	    setTitle("Remote"); 
	    setSize(280, 150);            
	    pack();
	    setVisible(true);
	}
	/**
	 * execute command for each button
	 */
	 @Override
	 public void actionPerformed(ActionEvent evt) 
	 {
		 String temp=evt.getActionCommand();
		
		  if(temp.equals("NORTH"))
		 {
			 turnNorth.execute();
		 }
		 else if(temp.equals("SOUTH"))
		 {
			 turnSouth.execute();
		 }
		 else if(temp.equals("EAST"))
		 {
			 turnEast.execute();
		 }
		 else if(temp.equals("WEST"))
		 {
			 turnWest.execute();
		 }
	 }
	 /**
	  * to set TurnNorth command
	  * @param turnNorth
	  */
	public void setTurnNorth(Command turnNorth)
	{
		this.turnNorth = turnNorth;
	}
	/**
	 * to set turnSouth command
	 * @param turnSouth
	 */
	public void setTurnSouth(Command turnSouth)
	{
		this.turnSouth = turnSouth;
	}
	/**
	 * to set turnEast command
	 * @param turnEast
	 */
	public void setTurnEast(Command turnEast) 
	{
		this.turnEast = turnEast;
	}
	/**
	 * to set turnWest command
	 * @param turnWest
	 */
	public void setTurnWest(Command turnWest) 
	{
		this.turnWest = turnWest;
	}	
}
