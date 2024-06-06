/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectjasasoundsystem;

public class JenisJasa {
    private int jenisJasaId;
    private String namaJasa;
    private String hargaJasa;

    // Constructor
    public JenisJasa(int jenisJasaId, String namaJasa, String hargaJasa) {
        this.jenisJasaId = jenisJasaId;
        this.namaJasa = namaJasa;
        this.hargaJasa = hargaJasa;
    }

    // Getters and Setters
    public int getJenisJasaId() {
        return jenisJasaId;
    }

    public void setJenisJasaId(int jenisJasaId) {
        this.jenisJasaId = jenisJasaId;
    }

    public String getNamaJasa() {
        return namaJasa;
    }

    public void setNamaJasa(String namaJasa) {
        this.namaJasa = namaJasa;
    }

    public String getHargaJasa() {
        return hargaJasa;
    }

    public void setHargaJasa(String hargaJasa) {
        this.hargaJasa = hargaJasa;
    }
}
