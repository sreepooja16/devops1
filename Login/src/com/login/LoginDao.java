package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

public boolean validateUser(String user, String pass) {
boolean st =false;
try {


Class.forName("com.mysql.jdbc.Driver");


Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pooja_db","root","");
PreparedStatement ps = con.prepareStatement("select * from login where userName=? and password=? ");
ps.setString(1, user);
ps.setString(2, pass);

ResultSet rs =ps.executeQuery();
st = rs.next();
return st;
}
catch(Exception e) {
System.out.println(e.getMessage());
}
return st;
}



}

