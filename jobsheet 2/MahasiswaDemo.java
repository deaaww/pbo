public class MahasiswaDemo {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        System.out.println("-----------------------------");

        //percobaan 1 nomor 12
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Dea Marsel";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2B";
        m2.displayBiodata();

        System.out.println("-----------------------------");

        //percobaan 1 nomor 12
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Rizky Pratama";
        m3.alamat = "Jakarta";
        m3.kelas = "2C";
        m3.displayBiodata();
    }
}