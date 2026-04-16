public class Gajah extends Hewan {

    public static void testClassMethod() {
        System.out.println("The Class Method is Gajah...");
    }

    public static void testInstanceMethod() {
        System.out.println("The Instance Method is Gajah...");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = new Hewan();
        Kucing myKucing = new Kucing();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
        Gajah.testClassMethod();
        myGajah.testInstanceMethod();
        Kucing.testClassMethod();
        myKucing.testInstanceMethod();
    }
}
