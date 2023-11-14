package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class Com_HeroKuapp {

    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        // Step 1: Setup browser

        if (browser.trim().equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.trim().equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.trim().equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser");
        }

        // Step 2 : Open the URL into Browser
        driver.get(baseUrl);

        //  Step 3 : Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Step 4 : print the current url
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 5 : Print the page source.
        System.out.println(driver.getPageSource());

        // Step 6 :  Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("tomsmith");

        // Step 7 :  Enter the password to password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SuperSecret!");

        // Step 8: Click on Login Button.
        WebElement loginButton = driver.findElement(By.cssSelector(".fa"));
        loginButton.click();

        // Step 9 : Print the current url.
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Step 10 :  Refresh the page.
        driver.navigate().refresh();

        //  Step 11 : Close the browser.
        driver.quit();

    }

}
