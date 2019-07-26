package WorkingwithDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Tc1Database {

public static void main(String[] args)throws 
InstantiationException, IllegalAccessException, 
                       ClassNotFoundException, SQLException {
        Connection conn;
        String url="jdbc:mysql://localhost:3306/";
		String dbname="testing";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="onlineqa";
		
	
		//Create Object for database
          Class.forName(DBdriver).newInstance();
          
          
        //DB Connection
         
      conn=DriverManager.getConnection(url+dbname,userName,password)    ;
      
      //send quer
      
      PreparedStatement psmt=conn.prepareStatement("select * from emp");
      
      //Execute quer
      
      ResultSet rs=psmt.executeQuery();
      
      while(rs.next()){
    	  
    	 for(int i=1;i<=8;i++){
    		 System.out.println(rs.getString(i));
    	 }
}


      

	}

}
