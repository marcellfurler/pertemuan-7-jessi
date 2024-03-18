package com.rplbo.guided7;

import java.sql.*;

public class DBSQLite {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Class.forName("org.sqlite.Driver");
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:D:\\Kuliah\\Materi Kuliah\\Semester 4\\PRAK RPLBO\\Pertemuan 7\\Guided\\latihan-7-marcellfurler\\mahasiswa.db";
        Connection con = DriverManager.getConnection(url);
        System.out.println("Koneksi Berhasil");

        String sqlUpdate = "Update Mahasiswa set nilai=? where nim=? ";
        PreparedStatement ps = con.prepareStatement(sqlUpdate);
        ps.setInt(1, 41);
        ps.setString(2, "71220003");
        
        //2. Statement
        String sql = "select * from mahasiswa";
        ps = con.prepareStatement(sql);
        //3. Kirim SQL
        
        //loop untuk record select
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println("NIM : " +rs.getString("nim"));
            System.out.println("Nama : " +rs.getString("nama"));
            System.out.println("Nilai : " +rs.getString("nilai"));
            System.out.println(" ");
        }
        System.out.println("Selesai guys");
        
    }
}
