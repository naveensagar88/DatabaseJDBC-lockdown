import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host="localhost";
		String port="3306";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "root");
		
		Statement S=con.createStatement(); 
		ResultSet rs=S.executeQuery("select *from Employeeinf where location='Mysore'");
		
		while(rs.next())
		{
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("Name"));

		}
		/*
		while(rs.next())
		{
			System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://login.salesforce.com");

			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("name"));

			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("location"));
		}
		}
		
*/
	}
}
