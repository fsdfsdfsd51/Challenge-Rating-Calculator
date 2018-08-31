import java.awt.Font;

import javax.swing.*;
//CRErrorBox
//
//CRErrorBox displays error messages
//
//Version 1.0: Uses methods inherited from JTextArea only, primarily
//		exists due to visual differences with the result boxes
//
//@author ERRM
//@version 1.0
//@since Aug 24, 2018

public class CRErrorBox extends JTextArea {
    public static final long serialVersionUID = 1L;
    //Main Constructor for CRErrorBox
  	//@param gui the GUI
  	//@return empty
	public CRErrorBox(ChallangeRatingGUI gui)
	{
		this.setOpaque(false);
		this.setLineWrap(true);
		this.setWrapStyleWord(true);
		this.setBorder(null);
		this.setBounds(800,350,400,400);
		this.setEditable(false);
		Font font = new Font("Helvetica", Font.BOLD,30);
		this.setFont(font);
		gui.add(this);
	}
	
	//Moves the error box up or down by a set amount
	//@param y the number of pixels to move the box up or down
	//@return Empty
	public void crSetBounds(int y)
	{
		this.setBounds(800,350+y,400,400);
	}
	
}
