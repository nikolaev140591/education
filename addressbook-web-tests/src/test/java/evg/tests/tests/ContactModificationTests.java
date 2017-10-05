package evg.tests.tests;

import evg.tests.model.ContactData1;
import evg.tests.model.ContactData2;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact1(new ContactData1("777"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm2(new ContactData2("1", "2", "3", "4", null, null), false);
    app.getContactHelper().initSubmitContactModification();
    app.getNavigationHelper().gotoHomePage();
  }
}
