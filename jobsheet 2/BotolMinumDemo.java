public class BotolMinumDemo {

    public static void main(String[] args) {
        //objek 1
        BotolMinum b1 = new BotolMinum();
        b1.merk = "Tupperware";
        b1.kapasitas = 600;
        b1.sisaAir = 100;

        //objek 2
        BotolMinum b2 = new BotolMinum();
        b2.merk = "Eiger";
        b2.kapasitas = 750;
        b2.sisaAir = 500;

        //menampilkan data awal
        System.out.println("== Data Awal ==");
        b1.displayInfo();
        b2.displayInfo();

        //update nilai atribut & eksekusi method
        b1.isiAir(300);   // isi air ke botol 1
        b2.minum(150);    // minum dari botol 2

        System.out.println("\n== Setelah Update ==");
        b1.displayInfo();
        b2.displayInfo();
    }
}
