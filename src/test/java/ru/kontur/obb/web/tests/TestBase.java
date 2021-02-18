package ru.kontur.obb.web.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.kontur.obb.web.appmanager.ApplicationManager;


public class TestBase {

  protected final static ApplicationManager app =
          new ApplicationManager(System.getProperty("browser", BrowserType.FIREFOX));
  private WebDriver wd;

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }



}

