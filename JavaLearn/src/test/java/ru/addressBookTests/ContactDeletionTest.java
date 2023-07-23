package ru.addressBookTests;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactDeletionTest extends TestBase{

  @Test
  public void testContactDeletion() throws Exception {


    selectContact();
    deleteContact();
    Alert alert = wd.switchTo().alert();
    alert.accept();
    logout();
  }


}
