package ru.kontur.obb.web.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SessionHelper extends HelperBase{
  private final Properties properties;

  public SessionHelper(WebDriver wd) {
    super(wd);
    properties = new Properties();
  }

  public void login(String username, String password) throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));

    //надо добавить timeout, так как тест падает, не находя этот локатор
    wd.findElement(By.xpath("//div[2]/div[2]")).click();
    wd.findElement(By.xpath("//input[@value='']")).clear();
    wd.findElement(By.xpath("//input[@value='']")).sendKeys(username);
    wd.findElement(By.xpath("(//input[@value=''])[2]")).click();
    wd.findElement(By.xpath("(//input[@value=''])[2]")).clear();
    wd.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys(password);
    wd.findElement(By.xpath("//button/div")).click();
  }
}
