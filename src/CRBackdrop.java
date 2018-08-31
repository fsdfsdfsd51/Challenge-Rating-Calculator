import javax.swing.*;
//CRBackdrop
//
//CRBackdrop creates the panel that holds the background. This panel
//		is used elsewhere to hold all other visible objects in the program.
//		CRBackdrop serves as the base of the application for other
//		user-interface objects. CRBackdrop is critical in adding
//		new use able and/or visible objects to the application
//
//Version 1.0: Shows the background image provided and creates the pane
//		and label
//
//@author ERRM
//@version: 1.0
//@since: Aug 24, 2018


public class CRBackdrop extends JPanel  {
	private ImageIcon backdrop;
	private JLabel label;
	public JDesktopPane deskPane = new JDesktopPane();
	private JFrame frame = new JFrame();
	private static int width = 1280;
	private static int height = 720;
    private static final long serialVersionUID = 1L;
	
    //Main Constructor for class CRBackdrop
    //Constructor sets initial variables for CRBackdrop
  	//@param Empty
  	//@return empty
	public CRBackdrop()
	{
		backdrop = new ImageIcon(getClass().getResource("CRCalc_Background.jpg"));
		label = new JLabel(backdrop);
		label.setBounds(0,0,width,height);
		this.setOpaque(false);
		this.setBounds(0,0,width,height);
		setLayout(null);
		deskPane.add(label,new Integer(50));
		deskPane.add(this,new Integer(350));
		frame.setContentPane(deskPane);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}