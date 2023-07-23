package ru.addressBookTests;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    addNewContact();
    fillContactForm(new ContactData("First Name", "Last Name", "Address Org", "org@mail.ru", "999-999-99-99"));
    createNewContact();
    goToHomePage();
    logout();
  }


}
