package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.User;
import util.Validate;

public class UserService {

    Scanner scanner = new Scanner(System.in);

    public User userPhone(List<User> users, String phone) {
        for (User u : users) {
            if (u.getPhone().equals(phone)) {
                return u;
            }
        }
        return null;
    }

    public User userPassword(List<User> users, String password) {
        for (User u : users) {
            if (u.getPhone().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public List<User> allAccout() {
        List<User> users = new ArrayList<>();
        return users;
    }

    public User login(List<User> users) {
        System.out.println("Nhap so dien thoai:");
        String phone = scanner.nextLine();
        User user = userPhone(users, phone);
        if (user == null) {
            System.out.println("So dien thoai chua duoc dang ky!");
            return null;
        }
        System.out.println("Nhap mat khau:");
        String password = scanner.nextLine();
        if (user.getPassword().equals(password)) {
            System.out.println("Dang nhap thanh cong!");
            return user;
        } else {
            System.out.println("Nhap sai mat khau!");
            return null;
        }

    }

    public void register(List<User> users) {
        
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        String phone;
        while (true) {
            System.out.println("Nhap so dien thoai:");
            phone = scanner.nextLine();
            if (!Validate.validateNumberPhone(phone)) {
                System.out.println("So dien thoai khong hop le!");
            } else {
                break;
            }
        }
        System.out.println("Nhap dia chi:");
        String address = scanner.nextLine();
        System.out.println("Nhap mat khau:");
        String password = scanner.nextLine();
        User user = new User(name, phone, address, password);
        users.add(new User(name, phone, address, password));
        System.out.println("Dang ki thanh cong!!");
        System.out.println("Xin moi dang nhap lai!!");
        System.out.println();
    }
}
