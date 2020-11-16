package ru.kontur.obb.web;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTests {
  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
    login("111", "111");
  }

  private void login(String username, String password) {
    wd.get("http://localhost:8080/Interface/");
    wd.findElement(By.xpath("//div[@id='root']/div/div/div/div/div/div[2]/div[2]/div")).click();
    wd.findElement(By.xpath("//input[@value='']")).clear();
    wd.findElement(By.xpath("//input[@value='']")).sendKeys(username);
    wd.findElement(By.xpath("(//input[@value=''])[2]")).click();
    wd.findElement(By.xpath("(//input[@value=''])[2]")).clear();
    wd.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys(password);
    wd.findElement(By.xpath("//button/div")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
