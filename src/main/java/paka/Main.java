package paka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod());
        ChromeOptions options = new ChromeOptions();
        WebDriver driver;

        driver = new ChromeDriver(options);
    }
    private static String myMethod(){
            return "my string";
        }
    }

