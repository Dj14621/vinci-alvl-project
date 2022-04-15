package mallpackage;
import mallpackage.Store;

public class ToyStore extends Store {

    //Fields
    private String playStation;
    private String whatAvailable;
    private Integer avgKidsPerMonth;

    //Constructors

    public ToyStore(String storeId, String name, int storeSize, String taxId,
                    String playStation, String whatAvailable, Integer avgKidsPerMonth) {
        super(storeId, name, storeSize, taxId);
        this.playStation = playStation;
        this.whatAvailable = whatAvailable;
        this.avgKidsPerMonth = avgKidsPerMonth;
    }

    //Getters and Setters

    public String getPlayStation() {
        return playStation;
    }

    public void setPlayStation(String playStation) {
        this.playStation = playStation;
    }

    public String getWhatAvailable() {
        return whatAvailable;
    }

    public void setWhatAvailable(String whatAvailable) {
        this.whatAvailable = whatAvailable;
    }

    public Integer getAvgKidsPerMonth() {
        return avgKidsPerMonth;
    }

    public void setAvgKidsPerMonth(Integer avgKidsPerMonth) {
        this.avgKidsPerMonth = avgKidsPerMonth;
    }

    //Methods
    public String inventory(){
        return "Philosophy\n + Religion\n + Fiction\n + Non-Fiction";
    }

    public Integer totalBooksInStore(){
        return 5000056;
    }

    //ToString

    @Override
    public String toString() {
        return "ToyStore{" +
                "playStation='" + playStation + '\'' +
                ", whatAvailable='" + whatAvailable + '\'' +
                ", avgKidsPerMonth=" + avgKidsPerMonth +
                '}';
    }
}
