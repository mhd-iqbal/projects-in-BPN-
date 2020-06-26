package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {
    public Connection con;
    public koneksi()
    {
        try
        {   Class.forName("com.mysql.jdbc.Driver");
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bpn","root","");
        }
        catch (Exception e)
	        {
	            System.out.println(e);
	        }
    
    }
}
