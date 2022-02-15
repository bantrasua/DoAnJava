package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Accessory;
import model.DC;

public class AccessoryService {
    public List<Accessory> allAccessory() {
        List<Accessory> accessories = new ArrayList<>();
        accessories.add(new Accessory("Xuong go", "Trang", 50000, DC.Dog));
        accessories.add(new Accessory("Xuong go", "Nau", 50000, DC.Dog));
        accessories.add(new Accessory("Ao", "Do", 40000, DC.Dog));
        accessories.add(new Accessory("Ao", "Vang", 40000, DC.Dog));
        accessories.add(new Accessory("Day Xich", "Vang", 20000, DC.Dog));
        accessories.add(new Accessory("Xuc Xich", "250gm", 50000, DC.Dog));
        accessories.add(new Accessory("Xuc Xich", "500gm", 100000, DC.Dog));
        accessories.add(new Accessory("Long Sat", "Den", 300000, DC.Dog));
        accessories.add(new Accessory("Long Sat", "Trang", 300000, DC.Dog));
        accessories.add(new Accessory("Qua Bong", "Xanh Duong", 20000, DC.Dog));
        accessories.add(new Accessory("Qua Bong", "Xanh la", 20000, DC.Dog));
        accessories.add(new Accessory("Qua Bong", "Hong", 20000, DC.Dog));

        accessories.add(new Accessory("Ca Bong", "Cam", 40000, DC.Cat));
        accessories.add(new Accessory("Ca Bong", "Xanh", 40000, DC.Cat));
        accessories.add(new Accessory("Ao", "Vang", 40000, DC.Cat));
        accessories.add(new Accessory("Pate", "200gm", 30000, DC.Cat));
        accessories.add(new Accessory("Pate AB", "500gm", 60000, DC.Cat));
        accessories.add(new Accessory("Pate X", "500gm", 100000, DC.Cat));
        accessories.add(new Accessory("Ao", "Do", 40000, DC.Cat));
        accessories.add(new Accessory("Ao", "Cam", 40000, DC.Cat));
        accessories.add(new Accessory("Ao", "Hong", 40000, DC.Cat));
        accessories.add(new Accessory("Quan Len", "Den", 40000, DC.Cat));
        accessories.add(new Accessory("Ban Cao Mong", "0.5m x 1m", 60000, DC.Cat));
        accessories.add(new Accessory("Bong Lat Dat", "Cau Vong", 50000, DC.Cat));
        return accessories;
    }

    public List<Accessory> getAccessoryDog(List<Accessory> accessories) {
        return accessories.stream().filter(accessory -> accessory.getDc().equals(DC.Dog)).collect(Collectors.toList());
    }

    public List<Accessory> getAccessoryDogByName(String name) {
        List<Accessory> accessories = getAccessoryDog(allAccessory());
        return accessories.stream().filter(accessory -> accessory.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    

    public List<Accessory> getAccessoryCat(List<Accessory> accessories) {
        return accessories.stream().filter(accessory -> accessory.getDc().equals(DC.Cat)).collect(Collectors.toList());
    }

    public List<Accessory> getAccessoryCatByName(String name) {
        List<Accessory> accessories = getAccessoryCat(allAccessory());
        return accessories.stream().filter(accessory -> accessory.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

}
