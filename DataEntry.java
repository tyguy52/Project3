package project03;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import java.awt.event.*;
import java.awt.*;


public class DataEntry
{
	private static String age;
	private String startSave;
	private String dailySave;
	private String retireAge;
	private String retireIncome;
	private String lifeExpect;
	private String intrestRate;
	private String inflationRate;
	private static String value = "";
	
	final static String[] labels =
	{
		"Current Age: ", "Starting Savings: ", "Daily Savings: ", "Retirement Age: ", " Annual Retirement Income: ", "Life Expectancy: ", "Intrest Rate: ", "Inflation Rate: "
	};
	final static MyTextField[] textEntry = new MyTextField[labels.length];
		
	protected static Container createGUI()
	{
		JPanel dataPanel = new JPanel(new GridLayout(4,2));
		
		for(int i=0; i<labels.length; i++)
		{
			JLabel l = new JLabel(labels[i], JLabel.TRAILING);
			dataPanel.add(l);
			textEntry[i] = new MyTextField(10);
			l.setLabelFor(textEntry[i]);
			dataPanel.add(textEntry[i]);
		}
		
		return dataPanel;
		
	}
	
	private static class MyTextField extends JTextField implements DocumentListener 
	{
		
		public MyTextField(int l) 
		{
			super(l);
			Document doc = this.getDocument();
			doc.addDocumentListener(this);		
		}

		
		public void changedUpdate(DocumentEvent e)
		{
			setValue(getText());
			System.out.println(getText());
		}

		
		public void insertUpdate(DocumentEvent e) 
		{
			setValue(getText());
			System.out.println(getText());
		}

		
		public void removeUpdate(DocumentEvent e)
		{
			setValue(getText());
			System.out.println(getText());
		}
	}
	
	
	public String getAge()
	{
		return age;
	}
	
	public static void setAge(String age)
	{
		DataEntry.age = age;
	}
	
	public String getStartSave()
	{
		return startSave;
	}
	
	public void setStartSave(String startSave)
	{
		this.startSave = startSave;
	}
	
	public String getDailySave()
	{
		return dailySave;
	}
	
	public String getRetireAge()
	{
		return retireAge;
	}
	
	public void setRetireAge(String retireAge)
	{
		this.retireAge = retireAge;
	}
	
	public String getRetireIncome()
	{
		return retireIncome;
	}
	
	public void setRetireIncome(String retireIncome)
	{
		this.retireIncome = retireIncome;
	}
	
	public String getLifeExpect()
	{
		return lifeExpect;
	}
	
	public void setLifeExpect(String lifeExpect)
	{
		this.lifeExpect = lifeExpect;
	}
	
	
	public String getIntrestRate()
	{
		return intrestRate;
	}
	
	public void setIntrestRate(String intrestRate)
	{
		this.intrestRate = intrestRate;
	}
	
	public String getInflationRate()
	{
		return inflationRate;
	}
	
	public void setInflationRate(String inflationRate)
	{
		this.inflationRate = inflationRate;
	}

	public String getValue() {
		return value;
	}

	public static void setValue(String value) {
		DataEntry.value = value;
	}
}


