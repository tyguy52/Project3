package project03;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphicEntry extends JPanel
{
	Color background = new Color(238,238,238);
	
	public static Container createGraph()
	{
		JPanel graphicPanel = new JPanel();
		graphicPanel.setVisible(true);
		return graphicPanel;
	}
	
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		this.setBackground(background);
		
		g.drawLine(50,50,50,500);
		g.drawLine(50, 500, 500, 500);
		
		
	}
	
	
}
