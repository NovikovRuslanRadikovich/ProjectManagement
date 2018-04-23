package com.kpfu.pm.coffeehouse.dto;

public class UserDto extends SignInDto{

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;




}
