package ru.kontur.obb.web.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PageReloadTests extends TestBase{
  private WebDriver wd;

  @Test(enabled = false)
  public void PageReloadTests() {
    //непонятно, как организовать файл с url, где его держать и читать (ApplicationManager)
    app.goTo().page("тут будет url"); //переход на заданную страницу
    app.goTo().page("тут будет url").reload(); //обновление страницы
    wd.get("http://localhost:8080/Interface/#/app/app.TAP:1.1.146/values/constants/list");

  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }
}
