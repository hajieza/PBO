/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soundsystem;

/**
 *
 * @author LAPTOP MSI
 */
public class jenis_jasa {
    private String jenis_jasa_id;
    private String nama_jasa;
    private String harga_jasa;
 
    public jenis_jasa(String jenis_jasa_id, String nama_jasa, String harga_jasa) {
        this.jenis_jasa_id = jenis_jasa_id;
        this.nama_jasa = nama_jasa;
        this.harga_jasa = harga_jasa;       
    }
    public String getJenis_jasa_id (){
        return jenis_jasa_id;
    }
    public String getNama_jasa (){
        return nama_jasa;
    }
    public String getHarga_jasa () {
        return harga_jasa;
    }
}
