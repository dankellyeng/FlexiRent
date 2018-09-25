package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnect {

public static void main (String[] args) {
	
	final String PROPS_TABLE = "propTable";

try (Connection con = getConnection(PROPS_TABLE)) {
	System.out.println("Connection to database " + PROPS_TABLE + " created successfully");
	
} catch (Exception e) {
	System.out.println(e.getMessage());
}
}

public static Connection getConnection(String propTable)
throws SQLException, ClassNotFoundException {
	
Class.forName("org.hsqldb.jdbc.JDBCDriver");

Connection con = DriverManager.getConnection("jdbc:hsqldb:file:database/" + propTable, "SA", "");

return con;
}

}