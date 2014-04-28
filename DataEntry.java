package project03;

import javax.swing.*;

import java.awt.*;

public class DataEntry
{
	
	
	
	protected static Container CreateGUI()
	{
		final String[] labels =
			{
				"Current Age: ", "Starting Savings: ", "Daily Savings: ", "Retirement Age: ", " Annual Retirement Income: ", "Life Expectancy: ", "Intrest Rate: ", "Inflation Rate: "
			};
		final JTextField[] textEntry = new JTextField[labels.length];
		
		JPanel dataPanel = new JPanel(new GridLayout(4,2));
		for(int i=0; i<labels.length; i++)
		{
			JLabel l = new JLabel(labels[i], JLabel.TRAILING);
			dataPanel.add(l);
			textEntry[i] = new JTextField(10);
			l.setLabelFor(textEntry[i]);
			dataPanel.add(textEntry[i]);
		}
		return dataPanel;
	}
}
