package ru.kontur.obb.web.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFailedTests extends TestBase {


  @Test
  public void testLoginFailed() {
    //проверяем, что не удалось залогиниться
    Assert.assertEquals(true, app.goTo().authorizationFailed());
  }
}

