/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author LAPTOP MSI
 */
public class koneksi {
    private String databaseName="2210010234";
    private String username="root";
    private String password="";
    private String lokasi="jdbc:mysql://localhost/"+databaseName;
    public static Connection koneksiDB;
    
    
    public koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksiDB=DriverManager.getConnection(lokasi,username,password);
            System.out.println("Database Terkoneksi");
        }
        catch (Exception e) { 
            System.err.println(e.toString());
        }
    }
    
   public void simpanJenis_jasa(String paramjenis_jasa_id, String paramnama_jasa,
            String paramharga_jasa) {
        
       try {
         String SQL ="INSERT INTO jenis_jasa (jenis_jasa_id, nama_jasa, harga_jasa)"
                 + "VALUE(?,?,?)";
         
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramjenis_jasa_id);
         perintah.setString(2, paramnama_jasa);
         perintah.setString(3, paramharga_jasa);
         perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
   
   public void ubahJenis_jasa(String paramjenis_jasa_id, String paramnama_jasa,
            String paramharga_jasa) {
        
       try {
         String SQL ="UPDATE jenis_jasa SET nama_jasa=?, harga_jasa=? WHERE jenis_jasa_id=?";
         
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramjenis_jasa_id);
         perintah.setString(2, paramnama_jasa);
         perintah.setString(3, paramharga_jasa);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
   
    public void hapusJenis_jasa(String paramjenis_jasa_id) {
        
       try {
         String SQL ="DELETE FROM jenis_jasa WHERE jenis_jasa_id=?";
         
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramjenis_jasa_id);
           String paramnama_jasa = null;
         perintah.setString(2, paramnama_jasa);
           String paramharga_jasa = null;
         perintah.setString(3, paramharga_jasa);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
    
    public void simpanKategori(String paramkategori_id , String paramnama_kategori){
        try {
            String SQL = "INSERT INTO kategori (kategori_id , nama_kategori)"
                    + "VALUE(?,?)";
         PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramkategori_id);
         perintah.setString(2, paramnama_kategori);
         perintah.executeUpdate();
        }
        catch (Exception e ) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahKategori(String paramkategori_id , String paramnama_kategori) {
        try {
            String SQL = "UPDATE kategori SET nama_kategori=?, WHERE kategori_id=?";
            
            PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramkategori_id);
         perintah.setString(2, paramnama_kategori);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        }
        catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    
    public void hapusKategori(String paramkategori_id) {
        try {
            String SQL = "DELETE FROM nama_kategori WHERE kategori_id=?";
            
             PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramkategori_id);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        }
        
       catch (Exception e) {
           System.out.println(e.getMessage());
    }
    }
    
    public void simpanProduk (String paramproduk_id , String paramkategori_id , String paramnama_produk , String paramharga , String paramstok) {
        try {
            String SQL = "INSERT INTO produk (produk_id, kategori_id, nama_produk, harga, stok)"
                    + "VALUE(?,?,?,?,?)";
            
             PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramproduk_id);
         perintah.setString(2, paramkategori_id);
         perintah.setString(3, paramnama_produk);
         perintah.setString(4, paramharga);
         perintah.setString(5, paramstok);
         perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        }
         catch (Exception e) {
           System.out.println(e.getMessage());
    }
    }
    
    public void ubahProduk (String paramproduk_id , String paramkategori_id , String paramnama_produk , String paramharga , String paramstok) {
      try{
          String SQL = "UPDATE produk SET nama_produk=? , kategori_id=? , harga=? , stok=?  WHERE produk_id=?" ;
          
          PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramproduk_id);
         perintah.setString(2, paramkategori_id);
          perintah.setString(3, paramnama_produk);
         perintah.setString(4, paramharga);
          perintah.setString(5, paramstok);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
       
       }
         catch (Exception e) {
           System.out.println(e.getMessage());
         }
    }
    
    public void hapusProduk (String paramproduk_id , String paramkategori_id , String paramnama_produk , String paramharga , String paramstok) {
      try {
          String SQL = "DELETE FROM nama_produk WHERE kategori_id";
            
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramproduk_id);
         perintah.setString(2, paramkategori_id);
          perintah.setString(3, paramnama_produk);
         perintah.setString(4, paramharga);
          perintah.setString(5, paramstok);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
      }
        catch (Exception e) {
           System.out.println(e.getMessage());
         }
    }
    
    public void simpanTransaksi (String paramtransaksi_id , String paramuser_id , String paramproduk_id , String paramharga) {
        try {
            String SQL = "INSERT INTO transaksi (transaksi_id , user_id , produk_id , harga)"
            + "VALUE(?,?,?,?)";
            
              PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramtransaksi_id);
         perintah.setString(2, paramuser_id);
          perintah.setString(3, paramproduk_id);
         perintah.setString(4, paramharga);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        }
         catch (Exception e) {
           System.out.println(e.getMessage());
         }
    }
    
    public void ubahTransaksi (String paramtransaksi_id , String paramuser_id , String paramproduk_id , String paramharga) {
        try {
            String SQL = "UPDATE transaksi SET user_id=? , produk_id=? , harga=? WHERE transaksi_id=?";
            
             PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramtransaksi_id);
         perintah.setString(2, paramuser_id);
          perintah.setString(3, paramproduk_id);
         perintah.setString(4, paramharga);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        }
         catch (Exception e) {
           System.out.println(e.getMessage());
         }
    }
            
        
    public void hapusTransaksi (String paramtransaksi_id , String paramuser_id , String paramproduk_id , String paramharga) {
        try {
            String SQL = "DELETE FROM produk_id WHERE transaksi_id";
            
             PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
         perintah.setString(1, paramtransaksi_id);
         perintah.setString(2, paramuser_id);
          perintah.setString(3, paramproduk_id);
         perintah.setString(4, paramharga);
         perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        }
         catch (Exception e) {
           System.out.println(e.getMessage());
         }
        
    }
    
    public void cariJenis_jasa (String paramjenis_jasa_id ) {
        try {
           String SQL="SELECT*FROM jenis_jasa WHERE jenis_jasa_id=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramjenis_jasa_id);
           ResultSet data = perintah.executeQuery();
           while(data.next()) {
               System.out.println("JENIS JASA ID :"+data.getString("jenis_jasa_id"));
               System.out.println("NAMA JASA :"+data.getString("nama_jasa"));
               System.out.println("HARGA JASA :"+data.getString("harga_jasa"));
           }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
     public void dataJenis_jasa() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM jenis_jasa ORDER BY jenis_jasa_id ASC");
            while(baris.next()) {
                System.out.println(baris.getString("jenis_jasa_id")+" | "+
                        baris.getString("nama_jasa")+" | "+
                        baris.getString("harga_jasa"));
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
     
    public void cariKategori( String paramkategori_id) {
        try {
           String SQL="SELECT*FROM kategori WHERE kategori_id=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramkategori_id);
           ResultSet data = perintah.executeQuery();
           while(data.next()) {
               System.out.println("KATEGORI ID :"+data.getString("kategori_id"));
               System.out.println("NAMA KATEGORI :"+data.getString("nama_kategori"));
           }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
     public void dataKategori() {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM kategori ORDER BY kategori_id ASC");
            while(baris.next()) {
                System.out.println(baris.getString("kategori_id")+" | "+
                        baris.getString("nama_kategori"));
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
     
     public void cariProduk (String paramproduk_id) {
        try {
           String SQL="SELECT*FROM produk WHERE produk_id=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramproduk_id);
           ResultSet data = perintah.executeQuery();
           while(data.next()) {
               System.out.println(" PRODUK ID :"+data.getString("produk_id"));
               System.out.println("KATEGORI ID :"+data.getString("kategori_id"));
               System.out.println("NAMA PRODUK :"+data.getString("nama_produk"));
               System.out.println("HARGA :"+data.getString("harga"));
               System.out.println("STOK :"+data.getString("stok"));
           }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
     public void dataProduk ()
              {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM produk ORDER BY produk_id ASC");
            while(baris.next()) {
                System.out.println(baris.getString("produk_id")+" | "+
                       baris.getString("kategori_id")+" | "+
                        baris.getString("nama_produk")+" | "+
                        baris.getString("harga")+" | "+
                        baris.getString("stok"));
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
     
     public void cariTransaksi (String paramtransaksi_id) {
        try {
           String SQL="SELECT*FROM transaksi WHERE transaksi_id=?";
           PreparedStatement perintah = koneksiDB.prepareStatement(SQL);
           perintah.setString(1,paramtransaksi_id);
           ResultSet data = perintah.executeQuery();
           while(data.next()) {
               System.out.println(" PRODUK ID :"+data.getString("transaksi_id"));
               System.out.println("USER ID :"+data.getString("user_id"));
               System.out.println("PRODUK ID :"+data.getString("produk_id"));
               System.out.println("HARGA :"+data.getString("harga"));
           }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
     
     public void dataTransaksi ()
               {
        try {
            Statement stmt = koneksiDB.createStatement();
            ResultSet baris = stmt.executeQuery("SELECT*FROM transaksi ORDER BY transaksi_id ASC");
            while(baris.next()) {
                System.out.println(baris.getString("transaksi_id")+" | "+
                       baris.getString("user_id")+" | "+
                        baris.getString("produk_id")+" | "+
                        baris.getString("harga"));
                        
            }
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void hapusProduk(String txtProduk_id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void hapusTransaksi(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
