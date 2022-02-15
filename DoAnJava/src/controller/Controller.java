package controller;

import java.util.List;
import java.util.Scanner;

import model.Accessory;
import model.DC;
import model.Pet;
import model.User;
import service.AccessoryService;
import service.PetService;
import service.UserService;
import util.util;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    boolean continueProgram = true;
    UserService userService = new UserService();
    List<User> AllAccout = userService.allAccout();
    PetService petService = new PetService();
    AccessoryService accessoryService = new AccessoryService();
    DC dc;
    List<Pet> allPet = petService.allPet();
    List<Accessory> allAccesstory = accessoryService.allAccessory();


    public void program() {
        menu();
    }
    

    public void menu() {

        while (continueProgram) {
            try {
                System.out.println("-------XIN CHAO, BAN LA AI??-------");
                System.out.println("1. Dang nhap");
                System.out.println("2. Dang ky");
                System.out.println("0. Thoat");
                System.out.println("Ban chon ?");

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        login();
                        break;
                    case 2:
                        register();
                        break;
                    case 0:
                        continueProgram = false;
                        break;
                    default:
                        System.out.println("Khong co lua chon nay!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long lua chon chu so");
            }
        }
    }
    
    public void login() {
        boolean continueSub = true;
        while (continueSub) {
            User user = userService.login(AllAccout);
            if (user != null) {
                page(user);
            } else {
                System.out.println("Dang nhap that bai");
            }
            continueSub = false;
        }
    }

    public void register() {
        userService.register(AllAccout);
    }

    public void page(User user) {
        boolean continueSub = true;
        while (continueSub) {
            try {
                System.out.println();
                System.out.println("-----------Xin chao " + user.getName()+"----------");
                System.out.println("-----------Trang Chu-----------");
                System.out.println();
                System.out.println("1. Cho canh");
                System.out.println("2. Phu kien cho cho");
                System.out.println("3. Meo canh");
                System.out.println("4. Phu kien cho meo");
                System.out.println("0. Dang xuat");
                System.out.println("Ban chon ?");

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("---Danh sach cho con:");
                        listDog();
                        System.out.println("He thong dang bao tri! Xin cam on");
                        page(user);
                        break;
                    case 2:
                        System.out.println();
                        menuAccessoryDog();
                        break;
                    case 3:
                        System.out.println("---Danh sach meo con");
                        listCat();
                        System.out.println("He thong dang bao tri! Xin cam on");
                        break;
                    case 4:
                        System.out.println();
                        menuAccessoryCat();
                        break;
                    case 0:
                        continueSub = false;
                        break;
                    default:
                        System.out.println("Khong co lua chon nay!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long lua chon chu so");
            }
        }
    }

    public void listDog() {
        List<Pet> pets = petService.getDog(allPet);
        Pet pet = choiceMyPet(pets);
    }

    public void listCat() {
        List<Pet> pets = petService.getCat(allPet);
        Pet pet = choiceMyPet(pets);

    }

    public void allListAccessoryDog() {
        List<Accessory> accessories = accessoryService.getAccessoryDog(allAccesstory);
        Accessory accessory = choiceMyAccessory(accessories);
    }

    public void allListAccessoryCat() {
        List<Accessory> accessories = accessoryService.getAccessoryCat(allAccesstory);
        Accessory accessory = choiceMyAccessory(accessories);
    }
    
    public Pet choiceMyPet(List<Pet> pets) {
        boolean continueSub = true;
        while (continueSub) {
            try {
                util.showListWithOrder(pets);
                System.out.println("0. Tro lai");
                System.out.println("Ban muon mua ?");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) {
                    continueSub = false;
                } else {
                    return util.choiceOrder(pets, choice);
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long lua chon chu so");
            }
        }
        return null;

    }

    public Accessory choiceMyAccessory(List<Accessory> accessories) {
        boolean continueSub = true;
        while (continueSub) {
            try {
                util.showListWithOrder(accessories);
                System.out.println("0. Tro lai");
                System.out.println("Ban muon mua ?");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) {
                    continueSub = false;
                } else {
                    return util.choiceOrder(accessories, choice);
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long lua chon chu so");
            }
        }
        return null;
    }

    public void menuAccessory() {
            System.out.println();
            System.out.println("1. Toan bo san pham");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("0. Tro lai");
            System.out.println("Ban chon ?");
    }

    public void menuAccessoryDog() {
        
        boolean continueSub = true;
        while (continueSub) {
            menuAccessory();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    allListAccessoryDog();
                    System.out.println("He thong dang bao tri! Xin cam on");
                    continueSub = false;
                    break;
                case 2:
                    searchAccessoryDog();
                    System.out.println("He thong dang bao tri! Xin cam on");
                    continueSub = false;
                    break;
                case 0:
                    continueSub = false;
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }
    }

    public void menuAccessoryCat() {
        boolean continueSub = true;
        while (continueSub) {
            menuAccessory();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    allListAccessoryCat();
                    System.out.println("He thong dang bao tri! Xin cam on");
                    continueSub = false;
                    break;
                case 2:
                    searchAccessoryCat();
                    System.out.println("He thong dang bao tri! Xin cam on");
                    continueSub = false;
                    break;
                case 0:
                    continueSub = false;
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }
    }

    public void searchAccessoryDog() {
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        List<Accessory> accessories = accessoryService.getAccessoryDogByName(name);
        Accessory selectAccessory = choiceMyAccessory(accessories);
    }

    public void searchAccessoryCat() {
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        List<Accessory> accessories = accessoryService.getAccessoryCatByName(name);
        Accessory selectAccessory = choiceMyAccessory(accessories);
    }

}
