package project03;

import java.awt.*;
import javax.swing.*;

public class RetirementCalculator extends JFrame
{
	private static final int frameWidth = 500;
	private static final int frameHeight = 500;
	
	public static void main(String[]args)
	{
		
		GraphicEntry gPanel = new GraphicEntry();
		
		JFrame frame = new JFrame("Tyler's Retirement Calculator");
		frame.setVisible(true);
		//frame.setSize(frameWidth, frameHeight);
		//frame.setExtendedState(MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		frame.add(DataEntry.createGUI(), BorderLayout.NORTH);
		frame.add(gPanel, BorderLayout.CENTER);
		frame.pack();
		
	}
}
