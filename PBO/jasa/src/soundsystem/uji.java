/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soundsystem;

/**
 *
 * @author LAPTOP MSI
 */
public class uji {
    private String nik;
    private String nama;
    private String telp;
    private String alamat;   

        public uji(String nik , String nama , String telp , String alamat) {
            this.nik = nik;
            this.nama = nama;
            this.telp = telp;
            this.alamat = alamat;
        }
        public String getNIk(){
            return nik;
        }
        public String getNama(){
            return nama;
        }
        public String getTelp(){
            return telp;
        }
        public String getAlamat(){
            return alamat;
        }

}
