//CRCalcResButton
//
//CRCalcResButton calculates output values from input numbers
//
//Version 1.0: Uses basic algorithm to calculate outputs, given specific inputs.
//		Passes result messages to output text box, and changes text size depending
//		on how large the values are
//
//Credit for equations goes to user Kaww at http://www.giantitp.com/forums/showthread.php?192329-CR
//
//@author ERRM, algorithms created at http://www.giantitp.com/forums/showthread.php?192329-CR
//@version 1.0
//@since Aug 24, 2018

public class CRCalcResButton extends CRButton{
    public static final long serialVersionUID = 1L;
    private int atkBns;
    private int AC;
    private double CR;
    
    //Main Constructor for CRCalcResButton
  	//@param gui the GUI
  	//@return empty
	public CRCalcResButton(ChallangeRatingGUI gui)
    {
		super(gui, 896);
    }
	
	//Gets values to calculate and provides outputs
	//Activates when button is clicked
	//@param Empty
	//@return Empty
	public void clicked()
	{
		//System.out.println("Working for Calculate Result");
		int[] values = new int[10];
		if (gui.table().valid() == true)
		{
			for (int i=0;i<10;i++)
				values[i] = Integer.parseInt(gui.table().get(i).getText());
			this.calculateCR(values);
			if (CR > 99999999)
				gui.output().resizeText(25);
			else if (CR > 99)
				gui.output().resizeText(30);
			else
				gui.output().resizeText(40);
			gui.output().setTextCR("Challenge Rating: "+(Integer.toString((int)CR)),"Attack Bonus: "+(Integer.toString(atkBns)),"Armor Class: "+(Integer.toString(AC)));
		}
	}
	
	//Calculates the challenge rating, AC, and attack bonus from the given inputs
	//@param list the collection of all input values
	//@return CR the challenge rating
	private int calculateCR(int[] list)
	{
		double Div = 0;
	    CR = 0;
	    double AverageDieAmount = (list[0]/2)+0.5;
	    double AverageHP = AverageDieAmount*list[1];
	    if(5 >= list[1])
	        Div = 4.5;
	    else if(list[1] > 5 && 10>= list[1])
	        Div = 5;
	    else if(list[1] > 10 && 15>= list[1])
	        Div = 5.5;
	    else if(list[1] > 15 && 20>= list[1])
	    	Div = 6;
	    else if(list[1] > 20 && 25>= list[1])
	        Div = 6.5;
	    else if(list[1] >25)
	        Div = Math.round(0.0961538462*list[1]+4.25);
	    double HPRating = AverageHP/Div;
	    CR = CR+HPRating;
	    CR = CR+((int) list[2]/5);
	    CR = CR+list[3];
	    CR = CR+(list[4]/10);
	    CR = CR+(list[5]*2);
	    CR = CR - list[6];
	    CR = CR+list[7];
	    CR = CR+list[8];
	    CR = CR+(list[9]/2);
	    CR = CR/3;
	    atkBns = (int) ((1.6661654135*CR)+1.3052631579);
	    AC = (int) ((1.1323308271*CR)+10.3105263158);
	    return (int) CR;
	}
}
