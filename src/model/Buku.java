package model;

public class Buku {
    
    private Integer Kd_Buku;
    private Anggota Anggota;
    private String Nama_Buku;
    private String Penerbit;

    public Integer getKd_Buku() {
        return Kd_Buku;
    }

    public void setKd_Buku(Integer Kd_Buku) {
        this.Kd_Buku = Kd_Buku;
    }

    public Anggota getAnggota() {
        return Anggota;
    }

    public void setAnggota(Anggota Anggota) {
        this.Anggota = Anggota;
    }

    public String getNama_Buku() {
        return Nama_Buku;
    }

    public void setNama_Buku(String Nama_Buku) {
        this.Nama_Buku= Nama_Buku;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }

}
