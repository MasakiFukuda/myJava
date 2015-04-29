import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleCon3{
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("ê⁄ë±äÆóπ");
			
			String sql = "insert into emp(empno,ename) values(1001,'FUKUDA')";
			
			Statement st = con.createStatement();
			
			int count = st.executeUpdate(sql);
			
			System.out.println(count+"åèèàóùäÆóπ");
			
			con.commit();
			
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
			if(cn!=null&&st!=null){
				try{
					st.close();
					cn.close();
				}catch(SQLException e){
					e.printStackTrace()
				}
			}
			
		}finally{
			try{
				if(st!=null){
					st.close();
				}
				if(cn!=null){
					cn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
