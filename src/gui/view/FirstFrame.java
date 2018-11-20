package gui.view;

import javax.swing.JFrame;

import gui.controller.GuiController;

public class FirstFrame extends JFrame
{
	private GuiController appController;
	private FirstPanel appPanel;
	
	public FirstFrame(GuiController appController)
	{
		super();//if you use a class with extends you need the super method IT IS FIRST
		this.appController = appController;
		this.appPanel = new FirstPanel(appController);//Remember that panels are in frames
		
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(appPanel);//this refrences the panel so we can get buttons
		this.setSize(800,800);
		this.setTitle("Fug");
		this.setResizable(true);
		this.setVisible(true);//<--- IIIIIIIIMMMMMMMMMPPPPPPPPOOOOOOORRRRRRRTTTTTTTAAAAAAAANNNNNNNTTTTTTT put it last
		
	}
}
