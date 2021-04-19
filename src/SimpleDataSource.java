import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleDataSource {
	private static String url;
	private static String username;
	private static String password;

	/**
	 * Gets a connection to the database.
	 * 
	 * @return the database connection
	 */
	public static Connection getConnection() throws SQLException {
		String server = "jdbc:mysql://localhost/";
		String database = "oop2_project";
		url = server + database;
		username = "root";
		password = "root";
		return DriverManager.getConnection(url, username, password);
	}
	}