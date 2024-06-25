/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soundsystem;

/**
 *
 * @author LAPTOP MSI
 */
public class kategori {
    private String kategori_id;
    private String nama_kategori;
   
    public kategori(String kategori_id, String nama_kategori ) {
        this.kategori_id = kategori_id;
        this.nama_kategori = nama_kategori;       
    }
    public String getKategori_id() {
        return kategori_id;
    }
    public String getNama_kategori () {
        return nama_kategori;
    }
}
