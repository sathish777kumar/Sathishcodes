package webpack;

import java.sql.*;
class DataImport_MySQL
{
/*    public static void main(String args[]) throws SQLException
     {
    	Connection conn=null;
         try
         { 
            // Load the Driver class. 
        	 Class.forName("com.mysql.jdbc.Driver");
             // Create the connection using the static getConnection method 
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL","root","password12");
            //Create a Statement class to execute the SQL statement 
            Statement stmt=conn.createStatement();
            //Execute the SQL statement and get the results in a Resultset 
            ResultSet rs=stmt.executeQuery("select * from studentinfo;");
            // Iterate through the ResultSet, displaying two values 
           // for each row using the getString method 
            while(rs.next())
             {
                System.out.println(rs.getString("Name")+"   "+rs.getString("Ph")+"   "+rs.getString("email"));
             }
        }
            catch(SQLException se)
             { 
                System.out.println("Sql Exception"+se);
             }
                  catch(ClassNotFoundException cnfe)
                  { 
                     System.out.println("Class not found Exception"+cnfe);
                   }

                 finally 
                { 
                	 try {
     	          if(conn != null)
     	          conn.close();
     	          } 
     	 catch(SQLException e) {
     	  e.printStackTrace();
     	}
                }
       }
    */
    
    public static ResultSet asdf(String query) throws SQLException
    {
   	Connection conn=null;
        try
        { 
           // Load the Driver class. 
       	 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Create the connection using the static getConnection method 
           conn=DriverManager.getConnection("jdbc:sqlserver://localhost:3306/","root","password12");
           //Create a Statement class to execute the SQL statement 
           Statement stmt=conn.createStatement();
           //Execute the SQL statement and get the results in a Resultset 
           ResultSet rs=stmt.executeQuery(query);
           // Iterate through the ResultSet, displaying two values 
          // for each row using the getString method 
           
           
           
           /*
           while(rs.next())
            {
               System.out.println(rs.getString("Name")+"   "+rs.getString("Ph")+"   "+rs.getString("email"));
            }
*/       }
           catch(SQLException se)
            { 
               System.out.println("Sql Exception"+se);
            }
                 catch(ClassNotFoundException cnfe)
                 { 
                    System.out.println("Class not found Exception"+cnfe);
                  }

                finally 
               { 
               	 try {
    	          if(conn != null)
    	          conn.close();
    	          } 
    	 catch(SQLException e) {
    	  e.printStackTrace();
    	}
           
               }
		return null;
	      }
  }