package game.output;

import java.util.Scanner;

import game.controller.GameController;

public class GameConsole
{
	public GameController $controller;
	private int $Console;
	public Scanner $playerAnswer;
	
	
	public GameConsole(Scanner $playerAnswer)
	{
		this.$playerAnswer = $playerAnswer;
	}
	
	public void Output(String $wowm8)
	{
		System.out.println($wowm8);
		
	}

	public void Output(NumberFormatException nFE)
	{
		System.out.println(nFE);
		
	}
	
	public int checkPlayerInput()
	{
		int $playerChoiceTemp = $playerAnswer.nextInt();
		int $playerChoiceFinal = 0;
		boolean pass = false;
		
		while(pass == false)
		{
			if($playerChoiceTemp > 2 || $playerChoiceTemp < 0)
			{
				Output("Nah Bro, plz ");
				$playerAnswer.nextInt();
			}
			if($playerChoiceTemp < 3 && $playerChoiceTemp > -1)
			{
				$playerChoiceFinal = $playerChoiceTemp;
				pass = true;
			}
		}
		return $playerChoiceFinal;
	}

	
	
	
}
