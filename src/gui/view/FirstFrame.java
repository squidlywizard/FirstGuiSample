package gui.view;

import javax.swing.JFrame;

public class FirstFrame extends JFrame
{
	public FirstFrame()
	{
		super();
		//if you use a class with extends you need the super method 
		setupFrame();
	}

	private void setupFrame()
	{
		this.setSize(800,800);
		this.setTitle("Fug");
		this.setResizable(true);
		this.setVisible(true);//<--- IIIIIIIIMMMMMMMMMPPPPPPPPOOOOOOORRRRRRRTTTTTTTAAAAAAAANNNNNNNTTTTTTT put it last
		
	}
}
