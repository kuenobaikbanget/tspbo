public class product {

    private int categoryId;

    public product(int categoryId) {
        this.categoryId = categoryId;
    }
 
    public boolean isElectronics() {
        return this.categoryId == productCategory.ELECTRONICS_ID;
    }

    public String getCategoryName() {
        switch (categoryId) {
            case productCategory.ELECTRONICS_ID:
                return "Electronics";
            case productCategory.CLOTHING_ID:
                return "Clothing";
            case productCategory.GROCERY_ID:
                return "Grocery";
            default:
                return "Unknown Category";
        }
    }
}
