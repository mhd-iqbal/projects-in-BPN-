package koneksi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class cekdata extends koneksi {
    PreparedStatement pst;
    ResultSet rs;
            
    public Boolean cekno_ktp(String no_ktp)
	    {   //loginOk = new FormUtama();
	        try{
	             
	            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
	            //ALSO SET THE CLASSPATH
	            pst=con.prepareStatement("select * from tabelbpn where no_ktp= '"+no_ktp+"'");
                    rs=pst.executeQuery();
	            if(rs.next())
	            {
	                return true;
	            }
	            else
	            {
                        return false;
	            }
	             
	           }
	        catch (Exception e)
	        {
	            System.out.println(e);
                    return false;
	        }
            }
}