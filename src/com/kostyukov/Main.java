package com.kostyukov;

public class Main
{
	public static void main(String[] args)
	{
		SportLeague<BaseballTeam> baseballLeague = new SportLeague<>("Baseball Bundesliga");
		
		baseballLeague.addTeam(new BaseballTeam("Bonn Capitals", 21));
		baseballLeague.addTeam(new BaseballTeam("Untouchables Paderborn", 12));
		baseballLeague.addTeam(new BaseballTeam("Buchbinder Legionäre Regensburg", 3));
		baseballLeague.addTeam(new BaseballTeam("Stuttgart Reds", 19));
		baseballLeague.addTeam(new BaseballTeam("Heidenheim Heideköpfe", 2));
		baseballLeague.addTeam(new BaseballTeam("Mainz Athletics", 5));
		baseballLeague.addTeam(new BaseballTeam("Dortmund Wanderers", 6));
		baseballLeague.addTeam(new BaseballTeam("Cologne Cardinals", 2));
		baseballLeague.addTeam(new BaseballTeam("Berlin Flamingos", 7));
		
		SportLeague<FootballTeam> footballLeague = new SportLeague<>("1s Football Division");
		
		footballLeague.addTeam(new FootballTeam("1. FC Nürnberg", 9));
		footballLeague.addTeam(new FootballTeam("FC Bayern Munich", 27));
		footballLeague.addTeam(new FootballTeam("Borussia Dortmund", 8));
		footballLeague.addTeam(new FootballTeam("Borussia Mönchengladbach", 5));
		footballLeague.addTeam(new FootballTeam("SV Werder Bremen", 4));
		footballLeague.addTeam(new FootballTeam("Hamburger SV", 6));
		footballLeague.addTeam(new FootballTeam("VfB Stuttgart", 5));
		footballLeague.addTeam(new FootballTeam("1. FC Köln", 3));
		
		footballLeague.printTeams();
		baseballLeague.printTeams();
	}
}
