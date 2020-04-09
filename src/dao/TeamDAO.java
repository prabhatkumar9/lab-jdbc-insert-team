package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
    
    ConnectionManager cm = new ConnectionManager();
    Connection con;
    
    public void createTeam(Team team) throws Exception {
	int teamid = team.getTeamid();
	String name = team.getName();
	String coach = team.getCoach();
	City city = team.getCity();
	long cityid = city.getCityId();
	int captain = team.getCaptain();
	
	con = ConnectionManager.getConnection();
	
	final String insert_team = "insert into teammm  values (?,?,?,?,?);";
	PreparedStatement ps = con.prepareStatement(insert_team);
	ps.setInt(1, teamid);
	ps.setString(2, name);
	ps.setString(3,coach);
	ps.setLong(4,cityid);
	ps.setInt(5, captain);
	ps.executeQuery();
//	System.out.println(x);
    }
}
