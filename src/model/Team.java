package model;
public class Team{
    private String name;
    private String coach;
    private City city;
    private int captain;
    private int teamid;
    
    public Team(String name,String coach,City city) {
	this.setName(name);
	this.setCoach(coach);
	this.setCity(city);
    }
    public String getName() {
	return name;
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getCoach() {
	return coach;
    }
    public void setCoach(String coach) {
	this.coach = coach;
    }
    public City getCity() {
	return city;
    }
    public void setCity(City city) {
	this.city = city;
    }
    public int getCaptain() {
	return captain;
    }
    public void setCaptain(int captain) {
	this.captain = captain;
    }
    public int getTeamid() {
	return teamid;
    }
    public void setTeamid(int teamid) {
	this.teamid = teamid;
    }
}