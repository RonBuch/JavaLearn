package ru.addressBookTests.tests;

import org.testng.annotations.*;
import ru.addressBookTests.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {

    app.addNewContact();
    app.fillContactForm(new ContactData("First Name", "Last Name", "Address Org", "org@mail.ru", "999-999-99-99"));
    app.createNewContact();
    app.goToHomePage();
    app.logout();
  }


}
