package ru.addressBookTests;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase{


  @Test
  public void testGroupCreation() throws Exception {

    goToGroupPage();
    createNewGroup();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    goToGroupPage();
    logout();
  }

}
