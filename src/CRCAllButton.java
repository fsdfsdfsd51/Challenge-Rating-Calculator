//	CRCAllButton
//
//	CRCAllButton clears all input and output data
//
//	Version 1.0: Since the buttons only take action upon the input and result
//		fields, this class merely activates the two buttons which individually
//		clear half of the variable text fields.
//		Future versions which act upon the buttons themselves, such as animations
//		or sound effects, will need to be modified to enable this button to
//		function without activating the animations of other methods.
//
//	@author ERRM
//	@version 1.0
//	@since Aug 24, 2018

public class CRCAllButton extends CRButton
{
    public static final long serialVersionUID = 1L;
    //Main Constructor for CRCAllButton
  	//@param gui the GUI
  	//@return empty
	public CRCAllButton(ChallangeRatingGUI gui)
    {
		super(gui, 116);
    }
	
	//Presses buttons to reset fields and reset results
	//Activates when button is clicked
	//@param Empty
	//@return Empty
	public void clicked()
	{
		//System.out.println("Working for Clear All");
		gui.fieldButton().clicked();
		gui.resultButton().clicked();
	}
}