package ropasc.controller;

import java.util.ArrayList;

import ropasc.view.RoPaScFrame;

public class RoPaScController 
{
	String userRock;
	String userScissors;
	String userPaper;
	String userChoice;
	
	private RoPaScFrame baseFrame;
	
	String cpuRock;
	String cpuPaper;
	String cpuScissors;
	public String cpuChoice;
	
	public ArrayList<String> userTies;
	public ArrayList<String> userWins;
	public ArrayList<String> userLosses;
	
	public RoPaScController()
	{
		userRock = "Rock";
		userScissors = "Scissors";
		userPaper = "Paper";
		
		cpuRock = "Rock";
		cpuPaper = "Paper";
		cpuScissors = "Scissors";
		
		userTies = new ArrayList<String>();
		userWins = new ArrayList<String>();
		userLosses = new ArrayList<String>();
	}
	
	
	
	public String cpuChoice()
	{
		String choice = null;
		int decision = (int) (Math.random()*3);
		
		if(decision == 0)
		{
			choice = cpuRock;
		}
		
		if(decision == 1)
		{
			choice = cpuPaper;
		}
		
		if(decision == 2)
		{
			choice = cpuScissors;
		}
		
		return choice;
	}
	
	public void start()
	{
		
	}



	public String getUserRock() 
	{
		return userRock;
	}



	public void setUserRock(String userRock) 
	{
		this.userRock = userRock;
	}



	public String getUserScissors() 
	{
		return userScissors;
	}



	public void setUserScissors(String userScissors) 
	{
		this.userScissors = userScissors;
	}



	public String getUserPaper() 
	{
		return userPaper;
	}



	public void setUserPaper(String userPaper) 
	{
		this.userPaper = userPaper;
	}



	public String getUserChoice() 
	{
		return userChoice;
	}



	public void setUserChoice(String userChoice) 
	{
		this.userChoice = userChoice;
	}



	public RoPaScFrame getBaseFrame() 
	{
		return baseFrame;
	}



	public void setBaseFrame(RoPaScFrame baseFrame) 
	{
		this.baseFrame = baseFrame;
	}



	public String getCpuRock() 
	{
		return cpuRock;
	}



	public void setCpuRock(String cpuRock) 
	{
		this.cpuRock = cpuRock;
	}



	public String getCpuPaper() 
	{
		return cpuPaper;
	}



	public void setCpuPaper(String cpuPaper) 
	{
		this.cpuPaper = cpuPaper;
	}



	public String getCpuScissors() 
	{
		return cpuScissors;
	}



	public void setCpuScissors(String cpuScissors) 
	{
		this.cpuScissors = cpuScissors;
	}



	public String getCpuChoice() {
		return cpuChoice;
	}



	public void setCpuChoice(String cpuChoice) 
	{
		this.cpuChoice = cpuChoice;
	}



	public ArrayList<String> getUserTies() 
	{
		return userTies;
	}



	public void setUserTies(ArrayList<String> userTies) 
	{
		this.userTies = userTies;
	}



	public ArrayList<String> getUserWins() 
	{
		return userWins;
	}



	public void setUserWins(ArrayList<String> userWins) 
	{
		this.userWins = userWins;
	}



	public ArrayList<String> getUserLosses() 
	{
		return userLosses;
	}



	public void setUserLosses(ArrayList<String> userLosses) 
	{
		this.userLosses = userLosses;
	}
	
	

}
