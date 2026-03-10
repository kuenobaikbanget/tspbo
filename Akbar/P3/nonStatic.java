class Outer {

    private String pesan = "Hello dari Outer Class";

    class inner {

        void tampilPesan() {
            System.out.println(pesan);
        }
    }
}

public class nonStatic {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.inner inner = outer.new inner();
        inner.tampilPesan();
    }
}