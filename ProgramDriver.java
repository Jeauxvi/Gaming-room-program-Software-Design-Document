package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	/**
	 * The one-and-only main() method
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		// obtaining reference to the singleton instance
		GameService service = GameService.getNewGame(); // replace null with ???
		
		
		System.out.println("\nAbout to test initializing game data...");
		
		// initialize with some game data
		Game game1 = service.addGame("Game #1");
		System.out.println(game1.toString());
		
		Team team1 = game1.addTeam("BLue Team");
		Team team2 = game1.addTeam("Red Team");
		
		System.out.println(team1.toString());
		System.out.println(team2.toString());
		
		Player player1 = team1.addPlayer("Jovi");
		Player player2 = team1.addPlayer("Katie");
		Player player3 = team2.addPlayer("Ezra");
		Player player4 = team2.addPlayer("Isla");
		
		
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		System.out.println(player3.toString());
		System.out.println(player4.toString());	

		
		
		// use another class to prove there is only one instance
		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
