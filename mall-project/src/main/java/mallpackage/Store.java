package mallpackage;

import interfaces.IStoreLogo;
import interfaces.IStoreLogo;

public class Store implements IStoreLogo {
//Fields
    private String storeId;
    private String name;
    private int storeSize;
    private String taxId;

    //Constructors


    public Store(String storeId, String name, int storeSize, String taxId) {
        this.storeId = storeId;
        this.name = name;
        this.storeSize = storeSize;
        this.taxId = taxId;
    }

    //Getters and Setters


    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(int storeSize) {
        this.storeSize = storeSize;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    //Methods

    public boolean openEveryday(){
        return true;
    }

    public String allStoresHead(){
        return "Adam H";
    }

    public Integer totalEmpNumber(){
        return 723;
    }

    //ToString

    @Override
    public String toString() {
        return "Store{" +
                "storeId='" + storeId + '\'' +
                ", name='" + name + '\'' +
                ", storeSize=" + storeSize +
                ", taxId='" + taxId + '\'' +
                '}';
    }

    @Override
    public String dogLogo() {
        System.out.println("Logo: !!DogLogo!!");
        return null;
    }

    @Override
    public String color() {
        System.out.println("Color: Brown");
        return null;
    }
}