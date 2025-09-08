public class PersegiPanjang {

    public int panjang;
    public int lebar;

    //method untuk menampilkan info
    public void displayInfo() {
        System.out.println("Panjang   : " + panjang);
        System.out.println("Lebar     : " + lebar);
    }

    //method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    //method untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}