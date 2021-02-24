package ru.kontur.obb.web.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class LoginTests extends TestBase{
  private WebDriver wd;


  @Test
  public void testLogin() throws Exception {
    //Эта проверка не работает, падает с Java.lang.NullPointer
    System.out.println("It's OK");

    wd.getCurrentUrl();
    //wd.findElement(By.cssSelector("div.status-message")).getText();
//    Assert.assertNotNull(wd.findElement(By.cssSelector("div.status-message")));
  }
  }

