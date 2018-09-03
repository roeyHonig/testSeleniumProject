package student.roey.honig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", "C:/roey/chromeDriverForSolenium/chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://responsive-cv.firebaseapp.com/");
    }
}

