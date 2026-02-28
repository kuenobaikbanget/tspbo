public class mamaliaDarat {
    public static void main(String[] args){
        String suaraHewan = "";

        System.out.println("\nDemo Kelas. Method dan Data");
        System.out.println("-------------------------------\n");

        kucing pussy = new kucing();
        suaraHewan = pussy.mengeong();
        System.out.println("Pussy: " + suaraHewan);

        anjing doggy = new anjing();
        suaraHewan = doggy.menggonggong();
        System.out.println("Doggy: " + suaraHewan);

        macan siKumbang = new macan();
        suaraHewan = siKumbang.mengaum();
        System.out.println("Si Kumbang: " + suaraHewan);
    }
}
