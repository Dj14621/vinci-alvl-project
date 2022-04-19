package mallpackage;
import mallpackage.Store;

public class ShoeStore extends Store {
    //Fields
    private String brandName;
    private Integer noOfBrands;
    private boolean isSportShoeStore;

    //Constructors


    public ShoeStore(String storeId, String name, int storeSize, String taxId, String brandName,
                     Integer noOfBrands, boolean isSportShoeStore) {
        super(storeId, name, storeSize, taxId);
        this.brandName = brandName;
        this.noOfBrands = noOfBrands;
        this.isSportShoeStore = isSportShoeStore;
    }

    //Getters and Setters

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getNoOfBrands() {
        return noOfBrands;
    }

    public void setNoOfBrands(Integer noOfBrands) {
        this.noOfBrands = noOfBrands;
    }

    public boolean isSportShoeStore() {
        return isSportShoeStore;
    }

    public void setSportShoeStore(boolean sportShoeStore) {
        isSportShoeStore = sportShoeStore;
    }

    //Methods
    public String closedDays(){
        return "Ramadan \n + NewYear\n + Manager's Birthday\n + Thanksgiving";
    }

    public boolean highOnDiscounts(){
        return true;
    }

    //ToString


    @Override
    public String toString() {
        return "ShoeStore{" +
                "brandName='" + brandName + '\'' +
                ", noOfBrands=" + noOfBrands +
                ", isSportShoeStore=" + isSportShoeStore +
                '}';
    }
}
