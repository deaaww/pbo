public class BotolMinum {
    
    public String merk;
    public double kapasitas;
    public double sisaAir;

    //method untuk menampilkan info botol
    public void displayInfo() {
        System.out.println("Merk       : " + merk);
        System.out.println("Kapasitas  : " + kapasitas + " ml");
        System.out.println("Sisa Air   : " + sisaAir + " ml");
    }

    //method untuk mengisi air
    public void isiAir(double volume) {
        sisaAir += volume;
        if (sisaAir > kapasitas) {
            sisaAir = kapasitas;
        }
    }

    //method untuk minum
    public void minum(double volume) {
        sisaAir -= volume;
        if (sisaAir < 0) {
            sisaAir = 0;
        }
    }
}
