import java.util.Scanner;

public class kalkulator{

    //fungsi penjumlahan
    public static double tambah(double a, double b) {
        return a + b;
    }

    //fungsi pengurangan
    public static double kurang(double a, double b) {
        return a - b;
    }

    //fungsi perkalian
    public static double kali(double a, double b) {
        return a * b;
    }

    //fungsi pembagian
    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: pembagi tidak boleh nol!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("            KALKULATOR SEDERHANA            ");
        System.out.println("============================================");

        System.out.print("  Masukkan angka pertama        : ");
        double angka1 = sc.nextDouble();

        System.out.print("  Masukkan operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("  Masukkan angka kedua          : ");
        double angka2 = sc.nextDouble();

        double hasil = 0;

        System.out.println("============================================");


        //memanggil fungsi sesuai operator
        if (op.equals("+")) {
            hasil = tambah(angka1, angka2);
        } else if (op.equals("-")) {
            hasil = kurang(angka1, angka2);
        } else if (op.equals("*")) {
            hasil = kali(angka1, angka2);
        } else if (op.equals("/")) {
            hasil = bagi(angka1, angka2);
        } else {
            System.out.println("Operator tidak valid!");
            return;
        }

        //cetak hasil
        System.out.println("  Hasil: " + hasil);

        System.out.println("============================================");
    }
}