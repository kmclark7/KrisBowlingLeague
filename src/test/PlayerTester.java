package test;

import control.PlayerHelper;
import control.TeamHelper;
import model.Player;
import model.Team;

public class PlayerTester {

	public static void main(String[] args) {

		PlayerHelper playerHelper = new PlayerHelper();
		TeamHelper teamHelper = new TeamHelper();
		
		
		Team team = teamHelper.findById(1);
		Player toAdd = new Player("Johnny", "Redshoes", "515-555-1212", "jRed", team);
		
		playerHelper.insertPlayer(toAdd);
	}

}
