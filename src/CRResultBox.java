import java.awt.Font;

import javax.swing.*;
//CRResultBox
//
//CRResultBox displays the results of calculations done on input variables
//
//Version 1.0: Creates and controls three separate JTextField boxes, one
//		for each output variable.
//
//@author ERRM
//@version 1.0
//@since Aug 15, 2018

public class CRResultBox extends JComponent {
	private static final long serialVersionUID = 1L;
	private JTextField cr = new JTextField();
	private JTextField ab = new JTextField();
	private JTextField ac = new JTextField();
	private ChallangeRatingGUI gui;
	
	//Main Constructor for CRResultBox
	//@param guiIn the GUI
	//@return empty
	public CRResultBox(ChallangeRatingGUI guiIn)
	{
		gui = guiIn;
		setBox(cr, gui, 350);
		setBox(ab, gui, 250);
		setBox(ac, gui, 450);
	}
	
	//Initializes the JTextField
	//@param box the JTextField in creation, gui, ycomp the y-loc of the box
	//@return Empty
	private void setBox(JTextField box, ChallangeRatingGUI gui, int ycomp)
	{
		box.setOpaque(false);
		box.setBorder(null);
		box.setHorizontalAlignment(JTextField.CENTER);
	    Font font = new Font("Helvetica", Font.BOLD,40);
	    box.setFont(font);
	    box.setBounds(800, ycomp, 400, 100);
	    box.setEditable(false);
		gui.add(box);
	}
	
	//Changes the size of the text
	//@param size the pixel font size of the new text
	//@return Empty
	public void resizeText(int size)
	{
		Font font = new Font("Helvetica", Font.BOLD,size);
		cr.setFont(font);
		ab.setFont(font);
		ac.setFont(font);
	}
	
	//Changes all three output boxes to the same value
	//@param t the string to set all outputs to
	//@return Empty
	public void setTextCR(String t)
	{
		gui.errorCR().setText("");
		cr.setText(t);
		ab.setText(t);
		ac.setText(t);
	}
	
	//Changes each output boxes to a unique value
	//@param crt output to cr, abt output to ab, act output to ac
	//@return Empty
	public void setTextCR(String crt, String abt, String act)
	{
		gui.errorCR().setText("");
		cr.setText(crt);
		ab.setText(abt);
		ac.setText(act);
	}
	
	//Sets the error message
	//@param t the error message, y the offset of the error box along the y-axis
	//@return Empty
	public void setError(String t, int y)
	{
		cr.setText("");
		ab.setText("");
		ac.setText("");
		gui.errorCR().setText(t);
		gui.errorCR().crSetBounds(y);
	}
}
