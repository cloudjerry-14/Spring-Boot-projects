package wines.winestock;

import java.util.UUID;

public class winestockEntity {

    private String brandName;
    private int ratePerLitre;
    private int stockAvailable;
    private String id;

    public winestockEntity() {
        this.id = UUID.randomUUID().toString();     
    }


    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getRatePerLitre() {
        return this.ratePerLitre;
    }

    public void setRatePerLitre(int ratePerLitre) {
        this.ratePerLitre = ratePerLitre;
    }

    public int getStockAvailable() {
        return this.stockAvailable;
    }

    public void setStockAvailable(int stockAvailable) {
        this.stockAvailable = stockAvailable;
    }


    public Object getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}