package koneksi;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class simpan extends koneksi{
    PreparedStatement pst;
    cekdata cek;
    public simpan(String no_ktp,String nama,String no_telpon,String umur,String pekerjaan,String alamat,String terletak_di,String desa_kelurahan,String kecamatan,String no_hak)
    {
        cek = new cekdata();
        Boolean ada = cek.cekno_ktp(no_ktp);
        if(ada==true)
        {
            JOptionPane.showMessageDialog(null,"Gagal ! No KTP telah terdaftar");
        }
        else if("".equals(no_ktp))
        {
        JOptionPane.showMessageDialog(null,"Gagal ! Data belum diisi");
        }
        else
        {
            
        try{      
                pst=con.prepareStatement("insert into tabelbpn (no_ktp,nama,no_telpon,umur,pekerjaan,alamat,terletak_di,desa_kelurahan,kecamatan,no_hak) values(?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, no_ktp);
                pst.setString(2, nama);
                pst.setString(3, no_telpon);
                pst.setString(4, umur);
                pst.setString(5, pekerjaan);
                pst.setString(6, alamat);
                pst.setString(7, terletak_di);
                pst.setString(8, desa_kelurahan);
                pst.setString(9, kecamatan);
                pst.setString(10, no_hak);    
                pst.execute();
                JOptionPane.showMessageDialog(null,"Data berhasil ditambahkan !");    

                }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Data gagal ditambahkan !");
            }
        }
    
    }

}