package com.gamingroom;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity{
	
	//long id;
	//String name;
	
	private static List<Team> teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name
	 */
	
	public Game(long id, String name) {

	}

	public Team addTeam(String name) {
		
		// a local game instance
		Team team = null;

		// Using iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Team> i = teams.iterator();
			while (i.hasNext()) {
			
		// if not found, make a new game instance and add to list of games
				if (team == null) {
					team = new Team(team.getId(), name);
					teams.add(team);
				}
			}

		// return the new/existing game instance to the caller
		return team;
	}
	

	@Override
	public String toString() {
		
		return "Game [id=" + getId() + ", name=" + getName() + "]";
	}

}
