package ru.kontur.obb.web.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  // метод возвращает true, если на странице появляется сообщение о некорректной авторизации
  public boolean authorizationFailed() {
    boolean returnvalue = false;
    if (wd.findElement(By.cssSelector("div.status-message")).getText() == "Некорректный логин или пароль"){
      returnvalue = true;
    }
    return returnvalue;
  }

}

