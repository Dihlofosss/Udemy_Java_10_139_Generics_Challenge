package com.kostyukov;

import java.util.ArrayList;
import java.util.Collections;

public class SportLeague<T extends Team>
{
	private String name;
	private ArrayList<T> teams;
	
	public SportLeague(String name)
	{
		this.name = name;
		teams = new ArrayList<>();
	}
	
	public void addTeam(T team)
	{
		teams.add(team);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void printTeams()
	{
		Collections.sort(teams);
		System.out.println("\nSport league - " + name);
		for (T item : teams)
		{
			System.out.println("Team: " + item.getName() + ", with score: " + item.getScore());
		}
	}
}
