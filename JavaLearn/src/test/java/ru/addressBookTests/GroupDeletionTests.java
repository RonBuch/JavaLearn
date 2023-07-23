package ru.addressBookTests;

import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase{





  @Test
  public void testGroupDeletion() throws Exception {

    goToGroupPage();
    selectGroup();
    clickDelete();
    goToGroupPage();
  }


}
