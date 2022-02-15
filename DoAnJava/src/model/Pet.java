package model;

import util.util;

public class Pet {
    private int id;
    private String species; // loai
    private String fur; // mau long
    private Gender gender;
    private int age;
    private double weight;
    private long price;
    private DC dc;
    
    public Pet(String species, String fur, Gender gender, int age, double weight, long price, DC dc) {
        this.id = util.randomIdPet();
        this.species = species;
        this.fur = fur;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.price = price;
        this.dc = dc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public DC getDc() {
        return dc;
    }

    public void setDc(DC dc) {
        this.dc = dc;
    }

    @Override
    public String toString() {
        return "Ma: " + id + " - " + species + " - " + fur + " - " + gender + " - " + age + " thang tuoi" + " - "
                + weight + " Kg - " + price + " VND";
    }

    

}
