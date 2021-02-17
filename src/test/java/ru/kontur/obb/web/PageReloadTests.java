package ru.kontur.obb.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PageReloadTests {
  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
    login("111", "111");
    wd.get("http://localhost:8080/Interface/#/app/app.TAP:1.1.146/values/constants/list");
    //wd.findElement(By.linkText("Документы")).click();
   // goToPage();
   // reloadPage();
  }

  public void login(String username, String password) {
    wd.get("http://localhost:8080/Interface/");
    wd.findElement(By.xpath("//div[2]/div[2]")).click();
    wd.findElement(By.xpath("//input[@value='']")).clear();
    wd.findElement(By.xpath("//input[@value='']")).sendKeys(username);
    wd.findElement(By.xpath("(//input[@value=''])[2]")).click();
    wd.findElement(By.xpath("(//input[@value=''])[2]")).clear();
    wd.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys(password);
    wd.findElement(By.xpath("//button[@type='button']")).click();

    wd.findElement(By.xpath("//span/span/span")).click();
    wd.findElement(By.xpath("//div[3]/div/div/div/div/button")).click();
    wd.findElement(By.xpath("//span[2]/span/button/div")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }
}
