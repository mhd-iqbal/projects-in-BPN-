package koneksi;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class caridatabpn extends koneksi {
    public DefaultTableModel DftTabMode1;
    String kunci,no_ktp;
    PreparedStatement pst;
    ResultSet rs;
    
    public caridatabpn()
    {
        Object[] Baris={"no_ktp","nama"};
        DftTabMode1 = new DefaultTableModel(null, Baris);
        try{
	             
            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            pst=con.prepareStatement("select * from tabelbpn order by no_ktp asc");
            rs=pst.executeQuery();
            while(rs.next()){
               String no_ktp=rs.getString("no_ktp");
               String nama=rs.getString("nama");
              
               String[] dataField={no_ktp,nama};
               DftTabMode1.addRow(dataField);
           }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
    public caridatabpn(String kunci)
    {
        Object[] Baris={"no_ktp","nama"};
        DftTabMode1 = new DefaultTableModel(null, Baris);
        try{
	             
            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            pst=con.prepareStatement("select * from tabelbpn where no_ktp like '%"+kunci+"%' order by no_ktp asc");
            rs=pst.executeQuery();
            while(rs.next()){
               String no_ktp=rs.getString("no_ktp");
               String nama=rs.getString("nama");
              
               String[] dataField={no_ktp,nama};
               DftTabMode1.addRow(dataField);
           }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }   
}