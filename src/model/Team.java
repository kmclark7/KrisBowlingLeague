package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teamId;
	@Column(nullable = false)
	private String teamName;
	@Column
	private String teamType;
	@Column
	private String preferredNight;
	
	public Team() {
		super();
	}
	
	public Team(String teamName, String teamType, String preferredNight) {
		super();
		this.teamName = teamName;
		this.teamType = teamType;
		this.preferredNight = preferredNight;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public String getPreferredNight() {
		return preferredNight;
	}

	public void setPreferredNight(String preferredNight) {
		this.preferredNight = preferredNight;
	}

	public int getTeamId() {
		return teamId;
	}

	
}
