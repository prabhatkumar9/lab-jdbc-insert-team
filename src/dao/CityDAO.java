package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.City;
import utility.ConnectionManager;
public class CityDAO{
    ConnectionManager cm = new ConnectionManager();
    Connection con;
    public void createCity(City city) throws Exception {
	String sql = "insert into cityyy values(?,?)";
	con = ConnectionManager.getConnection();
	PreparedStatement ps =  con.prepareStatement(sql);
	ps.setLong(1, city.getCityId());
	ps.setString(2, city.getCityName());
	ps.executeUpdate();
    }    
    public City getCityByName(String name) throws Exception {
	String cityDetails = "select * from cityyy";
	con = ConnectionManager.getConnection();
	PreparedStatement ps =  con.prepareStatement(cityDetails);
	ResultSet rs = ps.executeQuery();
	System.out.println("Team Details are  : ");
	while(rs.next()) {
	    if(name.equals(rs.getString("name")))
		System.out.println(rs.getInt(1)+"     "+rs.getString(2));
	}
	rs.close();
	return null;
    }
}