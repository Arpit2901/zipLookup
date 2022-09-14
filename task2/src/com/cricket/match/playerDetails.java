package com.cricket.match;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class playerDetails {
	private String name;
	private String teamName;
	private int matches;

	public playerDetails(String name, String teamName, int matches) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.matches = matches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public void record(String s) {

		try {
			FileWriter writer = new FileWriter("D://av/records.csv", true);
			writer.write(s+",");

			System.out.println("Successfully written");
			// close the file
			writer.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
