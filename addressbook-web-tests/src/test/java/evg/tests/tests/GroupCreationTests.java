package evg.tests.tests;

import evg.tests.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Тестовая", "тест2", "тест3"));
    app.getGroupHelper().submitToGroupPage();
    app.getGroupHelper().returnToGroupPage();
  }

}
