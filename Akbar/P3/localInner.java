class luarLocal {

    void tampilkan() {
        class InnerLocal {

            void show() {
                System.out.println("Hello dari local inner class");
            }
        }
        InnerLocal local = new InnerLocal();
        local.show();
    }
}

public class localInner {

    public static void main(String[] args) {
        luarLocal obj = new luarLocal();
        obj.tampilkan();
    }
}
