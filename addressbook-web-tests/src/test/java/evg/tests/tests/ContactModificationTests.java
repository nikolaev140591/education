package evg.tests.tests;

import evg.tests.model.ContactData2;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm2(new ContactData2("address777888", "lastname888777", "email3333", "midle123", null, null), false);
    app.getContactHelper().initSubmitContactModification();
    app.getNavigationHelper().gotoHomePage();
  }
}
