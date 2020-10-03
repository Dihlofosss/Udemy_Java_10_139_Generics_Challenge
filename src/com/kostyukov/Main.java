package com.kostyukov;

public class Main
{
	public static void main(String[] args)
	{
		BaseballTeam bonnCapitals = new BaseballTeam("Bonn Capitals");
		BaseballTeam paderbornUntouchables = new BaseballTeam("Paderborn Untouchables");
		bonnCapitals.setScore(21);
		paderbornUntouchables.setScore(12);
		
		FootballTeam locomotive = new FootballTeam("Locomotive Leipzig");
		FootballTeam bayern = new FootballTeam("FC Bayern");
		FootballTeam dresden_dynamo = new FootballTeam("Dresden Dynamo");
		locomotive.setScore(13);
		bayern.setScore(8);
		dresden_dynamo.setScore(9);
		
		SportLeague<BaseballTeam> baseballLeague = new SportLeague<>("League Of Legends");
		baseballLeague.addTeam(bonnCapitals);
		baseballLeague.addTeam(paderbornUntouchables);
		
		SportLeague<FootballTeam> footballLeague = new SportLeague<>("1s Football Division");
		footballLeague.addTeam(locomotive);
		footballLeague.addTeam(bayern);
		footballLeague.addTeam(dresden_dynamo);
		
		footballLeague.printTeams();
		baseballLeague.printTeams();
	}
}
