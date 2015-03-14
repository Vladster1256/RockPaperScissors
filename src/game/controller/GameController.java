package game.controller;

import java.util.Scanner;

import game.output.GameConsole;

public class GameController
{
	public GameConsole $output;
	private String[] $cpu;
	private String[] $player;
	private String $cpuChoice;
	private boolean $started;
	public GameConsole $console;
	public String $playerAnswer;
	public String $initializeMessage;
	public Boolean $playerWin;
	public int $score;
	public int $losses;
	public int $games;
	public Scanner $scanner;
	int timesDone = 0;

	public GameController()
	{
		$cpu = new String[3];
		$player = new String[3];
		$started = false;
		$scanner = new Scanner(System.in);
	}

	public void start()
	{
		buildArrays();
		initilizeGame();
		whileInGame();

	}

	public void buildArrays()
	{
		$cpu[0] = "rock";
		$cpu[1] = "paper";
		$cpu[2] = "scissors";
		$player[0] = "rock";
		$player[1] = "paper";
		$player[2] = "scissors";
	}

	public void initilizeGame()
	{
		$initializeMessage = "Welcome to teh awesome rock, paper, scissors game.";
		System.out.println($initializeMessage);
		$started = true;
	}

	public void whileInGame()
	{
		while ($started == false)
		{

		}
		while ($started == true)
		{
			randomCPUChoice();
			System.out.println($cpuChoice);
			$playerAnswer = $scanner.nextLine();
			$playerWin = checkPlayerInput($playerAnswer);
			checkConditions();

		}
	}

	public String randomCPUChoice()
	{
		int randomInt = (int) Math.random() * 3;
		$cpuChoice = $cpu[randomInt];

		return $cpuChoice;
	}

	public String get$initializeMessage()
	{
		return $initializeMessage;
	}

	public void checkConditions()
	{
		if ($playerWin == true)
		{
			$score++;
			$games++;
			System.out.println("Your score: " + $score);
			System.out.println("Your loses: " + $losses);
			System.out.println("Your total number of games: " + $games);

		}
		if ($playerWin == false)
		{
			$losses++;
			$games++;
			System.out.println("Your score: " + $score);
			System.out.println("Your loses: " + $losses);
			System.out.println("Your total number of games: " + $games);

		}
	}

	public String get$RandomCPUChoice()
	{
		return $cpuChoice;
	}

	public boolean checkPlayerInput(String $playerChoiceTemp)
	{

		boolean $playerWin = false;
		boolean $unrecognizable = false;
		boolean $usefullChoice = false;
		timesDone = 0;

		while ($usefullChoice == false && $unrecognizable == false)
		{
			if ($playerChoiceTemp.equalsIgnoreCase("rock") && $cpuChoice == "rock")
			{
				System.out.println("we tie.");
				$playerWin = false;
				$unrecognizable = true;
				$usefullChoice = true;

			}
			if ($playerChoiceTemp.equalsIgnoreCase("paper") && $cpuChoice == "paper")
			{
				System.out.println("we tie.");
				$playerWin = false;
				$unrecognizable = true;
				$usefullChoice = true;

			}
			if ($playerChoiceTemp.equalsIgnoreCase("scissors") && $cpuChoice == "scissors")
			{
				System.out.println("we tie.");
				$unrecognizable = true;
				$playerWin = false;
				$usefullChoice = true;

			}
			if ($playerChoiceTemp.equalsIgnoreCase("rock") && $cpuChoice == "scissors")
			{
				System.out.println("you win.");
				$playerWin = true;
				$unrecognizable = true;
				$usefullChoice = true;
			}
			if ($playerChoiceTemp.equalsIgnoreCase("paper") && $cpuChoice == "rock")
			{
				System.out.println("you win.");
				$playerWin = true;
				$unrecognizable = true;
				$usefullChoice = true;
			}
			if ($playerChoiceTemp.equalsIgnoreCase("scissors") && $cpuChoice == "paper")
			{
				System.out.println("you win.");
				$playerWin = true;
				$unrecognizable = true;
				$usefullChoice = true;
			}
			if ($playerChoiceTemp.equalsIgnoreCase("scissors") && $cpuChoice == "rock")
			{
				System.out.println("you lose.");
				$playerWin = false;
				$unrecognizable = true;
				$usefullChoice = true;
			}
			if ($playerChoiceTemp.equalsIgnoreCase("paper") && $cpuChoice == "scissors")
			{
				System.out.println("you lose.");
				$playerWin = false;
				$unrecognizable = true;
				$usefullChoice = true;
			}
			if ($playerChoiceTemp.equalsIgnoreCase("rock") && $cpuChoice == "paper")
			{
				System.out.println("you lose.");
				$playerWin = false;
				$unrecognizable = true;
				$usefullChoice = true;
			}
			if (!$playerChoiceTemp.equalsIgnoreCase("rock") || !$playerChoiceTemp.equalsIgnoreCase("rock") || !$playerChoiceTemp.equalsIgnoreCase("scissors") && $usefullChoice == false)
			{
				$unrecognizable = true;
				$usefullChoice = false;
				failedTest();
				
			}
			if($usefullChoice == true && $unrecognizable == false)
			{
				whileInGame();
			}
		}

		return $playerWin;
	}

	public void failedTest()
	{
		System.out.println("Please input something the computer can recognize");
		$playerAnswer = $scanner.nextLine();
		checkPlayerInput($playerAnswer);
	}
}
