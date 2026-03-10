public class example {

    static int count = 0;

    final String name;

    public example(String name) {
        count++;
        this.name = name;
    }

    public static void main(String[] args) {
        example obj1 = new example("John");
        example obj2 = new example("Jane");
        System.out.println("Total objek: " + example.count);

        System.out.println("Nama objek 1: " + obj1.name);
        System.out.println("Nama objek 2: " + obj2.name);
    }
}
