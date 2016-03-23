package ropasc.view;

import javax.swing.*;

import ropasc.controller.RoPaScController;

public class RoPaScFrame extends JFrame
{
	private RoPaScController baseController;
	private RoPaScPanel basePanel;
	
	public RoPaScFrame(RoPaScController baseController)
	{
		this.baseController = baseController;
		basePanel = new RoPaScPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(300, 300);
		this.setTitle("ROCK PAPER SCIXORZ");
		this.setResizable(false);
		this.setVisible(true);
	}

	public RoPaScController getBaseController() 
	{
		return baseController;
	}

	public void setBaseController(RoPaScController baseController) 
	{
		this.baseController = baseController;
	}

	public RoPaScPanel getBasePanel() {
		return basePanel;
	}

	public void setBasePanel(RoPaScPanel basePanel) 
	{
		this.basePanel = basePanel;
	}
	
	
}
