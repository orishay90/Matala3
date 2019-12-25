package com.example.matala3;

public class Prodact {
    private String name;
    private String address;
private long phone;
private int cood;
private String description;
private  int price;

    public Prodact(String name, String address, long phone, int cood, String description, int price) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.cood = cood;
        this.description = description;
        this.price = price;
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getCood() {
        return cood;
    }

    public void setCood(int cood) {
        this.cood = cood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
