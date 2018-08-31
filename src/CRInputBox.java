import javax.swing.*;

import java.awt.*;
//CRInputBox
//
//CRInputBox is an individual text box the user can input data into
//
//Version 1.0: Uses methods inherited from JTextField primarily, also
//		returns the string representing the specific variable the box
//		is responsible for
//
//@author ERRM
//@version 1.0
//@since Aug 24, 2018

public class CRInputBox extends JTextField {
	private static final long serialVersionUID = 1L;
	private String type;
	
	//Main Constructor for CRErrorBox
  	//@param gui the GUI
  	//@return empty
	public CRInputBox(String typeIn)
	{
		this.type = typeIn;
		this.setOpaque(false);
		this.setBorder(null);
		Font font = new Font("Helvetica", Font.BOLD,25);
	    this.setHorizontalAlignment(JTextField.CENTER);
		this.setFont(font);
	}
	
	//Returns the name of the value being collected
	//@param Empty
	//@return type the string label identifying which value the box collects
	public String getNameCR()
	{
		return type;
	}

	//Determines if the input value is a valid integer
	//@param Empty
	//@return 0 for valid input, 1 if input is too long, 2 if input is not a number
	public int valid()
	{
		setZero();
		//If entry is too long
		if (this.getText().length() > 9)
			return 1;
		
		//If entry is not an integer
		String word = this.getText();
		for (int i=0;i<word.length();i++)
		{
			char temp = word.charAt(i);
			if (temp == '-')
			{
				if (i != 0)
					return 2;
			}
			else if (Character.isDigit(temp) == false)
				return 2;
		}
		return 0;
	}
	
	//Removes unneeded zeroes or adds a zero if empty
	//@param Empty
	//@return Empty
	public void setZero()
	{
		String newInp = "";
		boolean after = false;
		String word = this.getText();
		for (int i=0;i<word.length();i++)
		{
			char temp = word.charAt(i);
			if (after == false)
			{
				if (temp != '0')
				{
					if (i>0)
					{
						after = true;
						newInp += Character.toString(temp);
					}
					else
						return;
				}
			}
			else
				newInp += Character.toString(temp);
		}
		if (newInp == "" && after == false)
			newInp = "0";
		setText(newInp);
	}
}