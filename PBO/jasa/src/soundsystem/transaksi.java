/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soundsystem;

/**
 *
 * @author LAPTOP MSI
 */
public class transaksi {
    private String transaksi_id;
    private String user_id;
    private String produk_id;
    private String harga;
    
        public transaksi(String transaksi_id , String user_id , String produk_id , String harga) {
            this.transaksi_id = transaksi_id;
            this.user_id = user_id;
            this.produk_id = produk_id;
            this.harga = harga;
        }
        public String getTransaksi_id(){
            return transaksi_id;
        }
        public String getUser_id(){
            return user_id;
        }
        public String getProduk_id() {
            return produk_id;
        }
        public String getHarga() {
            return harga;
        }
}
