package controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;
public class Main{
    public static void main(String[] args) throws Exception {
	int teamid;
	String name;
	String coach;
	long cityId;
	String cityName;
	int captain;
	
	
    TeamDAO teamdao = new TeamDAO();
    CityDAO citydao = new CityDAO();
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
     System.out.println("Enter the cityId :  ");
     cityId = Long.parseLong(br.readLine().trim());
     System.out.println("Enter the city name :  ");
     cityName=br.readLine();
     
     System.out.println("Enter team id :  ");
     teamid = Integer.parseInt(br.readLine().trim());
     System.out.println("Enter team name:  ");
     name=br.readLine();
     System.out.println("Enter coach name:  ");
     coach=br.readLine();
     System.out.println("Enter captain number :  ");
     captain= Integer.parseInt(br.readLine());
    
     
     City city = new City(cityId, cityName);
     city.setCityName(cityName);
     city.setCityId(cityId);
     
     Team team = new Team(name, coach, city);
     	team.setTeamid(teamid);
	team.setName(name);
	team.setCoach(coach);
	team.setCity(city);	
	team.setCaptain(captain);
   
	 teamdao.createTeam(team);
	 citydao.createCity(city);
	 citydao.getCityByName(cityName);

    }
 }






