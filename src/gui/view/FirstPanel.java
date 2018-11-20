package gui.view;

import javax.swing.*;
import gui.controller.GuiController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel

{
	private GuiController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	
	public FirstPanel(GuiController appController)
	
	{
	    super();
		this.appController = appController;
		
		myButton = new JButton("Click");
		myLabel = new JLabel("words");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		this.setLayout(appLayout);//Spring layout puts the gui components into a Spring
		this.add(myButton);
		this.add(myLabel);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, myLabel, 74, SpringLayout.NORTH, this);
	    appLayout.putConstraint(SpringLayout.EAST, myLabel, -86, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, myButton, 174, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, myButton, -135, SpringLayout.SOUTH, this);
		
	}
	
	private void setupListeners()// what happens when you click a button
	{
		myButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent mouseClick) {changeColor();}});
	}
	
	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	

}
