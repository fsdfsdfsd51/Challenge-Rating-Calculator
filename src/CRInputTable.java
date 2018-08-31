import java.util.*;
//CRInputTable
//
//CRInputTable holds and controls all input texts
//
//Version 1.0: Holds a list of CRInputBox objects. It cannot hold more than
//		10 CRInputBox objects. In order to create more input boxes, variables
//		in this class must be modified
//		Also checks inputs for validity, and passes error messages if an
//		invalid entry is found
//
//@author ERRM
//@version 1.0
//@since Aug 24, 2018

public class CRInputTable extends ArrayList <CRInputBox> {
	private static final long serialVersionUID = 1L;
	public static ChallangeRatingGUI gui;
	private int numOfInputs = 10;
	
	//Main Constructor for CRInputTable
	//Creates and sets each item in array
	//@param guiIn the GUI
  	//@return empty
	public CRInputTable(ChallangeRatingGUI guiIn)
	{
		gui = guiIn;
		this.add(0,new CRInputBox("Hit Dice Type"));
		this.add(1,new CRInputBox("Hit Dice Number"));
		this.add(2,new CRInputBox("Armor Class"));
		this.add(3,new CRInputBox("Resistances"));
		this.add(4,new CRInputBox("Damage Reduction"));
		this.add(5,new CRInputBox("Immunities"));
		this.add(6,new CRInputBox("Vulnerabilities"));
		this.add(7,new CRInputBox("Special Attacks"));
		this.add(8,new CRInputBox("Special Qualities"));
		this.add(9,new CRInputBox("Feats"));
		for (int i=0;i<numOfInputs;i++)
		{
			CRInputBox temp = (CRInputBox) this.get(i);
			temp.setBounds(375,(125 + (50*i)),250,55);
			gui.add(temp);
		}
	}
	
	//Checks if all inputs are valid, gives error message to user if invalid values are found
	//@param Empty
	//@return true if all entries are valid, false otherwise
	public boolean valid()
	{
		for (int i=0;i<numOfInputs;i++)
		{
			CRInputBox temp = (CRInputBox) this.get(i);
			
			if (temp.valid() == 1)
			{
				gui.output().setError("The entry for "+temp.getNameCR() + " is too large or too small. Your result is too OP, too weak, or so carefully specialized I don't know why you're bothering with this table, you clearly have a better understanding of the DnD game mechanics than we do.", -100);
				for (int j=i; j<numOfInputs; j++)
					this.get(j).setZero();
				return false;
			}
			else if (temp.valid() == 2)
			{
				gui.output().setError("The entry for "+temp.getNameCR() + " is not a useable number. Please enter a non-decimal numerical value only", 0);
				for (int j=i; j<numOfInputs; j++)
					this.get(j).setZero();
				return false;
			}
			else if (temp.valid() != 0)
			{
				gui.output().setError("Unknown Error, please restart program and try again", 25);
				for (int j=i; j<numOfInputs; j++)
					this.get(j).setZero();
				throw new java.lang.Error("Valid Input Check malfunctioning");
			}
		}
		return true;
	}
	
	
	//The following methods are all Override methods used to ensure that the CRInputTable
	//	cannot grow above a set size. Otherwise they are identical to the inherited methods
	//	from ArrayList
	
	//If CRInputTable is below a set size, implements ArrayList method. If CRInputTable is
	//	above a set size, does nothing
	//@param CRInputBox e the element to be added
	//@return false if element could not be added, otherwise inherit from ArrayList
	@Override
	public boolean add(CRInputBox e) {
		if (this.size()<numOfInputs)
			return super.add(e);
		return false;
	}
	
	//If CRInputTable is below a set size, implements ArrayList method. If CRInputTable is
	//	above a set size, does nothing
	//@param int index the slot to put the item at, CRInputBox e the element to be added
	//@return Empty if element could not be added, otherwise inherit from ArrayList
	@Override
	public void add(int index, CRInputBox e) {
		if (this.size()<numOfInputs)
			super.add(index, e);
	}
	
	//Does nothing- this list isn't allowed to add a collection
	//@param Collection e
	//@return false
	@Override
	public boolean addAll(Collection e)
		{return false;}
	
	//Does nothing- this list isn't allowed to add a collection
	//@param int index, Collection e
	//@return false
	@Override
	public boolean addAll(int index, Collection e)
		{return false;}
}
