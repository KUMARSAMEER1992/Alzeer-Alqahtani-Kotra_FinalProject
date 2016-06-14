package ui.command;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Invoker extends Frame implements ActionListener 
{
	protected JButton btnNorth, btnSouth, btnEast, btnWest,btnSave,btnReload;
	Command turnNorth,turnSouth,turnEast,turnWest;
	Command save,reload;
	
	public Invoker()
	{
		createGui();
	}
	private void createGui() 
	{
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
	     //comand
	     JPanel panal1=new JPanel();
		 panal1.setLayout(new GridLayout(3,3));
		 btnSave=new JButton("Save");
		 btnSave.addActionListener(this);
	     panal1.add(btnSave, BorderLayout.NORTH);
	     btnReload=new JButton("Reload");
	     btnReload.addActionListener(this);
	     panal1.add(btnReload, BorderLayout.SOUTH);
	     add("Center",panal1);
	     setTitle("Remote"); 
	     setSize(280, 300);            
	     pack();
	     setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent evt) 
	{
		String temp=evt.getActionCommand();
		 if(temp.equals("Reload"))
		 {
			 reload.execute();
		 }
		 else if(temp.equals("Move"))
		 {
			 save.execute();
		 }
		
	}
	public void setTurnNorth(Command turnNorth)
	{
		this.turnNorth = turnNorth;
	}

	public void setTurnSouth(Command turnSouth)
	{
		this.turnSouth = turnSouth;
	}

	public void setTurnEast(Command turnEast) 
	{
		this.turnEast = turnEast;
	}

	public void setTurnWest(Command turnWest) 
	{
		this.turnWest = turnWest;
	}

	public void btnSave(Command save) 
	{
		this.save = save;
	}

	public void setReload(Command reload)
	{
		this.reload = reload;
	}
}