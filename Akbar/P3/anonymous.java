class Hewan {

    void suara() {
        System.out.println("Hewan Mengeluarkan Suara....");
    }
}

public class anonymous {

    public static void main(String[] args) {
        Hewan kucing = new Hewan() {
            @Override
            void suara() {
                System.out.println(
                    "Meong! (override dari anonymous inner class)"
                );
            }
        };
        kucing.suara();
    }
}
