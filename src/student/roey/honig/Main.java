package student.roey.honig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", "C:/roey/chromeDriverForSolenium/chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://app.proggio.com/login");

         By inputTextFieldId = new By.ById("input-email");
         By inputPasswordTextFieldId = new By.ById("input-password");
        By signInBtnId = new By.ById("button-login");

        WebElement emailInput = obj.findElement(inputTextFieldId);
        emailInput.clear();
        emailInput.sendKeys("roeyhonig94@gmail.com");

        WebElement passwordInput = obj.findElement(inputPasswordTextFieldId);
        passwordInput.clear();
        passwordInput.sendKeys("14ZDDo01");

        WebElement signInBtn = obj.findElement(signInBtnId);
        signInBtn.click();


    }
}

