package model;

public class Bottles extends Store {
    String brand;
    String size;
    int PriceInSRD;

    public Bottles(String brand, String size, int PriceInSRD) {
        this.brand = brand;
        this.size = size;
        this.PriceInSRD = PriceInSRD;
        }


    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPriceInSRD() {
        return this.PriceInSRD;
    }

    public void setPriceInSRD(int PriceInSRD) {
        this.PriceInSRD = PriceInSRD;
    }
   

    @Override
    public String toString() {
        return "{" +
            " brand='" + getBrand() + "'" +
            ", size='" + getSize() + "'" +
            ", PriceInSRD='" + getPriceInSRD() + "'" +
            "}";
    }

}
