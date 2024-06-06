/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectjasasoundsystem;

public class Kategori {
    private int kategoriId;
    private String namaKategori;

    // Constructor
    public Kategori(int kategoriId, String namaKategori) {
        this.kategoriId = kategoriId;
        this.namaKategori = namaKategori;
    }

    // Getters and Setters
    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }
}

