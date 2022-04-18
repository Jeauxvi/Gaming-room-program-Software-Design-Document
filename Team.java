package com.gamingroom;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity{
	
	
	private List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		
	}
	
	public Player addPlayer(String name) {
		// a local game instance
		Player player = null;

		// Using iterator to look for existing game with same name
		// if found, simply return the existing instance
		Iterator<Player> i = players.iterator();
			while (i.hasNext()) {
			
		// if not found, make a new game instance and add to list of games
				if (player == null) {
					player = new Player(player.getId(), name);
					players.add(player);
				}
			}

		// return the new/existing game instance to the caller
		return player;
	}
	

	@Override
	public String toString() {
		return "Team [id=" + getId() + ", name=" + getName() + "]";
	}

}
