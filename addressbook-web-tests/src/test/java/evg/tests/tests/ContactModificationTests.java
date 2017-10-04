package evg.tests.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification(){
    app.getNavigationHelper().returnToHomePage();
    app.getContactHelper().initContactModification();
    
  }
}
