package model;

import java.util.Comparator;

public class Store {
    String name;
    String address;
    String phoneNumber;
    int amountOfBottlesOrdered;

    public Store(String name, String address, String phoneNumber, int amountOfBottlesOrdered) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.amountOfBottlesOrdered = amountOfBottlesOrdered;
    }

    public Store() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAmountOfBottlesOrdered() {
        return amountOfBottlesOrdered;
    }

    public void setAmountOfBottlesOrdered(int amountOfBottlesOrdered) {
        this.amountOfBottlesOrdered = amountOfBottlesOrdered;
    }

    public static class amountOfBottlesOrdered implements Comparator<Store> {
        @Override
        public int compare(Store s1, Store s2) {
            if (s1.getAmountOfBottlesOrdered() > s2.getAmountOfBottlesOrdered()) {
                return 1;

            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", address='" + getAddress() + "'" +
                ", phoneNumber='" + getPhoneNumber() + "'" +
                ", amountOfBottlesOrdered='" + getAmountOfBottlesOrdered() + "'" +
                "}";
    }

}
