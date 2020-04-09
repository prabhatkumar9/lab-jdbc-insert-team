package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	System.out.println("Connection Established");
	final String insert_team = "insert into teammm(Id,name,coach,home_city_id,captain)  values (?,?,?,?,?)";
	PreparedStatement ps = con.prepareStatement(insert_team);
	ps.setInt(1, teamid);
	ps.setString(2, name);
	ps.setString(3,coach);
	ps.setLong(4,cityid);
	ps.setInt(5, captain);
	ResultSet rs= ps.executeQuery();
	if(rs.next()) {
	    System.out.println("Data inserted successfully");
	}
	
//	System.out.println(x);
    }
}
