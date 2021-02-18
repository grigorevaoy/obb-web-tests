package ru.kontur.obb.web.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class LoginTests extends TestBase{
  private WebDriver wd;


  @Test
  public void testLogin() throws Exception {
    //Эта проверка не работает, падает с Java.lang.NullPointer
    Assert.assertNotNull(wd.findElement(By.xpath("//span[2]/span/button/div")));
  }
  }

