package com.kostyukov;

public abstract class Team implements Comparable<Team>
{
	private String name;
	private int score;
	
	public Team(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	@Override
	public int compareTo(Team team)
	{
		if (this.score > team.getScore())
			return -1; // team with a highest score should be on top
		else if (score == team.getScore())
			return 0;
		else
			return 1;
	}
}
