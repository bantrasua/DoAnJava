package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.DC;
import model.Gender;
import model.Pet;

public class PetService {
    public List<Pet> allPet() {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Bull Phap", "Den", Gender.Female, 3, 5, 17000000, DC.Dog));
        pets.add(new Pet("Bull Phap", "Vang", Gender.Male, 4, 6, 18000000, DC.Dog));
        pets.add(new Pet("Bull Phap", "Bo Sua", Gender.Female, 3, 4.5, 19500000, DC.Dog));
        pets.add(new Pet("Bull Phap", "Trang", Gender.Male, 2, 3.5, 16000000, DC.Dog));
        pets.add(new Pet("Phu Quoc", "Ven", Gender.Male, 2, 4, 22000000, DC.Dog));
        pets.add(new Pet("Phu Quoc", "Dom", Gender.Female, 3, 4.5, 20500000, DC.Dog));
        pets.add(new Pet("Phu Quoc", "Vang", Gender.Female, 2, 3.5, 20000000, DC.Dog));
        pets.add(new Pet("Corgi", "Trang Vang", Gender.Female, 2, 4, 16000000, DC.Dog));
        pets.add(new Pet("Corgi", "Den Trang", Gender.Male, 4, 5.5, 15000000, DC.Dog));
        pets.add(new Pet("Corgi", "Trang Vang", Gender.Female, 2, 4.5, 14000000, DC.Dog));
        pets.add(new Pet("Pitbull", "Nau", Gender.Male, 2, 4, 19000000, DC.Dog));
        pets.add(new Pet("Pitbull", "Den", Gender.Female, 2, 4, 19000000, DC.Dog));

        pets.add(new Pet("Maine Coon", "Den", Gender.Male, 3, 1.6, 17000000, DC.Cat));
        pets.add(new Pet("Maine Coon", "Xam", Gender.Female, 3, 2, 18500000, DC.Cat));
        pets.add(new Pet("Maine Coon", "Vang", Gender.Male, 3, 1.8, 18000000, DC.Cat));
        pets.add(new Pet("Sphynx", "Hong Phot", Gender.Female, 3, 1.3, 18000000, DC.Cat));
        pets.add(new Pet("Sphynx", "Den", Gender.Female, 3, 1.2, 19000000, DC.Cat));
        pets.add(new Pet("Sphynx", "Bicolor", Gender.Female, 3, 1.2, 19000000, DC.Cat));
        pets.add(new Pet("Bengal", "Cam Thach", Gender.Male, 3, 1.1, 18000000, DC.Cat));
        pets.add(new Pet("Bengal", "Cam Thach", Gender.Male, 3, 1.4, 18000000, DC.Cat));
        pets.add(new Pet("Bengal", "Den", Gender.Female, 3, 1.2, 18000000, DC.Cat));
        pets.add(new Pet("British Shorthair", "Golden", Gender.Female, 3, 1.3, 13000000, DC.Cat));
        pets.add(new Pet("British Shorthair", "Bicolor", Gender.Male, 3, 1.5, 14000000, DC.Cat));
        pets.add(new Pet("British Shorthair", "Xanh Xam", Gender.Female, 3, 1.8, 13000000, DC.Cat));
        return pets;
    }

    public List<Pet> getDog(List<Pet> pets) {

        return pets.stream().filter(pet -> pet.getDc().equals(DC.Dog)).collect(Collectors.toList());
    }
    public List<Pet> getCat(List<Pet> pets) {

        return pets.stream().filter(pet -> pet.getDc().equals(DC.Cat)).collect(Collectors.toList());
    }


    
    
}
