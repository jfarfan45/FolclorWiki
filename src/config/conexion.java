
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
    public conexion (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/folclorwiki","root","");
        }  catch (Exception e){
        }
    }    
    public Connection getConnection(){  
        return con;
    }
}
