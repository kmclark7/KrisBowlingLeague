package test;

import control.TeamHelper;
import model.Team;

public class TeamTester {

	public static void main(String[] args) {

		TeamHelper teamHelper = new TeamHelper();
		
		Team toAdd = new Team("Holy Rollers", "Expert", "Wednesday");
		
		teamHelper.insertTeam(toAdd);
		
	}

}
