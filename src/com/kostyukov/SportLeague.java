package com.kostyukov;

import java.util.ArrayList;
import java.util.Collections;

public class SportLeague<T extends Team>
{
	private String name;
	private ArrayList<T> teamsList;
	
	public SportLeague(String name)
	{
		this.name = name;
		teamsList = new ArrayList<>();
	}
	
	public void addTeam(T team)
	{
		if (teamsList.contains(team))
		{
			System.out.println("Team - " + team.getName() + " is already on the list");
			return;
		}
		teamsList.add(team);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void printTeams()
	{
		Collections.sort(teamsList);
		System.out.println("\nSport league - " + name);
		for (T team : teamsList)
		{
			System.out.println("Team: " + team.getName() + ", with score: " + team.getScore());
		}
	}
}