package evg.tests.tests;

import evg.tests.model.ContactData1;
import evg.tests.model.ContactData2;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getNavigationHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData1("Тестов"));
    app.getContactHelper().initNextPageContactCreation();
    app.getContactHelper().fillContactForm2 (new ContactData2("hello", "привет", "middle", "nick", "address", "test1"), true);
    app.getContactHelper().initSubmitContactCreation();
    app.getNavigationHelper().gotoHomePage();
  }
}
