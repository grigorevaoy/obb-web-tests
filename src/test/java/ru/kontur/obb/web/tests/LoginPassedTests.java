package ru.kontur.obb.web.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPassedTests extends TestBase {


  @Test
  public void testLoginPassed() throws Exception {
    //проверяем, что удалось залогиниться
    Assert.assertEquals(false, app.goTo().authorizationFailed());

  }
}

