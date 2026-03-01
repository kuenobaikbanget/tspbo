public class mamaliaDarat {
    public static void main(String[] args){

        System.out.println("\nDemo Kelas. Method dan Data");
        System.out.println("-------------------------------\n");

        kucing pussy = new kucing();
        System.out.println("Pussy: " + pussy.mengeong());

        anjing doggy = new anjing();
        System.out.println("Doggy: " + doggy.menggonggong());

        macan siKumbang = new macan();
        System.out.println("Si Kumbang: " + siKumbang.mengaum());
    }
}
