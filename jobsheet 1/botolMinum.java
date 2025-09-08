public class botolMinum {

    //fungsi isi air
    public static double isiAir(double sisaAir, double volume, double kapasitas) {
        double total = sisaAir + volume;
        if (total > kapasitas) {
            return kapasitas;
        }
        return total;
    }

    //fungsi minum
    public static double minum(double sisaAir, double volume, double kapasitas) {
        double total = sisaAir - volume;
        if (total < 0) {
            return 0;
        }
        return total;
    }

    public static void main(String[] args) {
        //objek 1
        String merk1 = "1. Tupperware";
        double kapasitas1 = 600;
        double sisaAir1 = 0;
        //objek 2
        String merk2 = "2. LocknLock";
        double kapasitas2 = 500;
        double sisaAir2 = 250;
        //objek 3
        String merk3 = "3. Nike";
        double kapasitas3 = 700;
        double sisaAir3 = 350;
        //objek 4
        String merk4 = "4. Adidas";
        double kapasitas4 = 550;
        double sisaAir4 = 0;
        //objek 5
        String merk5 = "5. Miniso";
        double kapasitas5 = 400;
        double sisaAir5 = 200;
        //objek 6
        String merk6 = "6. CamelBak";
        double kapasitas6 = 750;
        double sisaAir6 = 300;
        //objek 7
        String merk7 = "7. Eiger";
        double kapasitas7 = 650;
        double sisaAir7 = 100;
        //objek 8
        String merk8 = "8. Consina";
        double kapasitas8 = 500;
        double sisaAir8 = 0;
        //objek 9
        String merk9 = "9. Nike";
        double kapasitas9 = 700;
        double sisaAir9 = 500;
        //objek 10
        String merk10 = "10. Tupperware";
        double kapasitas10 = 600;
        double sisaAir10 = 150;

        //memanggil fungsi isiAir dan minum
        sisaAir1 = isiAir(sisaAir1, 300, kapasitas1);
        sisaAir2 = isiAir(sisaAir2, 200, kapasitas2);
        sisaAir3 = minum(sisaAir3, 100, kapasitas3);
        sisaAir4 = isiAir(sisaAir4, 400, kapasitas4);
        sisaAir5 = minum(sisaAir5, 50, kapasitas5);
        sisaAir6 = isiAir(sisaAir6, 300, kapasitas6);
        sisaAir7 = isiAir(sisaAir7, 100, kapasitas7);
        sisaAir8 = isiAir(sisaAir8, 200, kapasitas8);
        sisaAir9 = minum(sisaAir9, 250, kapasitas9);
        sisaAir10 = isiAir(sisaAir10, 300, kapasitas10);

        //cetak hasil
        System.out.println(merk1 + " -> sisa air: " + sisaAir1 + " ml");
        System.out.println(merk2 + " -> sisa air: " + sisaAir2 + " ml");
        System.out.println(merk3 + " -> sisa air: " + sisaAir3 + " ml");
        System.out.println(merk4 + " -> sisa air: " + sisaAir4 + " ml");
        System.out.println(merk5 + " -> sisa air: " + sisaAir5 + " ml");
        System.out.println(merk6 + " -> sisa air: " + sisaAir6 + " ml");
        System.out.println(merk7 + " -> sisa air: " + sisaAir7 + " ml");
        System.out.println(merk8 + " -> sisa air: " + sisaAir8 + " ml");
        System.out.println(merk9 + " -> sisa air: " + sisaAir9 + " ml");
        System.out.println(merk10 + " -> sisa air: " + sisaAir10 + " ml");
    }
}