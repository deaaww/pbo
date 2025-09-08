package jobsheet03;

public class MotorDemo {
    
    public static void main(String[] args) {
        
        Motor motor1 = new Motor();
        motor1.displayStatus();

        /*TANPA ENKAPSULASI
        motor1.platNomor = "B 0838 XZ";

        int kecepatanBaru = 50;

        if (!motor1.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru;
        }
        */
        
        //ENKAPSULASI
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayStatus();

        Motor motor2 = new Motor();
        /*TANPA ENKAPSULASI
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        kecepatanBaru = 40;

        if (!motor2.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecepatanBaru;
        }
        */

        //ENKAPSULASI
        motor2.setPlatNomor("N 9840 AB");
        motor2.setIsMesinOn(true);
        motor2.setKecepatan(40);
        motor2.displayStatus();

        Motor motor3 = new Motor();
        /*TANPA ENKAPSULASI
        motor3.platNomor = "D 8343 CV";
        kecepatanBaru = 60;

        if (!motor3.isMesinOn && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor3.kecepatan = kecepatanBaru;
        }
        */

        //ENKAPSULASI
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayStatus();
    }
}