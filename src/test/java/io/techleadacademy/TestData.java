package io.techleadacademy;

import com.github.javafaker.Faker;

public class TestData {
    /*
    1.create a method which will return a random -getRandomFirstName
    2.create  a method which will return a random- getRandomLastName
    3.create a method which will return a random- getRandomPhoneNumber
    4.create a method which will return a random - getRandomAddress
              Ex: 10090 Main Street,Fairfax, VA 22031

     */

    Faker fake = new Faker();
    public String getRandomFirstName() {
        return fake.name().firstName();
    }

    public String getRandomLastName() {
        return fake.name().lastName();
    }

    public String getRandomPhoneNumber() {
        return fake.phoneNumber().cellPhone();

    }

    public String getRandomAddress() {
        return fake.address().fullAddress();
    }
}