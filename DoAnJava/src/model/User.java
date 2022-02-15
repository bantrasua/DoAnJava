package model;

import util.util;

public class User {
    private int idUser;
    private String name;
    private String phone;
    private String address;
    private String password;

    
    public User( String name, String phone, String address, String password) {
        this.idUser = util.randomIdUser();
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.password = password;
    }


    public int getIdUser() {
        return idUser;
    }


    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
