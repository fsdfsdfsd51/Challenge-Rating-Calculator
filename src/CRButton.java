import javax.swing.*;
//CRButton
//
//CRButton is the abstract class for all buttons used in the program
//
//Version 1.0: Creates basic invisible button exact size and shape
//		as the button-images on the background image
//
//@author ERRM
//@version 1.0
//@since Aug 24, 2018



public abstract class CRButton extends JButton
{
    public static final long serialVersionUID = 1L;
    public JButton button = new JButton();
    public static ChallangeRatingGUI gui;
    
    //Main Constructor for abstract class CRButton
  	//@param guiIn the GUI, and xVal the x-position of the button
  	//@return empty
	public CRButton(ChallangeRatingGUI guiIn, int xVal)
	{
		super();
		gui = guiIn;
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBounds(xVal,60,128,43);
		gui.add(button);
		button.addActionListener(new java.awt.event.ActionListener() {
		    public void actionPerformed(java.awt.event.ActionEvent evt) {
		    	clicked();
		    }
		});
	}
	
	//Activates as the clicked() method in JButton does, and allows objects
	//	which extend the CRButton class to change the effects of the
	//	clicked() method
	//@param Empty
	//@return Empty
	public void clicked() {}
}
