//CRResFieldButton
//
//CRResFieldButton clears all input text fields
//
//Version 1.0: Sets the input text of all input fields to ""
//
//@author ERRM
//@version 1.0
//@since Aug 15, 2018

public class CRResFieldButton extends CRButton{
    public static final long serialVersionUID = 1L;
    //Main Constructor for CRResFieldButton
  	//@param gui the GUI
  	//@return empty
	public CRResFieldButton(ChallangeRatingGUI gui)
    {
		super(gui, 256);
    }
	
	//Sets the input text in each input box to ""
	//Activates when button is clicked
	//@param Empty
	//@return Empty
	public void clicked()
	{
		//System.out.println("Working for Reset Fields");
		for (int i=0; i<gui.table().size();i++)
			gui.table().get(i).setText("");
	}

}
