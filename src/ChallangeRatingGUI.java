import java.awt.*;
import javax.swing.*;
//	ChallangeRatingGUI
//
//	ChallangeRatingGUI is the graphical user interface (gui) for this application.
//
//	Version 1.0: Designed to show the background image provided and make it
//		able to communicate with the user exactly as the image appears.
//		This gui mostly allows objects to communicate with each other
//		It creates the pop-up window the user interacts with, and creates
//		all objects within the window.
//		Note that add() methods only work for Component and JComponent
//		inheriting objects. More add() methods may need to be designed
//		if objects which do not inherit from these abstracts are used
//	
//	Application closes when window is closed
//
//	@author ERRM
//	@version 1.0
//	@since Aug 24, 2018



public class ChallangeRatingGUI {
	//gui creates all items to be used by the program
	private CRBackdrop window = new CRBackdrop();
	private CRInputTable table = new CRInputTable(this);
	public CRResultBox output = new CRResultBox(this);
	public CRErrorBox errorCR = new CRErrorBox(this);
	public CRResFieldButton resetFields = new CRResFieldButton(this);
	public CRCalcResButton calculate = new CRCalcResButton(this);
	public CRCResButton clearResults = new CRCResButton(this);
	public CRCAllButton clearAll = new CRCAllButton(this);
	
	//Main Constructor for class ChallangeRatingGUI
	//@param Empty
	//@return empty
	public ChallangeRatingGUI() {}
	
	
	//Returns object methods
	//Purpose: Return the input table
	//@param Empty
	//@return table the only CRInputTable created
	public CRInputTable table() { return table; }
	
	//Returns the output box
	//@param Empty
	//@return output the only CRResultBox created
	public CRResultBox output() { return output; }
	
	//Returns the reset input fields button
	//@param Empty
	//@return fieldButton the only CRResFieldButton created
	public CRResFieldButton fieldButton() { return resetFields; }
	
	//Returns the reset result field button
	//@param Empty
	//@return clearResults the only CRCResButton created
	public CRCResButton resultButton() { return clearResults; }
	
	//Returns the error field
	//@param Empty
	//@return errorCR the only CRErrorBox created
	public CRErrorBox errorCR() { return errorCR; }
	
	
	//Adds items to CRBackdrop window (window is the base JPanel)
	//@param comp Component to be added to the CRBackdrop window
	//@return Empty
	public void add(Component comp)
	{
		window.add(comp);
	}

	//Adds JComponents to the window so that they become visible
	//@param comp JComponent to be added to the CRBackdrop window
	//@return Empty
	public void add(JComponent comp)
	{
		window.add(comp);
	}
}
