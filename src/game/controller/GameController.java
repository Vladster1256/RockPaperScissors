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
	public Scanner $Scanner;
	public int $playerAnswer;
	public String $initializeMessage;

	public GameController()
	{
		$cpu = new String[3];
		$player = new String[3];
		$started = false;
		$Scanner = new Scanner(System.in);
		$console = new GameConsole($Scanner);
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
		$initializeMessage = "Welcome to teh awesome rock, paper, scissors game. 0 is rock, 1 is paper, and 2 is scissors";
		$console.Output($initializeMessage);
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
			checkConditions();

		}
	}

	public String randomCPUChoice()
	{
		$cpuChoice = $cpu[(int) Math.random() * 3];

		return $cpuChoice;
	}

	public String get$initializeMessage()
	{
		return $initializeMessage;
	}

	public void checkConditions()
	{
		$playerAnswer = $console.checkPlayerInput();

		try
		{
			if ($player[$playerAnswer] == $cpuChoice)
			{
				$console.Output("We Match" + $cpuChoice);
			}
		} catch (NumberFormatException nFE)
		{
			$console.Output("Na m8, use ints");
		}
		whileInGame();
	}
}
