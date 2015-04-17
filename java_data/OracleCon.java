import java.sql.SQLException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OracleCon{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("ê⁄ë±äÆóπ");
			
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			
			try{
				System.out.println("ê⁄ë±íÜ");
				String s = buff.readLine();
				
			}catch(IOException e){}
			
			con.close();
			
			System.out.println("êÿífäÆóπ");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
