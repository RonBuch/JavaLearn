package ru.addressBookTests.tests;

import org.testng.annotations.*;
import ru.addressBookTests.model.GroupData;

public class GroupCreationTest extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    app.goToGroupPage();
    app.createNewGroup();
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.goToGroupPage();
    app.logout();
  }

}
