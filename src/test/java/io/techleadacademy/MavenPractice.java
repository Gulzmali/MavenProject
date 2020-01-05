package io.techleadacademy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenPractice {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://google.com");

        TestData test= new TestData();
        System.out.println(test.getRandomFirstName());
        System.out.println(test.getRandomLastName());
        System.out.println(test.getRandomPhoneNumber());
        System.out.println(test.getRandomAddress());





    }
}
