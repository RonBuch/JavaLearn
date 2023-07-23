package ru.addressBookTests.tests;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactDeletionTest extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {


    app.selectContact();
    app.deleteContact();
    Alert alert = app.wd.switchTo().alert();
    alert.accept();
    app.logout();
  }


}
