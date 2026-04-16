public class MainMobil {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 4);
        Motor motor = new Motor("Honda", true);

        mobil.jalan();
        mobil.infoMobil();

        motor.jalan();
        motor.infoMotor();
    }
}
