import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;




public class JdbcCrudOperation {
	String path="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String un="system";
	 String pw="system";
	 Scanner scan=null;
	 Connection con=null;
	 PreparedStatement pstmt=null;
	
	 String Query="insert into car values(?,?,?)";
	public void insert() {
		
		try {
			Class.forName(path);
			   con=DriverManager.getConnection(url,un,pw);
			   pstmt=   con.prepareStatement(Query);
			   scan=new Scanner(System.in);
			   System.out.println("enter brand");
			   String s=scan.next();
			   System.out.println("enter cost");
			   int cost =scan.nextInt();
			   System.out.println("enter id");
			   int id=scan.nextInt();
			   
			   pstmt.setString(1,s);
			   pstmt.setInt(2,cost);
			   pstmt.setInt(3,id);
			   pstmt.executeUpdate();
			   System.out.println("success");
			   } catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public void display() {
		
		String path="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un="system";
		 String pw="system";
		 Scanner scan=null;
		 PreparedStatement pstmt=null;
		 String Query="select * from car where id=?";
		 ResultSet rs=null;
		try {
			Class.forName(path);
			   con=DriverManager.getConnection(url,un,pw);
			    pstmt=   con.prepareStatement(Query);
			    System.out.println("enter id");
			  scan=new Scanner(System.in);
				   int id =scan.nextInt();
				   pstmt.setInt(1, id);
				  rs = pstmt.executeQuery();
				  while(rs.next()==true) {
					  String brand=rs.getString(1);
					  int cost=rs.getInt(2);
					  int id1=rs.getInt(3);
					  System.out.println(brand+" "+cost+" "+id1);
					  
				  }
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void delete() {
		String path="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String un="system";
		 String pw="system";
		 Scanner scan=null;
		 PreparedStatement pstmt=null;
		 String Query="delete from car where id=?";
		try {
			Class.forName(path);
			   con=DriverManager.getConnection(url,un,pw);
			    pstmt=con.prepareStatement(Query);
			    System.out.println("enter id");
			  scan=new Scanner(System.in);
				   int id =scan.nextInt();
				   pstmt.setInt(1, id);
				   pstmt.executeUpdate();
				   System.out.println("success");
			 
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
