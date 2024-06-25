/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soundsystem;

/**
 *
 * @author LAPTOP MSI
 */
public class produk {
   private String produk_id;
   private String kategori_id;
   private String nama_produk;
   private String harga;
   private String stok;
    
    public produk(String produk_id , String kategori_id , String nama_produk , String harga , String stok) {
        this.produk_id = produk_id;
        this.kategori_id = kategori_id;
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.stok = stok;   
    }
    public String getProduk_id(){
        return produk_id;
    }
    public String getKategori_id(){
        return kategori_id;
    }
    public String getNama_produk(){
        return nama_produk;
    }
    public String getHarga(){
        return harga;
    }
    public String getStok(){
        return stok;
    }
}
