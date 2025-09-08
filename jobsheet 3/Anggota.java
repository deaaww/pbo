package jobsheet03;

public class Anggota {

    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    //costructor
    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    //getter
    public String getNoKtp() {
        return noKtp;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    //method pinjam uang
    public void pinjam(int uang) {
        if (jumlahPinjaman + uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += uang;
        }
    }

    //method angsur pinjaman
    /*
    public void angsur(int jumlah) {
        if (jumlah > jumlahPinjaman) {
            jumlahPinjaman = 0; //jika angsur lebih besar dari pinjaman, sisanya menjadi 0
        } else {
            jumlahPinjaman -= jumlah;
        }
    }
    */

    //modifikasi method angsur pinjaman tugas nomor 2
    public void angsur(int uang) {
        int minimalAngsuran = (int)(0.1 * jumlahPinjaman); // 10% dari pinjaman
        if (uang < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjaman -= uang;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}