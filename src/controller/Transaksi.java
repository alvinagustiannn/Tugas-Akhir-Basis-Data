package controller;

import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Detail_Pemesanan;
import model.Anggota;
import model.Buku;
import model.Petugas;

public class Transaksi {

    Koneksi koneksi;
    ArrayList<Anggota> arrAnggota;
    ArrayList<Buku> arrBuku;
    ArrayList<Petugas> arrPetugas;
    ArrayList<Detail_Pemesanan> arrDetail_Pemesanan;
    
    public Transaksi() {
        this.koneksi = new Koneksi();
        this.arrAnggota = new ArrayList<>();
        this.arrBuku = new ArrayList<>();
        this.arrPetugas = new ArrayList<>();
        this.arrDetail_Pemesanan = new ArrayList<>();

    }
    
    public ArrayList<Anggota> getDataAnggota() throws SQLException {
        this.arrAnggota.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM ANGGOTA");
        while (rs.next()) {
            Anggota k = new Anggota();
            k.setKd_anggota(rs.getInt("KD_ANGGOTA"));
            k.setNama_Anggota(rs.getString("NAMA_ANGGOTA"));
            k.setAlamat(rs.getString("ALAMAT"));

            this.arrAnggota.add(k);
        }
        return this.arrAnggota;
    }
    
    public ArrayList<Buku> getDataBuku() throws SQLException {
        this.arrBuku.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM BUKU JOIN ANGGOTA ON ANGGOTA.KD_ANGGOTA= BUKU.KD_ANGGOTA");
        while (rs.next()) {
            Anggota k = new Anggota();
            k.setKd_anggota(rs.getInt("KD_ANGGOTA"));
            k.setNama_Anggota(rs.getString("NAMA_ANGGOTA"));
            k.setAlamat(rs.getString("ALAMAT"));

            Buku p = new Buku();
            p.setKd_buku(rs.getInt("KD_BUKU"));
            p.setAnggota(k);
            p.setNama_Buku(rs.getString("NAMA_BUKU"));
            p.setPengarang(rs.getInt("PENGARANG"));

            this.arrBuku.add(p);
        }
        return this.arrBuku;
    }
    
    public ArrayList<Petugas> getDataPetugas() throws SQLException {
        this.arrPetugas.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM PETUGAS JOIN ANGGOTA ON ANGGOTA.KD_ANGGOTA= PETUGAS.KD_ANGGOTA ORDER BY PETUGAS.PETUGAS ASC");
        while (rs.next()) {
            Anggota k = new Anggota();
            k.setKd_anggota(rs.getInt("KD_ANGGOTA"));
            k.setNama_Anggota(rs.getString("NAMA_ANGGOTA"));
            k.setAlamat(rs.getString("ALAMAT"));

            Petugas o = new Petugas();
            o.setKd_petugas(rs.getInt("kd_petugas"));
            o.setAnggota(k);
            o.setO6966_petugas(rs.getString("O6966_petugas"));
            o.setTelp_Petugas(rs.getInt("Telp_Petugas"));

            this.arrPetugas.add(o);
        }
        return this.arrPetugas;
    }
   
    
    
    public void insertPetugas(Petugas petugas) throws SQLException{
        try {
            this.koneksi.ManipulasiData("insert into obat values ("+"'"+petugas.getKd_Petugas()+"','"+ Petugas.getAnggota().getKd_Anggota() +"', '"+ petugas.getO6966_petugas() +"', '"+ petugas.getTelp_Petugas() +"')");
        } catch (Exception ex) {
            System.out.println(ex);
        }   
    }
    
    public void deletePetugas(Petugas petugas) throws SQLException{
        try {
            this.koneksi.ManipulasiData("DELETE FROM PETUGAS WHERE KD_PETUGAS = "+petugas.getKd_petugas());
        } catch (Exception ex) {
            System.out.println(ex);
        } 
    }
    
    public void editPetugas(Petugas petugas) throws SQLException{
        this.koneksi.ManipulasiData("UPDATE PETUGAS SET KD_ANGGOTA= "+petugas.getAnggota().getKd_Anggota()+", O6966_petugas = '"+petugas.getO6966_petugas()+"', Telp_petugas= '"+petugas.getHarga_Obat()+"' WHERE Kd_Petugas = "+petugas.getKd_petugas());
    }
    
}
