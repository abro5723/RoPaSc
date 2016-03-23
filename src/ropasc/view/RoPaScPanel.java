package ropasc.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import ropasc.controller.RoPaScController;

public class RoPaScPanel extends JPanel
{
	
	private RoPaScController baseController;
	private JButton rockButton;
	private JButton scissorButton;
	private JButton paperButton;
	private SpringLayout baseLayout;
	private JLabel userChoice;
	
	public RoPaScPanel(RoPaScController baseController)
	{
		this.baseController = baseController;
		rockButton = new JButton("Rock(lobster)");
		paperButton = new JButton("Paper(cuts)");
		scissorButton = new JButton("Scissors(cut too)");
		baseLayout = new SpringLayout();
		userChoice = new JLabel("");
		

		//winTieLoseLabel = new JLabel(RoPaSc.winTieLose);
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupListeners()
	{
		rockButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				userChoice.setText("Rock");
			}
		});
	}
	
	private void setupPanel()
	{
		this.add(paperButton);
		this.setLayout(baseLayout);
		//this.add(winTieLoseLabel);
		this.add(rockButton);
		this.add(scissorButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rockButton, 0, SpringLayout.NORTH, paperButton);
		baseLayout.putConstraint(SpringLayout.WEST, rockButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorButton, 0, SpringLayout.NORTH, paperButton);
		baseLayout.putConstraint(SpringLayout.EAST, scissorButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, paperButton, 150, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, paperButton, -10, SpringLayout.SOUTH, this);
	}
}
