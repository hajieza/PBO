/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectjasasoundsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/2210010234";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // Connection
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to the database!");

            // CRUD operations for JenisJasa
            createJenisJasa(conn, 1, "Sound System Basic", "500000");
            readJenisJasa(conn);
            updateJenisJasa(conn, 1, "600000");
            deleteJenisJasa(conn, 1);

            // CRUD operations for Kategori
            createKategori(conn, 1, "Wedding");
            readKategori(conn);
            updateKategori(conn, 1, "Corporate Events");
            deleteKategori(conn, 1);

            // CRUD operations for Uji
            createUji(conn, "1234567890", "John Doe", "08123456789", "Jl. Merdeka No. 1");
            readUji(conn);
            updateUji(conn, "1234567890", "Jane Doe");
            deleteUji(conn, "1234567890");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Methods for JenisJasa
    public static void createJenisJasa(Connection conn, int id, String nama, String harga) throws Exception {
        String query = "INSERT INTO jenis_jasa (jenis_jasa_id, nama_jasa, harga_jasa) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nama);
            pstmt.setString(3, harga);
            pstmt.executeUpdate();
            System.out.println("Inserted into jenis_jasa");
        }
    }

    public static void readJenisJasa(Connection conn) throws Exception {
        String query = "SELECT * FROM jenis_jasa";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println(rs.getInt("jenis_jasa_id") + ", " +
                                   rs.getString("nama_jasa") + ", " +
                                   rs.getString("harga_jasa"));
            }
        }
    }

    public static void updateJenisJasa(Connection conn, int id, String harga) throws Exception {
        String query = "UPDATE jenis_jasa SET harga_jasa = ? WHERE jenis_jasa_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, harga);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Updated jenis_jasa");
        }
    }

    public static void deleteJenisJasa(Connection conn, int id) throws Exception {
        String query = "DELETE FROM jenis_jasa WHERE jenis_jasa_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Deleted from jenis_jasa");
        }
    }

    // Methods for Kategori
    public static void createKategori(Connection conn, int id, String nama) throws Exception {
        String query = "INSERT INTO kategori (kategori_id, nama_kategori) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nama);
            pstmt.executeUpdate();
            System.out.println("Inserted into kategori");
        }
    }

    public static void readKategori(Connection conn) throws Exception {
        String query = "SELECT * FROM kategori";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println(rs.getInt("kategori_id") + ", " +
                                   rs.getString("nama_kategori"));
            }
        }
    }

    public static void updateKategori(Connection conn, int id, String nama) throws Exception {
        String query = "UPDATE kategori SET nama_kategori = ? WHERE kategori_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nama);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Updated kategori");
        }
    }

    public static void deleteKategori(Connection conn, int id) throws Exception {
        String query = "DELETE FROM kategori WHERE kategori_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Deleted from kategori");
        }
    }

    // Methods for Uji
    public static void createUji(Connection conn, String nik, String nama, String telp, String alamat) throws Exception {
        String query = "INSERT INTO uji (nik, nama, telp, alamat) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nik);
            pstmt.setString(2, nama);
            pstmt.setString(3, telp);
            pstmt.setString(4, alamat);
            pstmt.executeUpdate();
            System.out.println("Inserted into uji");
        }
    }

    public static void readUji(Connection conn) throws Exception {
        String query = "SELECT * FROM uji";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println(rs.getString("nik") + ", " +
                                   rs.getString("nama") + ", " +
                                   rs.getString("telp") + ", " +
                                   rs.getString("alamat"));
            }
        }
    }

    public static void updateUji(Connection conn, String nik, String nama) throws Exception {
        String query = "UPDATE uji SET nama = ? WHERE nik = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nama);
            pstmt.setString(2, nik);
            pstmt.executeUpdate();
            System.out.println("Updated uji");
        }
    }

    public static void deleteUji(Connection conn, String nik) throws Exception {
        String query = "DELETE FROM uji WHERE nik = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nik);
            pstmt.executeUpdate();
            System.out.println("Deleted from uji");
        }
    }
}

