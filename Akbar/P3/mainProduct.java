public class mainProduct {

    public static void main(String[] args) {
        product product = new product(productCategory.ELECTRONICS_ID);
        System.out.println("Category Name: " + product.getCategoryName());
        System.out.println("Is Electronics? " + product.isElectronics());
    }
}
