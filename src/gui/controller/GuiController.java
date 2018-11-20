package gui.controller;

import gui.model.*;
import gui.view.FirstFrame;
public class GuiController
{
	private Duck myDuck;
	private FirstFrame appFrame;
	public GuiController() 
	{
		myDuck = new Duck();//put these 2 in this order
		appFrame = new FirstFrame(null);
	}

	public void start()
	{
		
		
	}

}
