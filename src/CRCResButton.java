//CRCResButton
//
//CRCResButton clears the user input text fields
//
//Version 1.0: Sets the input of all text fields to an empty string ""
//
//@author ERRM
//@version 1.0
//@since Aug 24, 2018

public class CRCResButton extends CRButton {
    public static final long serialVersionUID = 1L;
    //Main Constructor for CRCResButton
  	//@param gui the GUI
  	//@return empty
	public CRCResButton(ChallangeRatingGUI gui)
    {
		super(gui, 1037);
    }
	
	//Sets the result text to ""
	//Activates when button is clicked
	//@param Empty
	//@return Empty
	public void clicked()
	{
		//System.out.println("Working Clear Results");
		gui.output().setTextCR("");
	}
}
