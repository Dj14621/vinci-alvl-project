package mallpackage;

import customerpackage.Customer;
import mallpackage.Store;

public class BookStore extends Store {
    //Fields
    private String bestBuyer;
    private Integer noOfLocations;

    private Customer customer;
    //Constructors

    public BookStore(String storeId, String name, int storeSize, String taxId, String bestBuyer, Integer noOfLocations) {
        super(storeId, name, storeSize, taxId);
        this.bestBuyer = bestBuyer;
        this.noOfLocations = noOfLocations;
    }

    //Getters and Setters


    public String getBestBuyer() {
        return bestBuyer;
    }

    public void setBestBuyer(String bestBuyer) {
        this.bestBuyer = bestBuyer;
    }

    public Integer getNoOfLocations() {
        return noOfLocations;
    }

    public void setNoOfLocations(Integer noOfLocations) {
        this.noOfLocations = noOfLocations;
    }

    //Methods
    public Integer noOfBooksSoldMonthly(){
        return 404557;
    }

    public String empCategoryInShop(){
        return "Manager\n + Cashier\n + Stoking Agent\n";
    }

    //ToString

    @Override
    public String toString() {
        return "BookStore{" +
                "bestBuyer='" + bestBuyer + '\'' +
                ", noOfLocations=" + noOfLocations +
                '}';
    }
}
