package ru.kontur.obb.web.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  // написать функцию, которая возращает true, если элемент с ошибкой авторизации есть на странице
  public boolean returnMessageLoginError() {
    boolean returnvalue = true;
    return returnvalue;
  }

}

