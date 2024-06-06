/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectjasasoundsystem;

public class Uji {
    private String nik;
    private String nama;
    private String telp;
    private String alamat;

    // Constructor
    public Uji(String nik, String nama, String telp, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.telp = telp;
        this.alamat = alamat;
    }

    // Getters and Setters
    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
