package gui.view;

import javax.swing.*;
import gui.controller.GuiController;

public class FirstPanel extends JPanel

{
	private GuiController appController;
	private JButton myButton;
	private JLabel myLabel;
	
	public FirstPanel(GuiController appController)
	
	{
		super();
		this.appController = appController;
		
		myButton = new JButton("Click");
		myLabel = new JLabel("words");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupPanel()
	{
		this.add(myButton);
		this.add(myLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	

}
