package model;

import java.util.List;

public class Cart {
    int idPet;
    List<Pet> pets;
    List<Accessory> accessories;
    
    public Cart(int idPet, List<Pet> pets, List<Accessory> accessories) {
        this.idPet = idPet;
        this.pets = pets;
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return pets.toString() + "\n" + accessories.toString();
    }

}
