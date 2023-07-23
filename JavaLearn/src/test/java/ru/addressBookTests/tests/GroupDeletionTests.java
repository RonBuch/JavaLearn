package ru.addressBookTests.tests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase{





  @Test
  public void testGroupDeletion() throws Exception {

    app.goToGroupPage();
    app.selectGroup();
    app.clickDelete();
    app.goToGroupPage();
  }


}
