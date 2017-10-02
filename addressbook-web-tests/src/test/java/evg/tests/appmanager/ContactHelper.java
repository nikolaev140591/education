package evg.tests.appmanager;

import evg.tests.model.ContactData1;
import evg.tests.model.ContactData2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void fillContactForm(ContactData1 contactData1) {
    type(By.name("address"), contactData1.getAddress());
  }

  public void fillContactForm(ContactData2 contactData2) {
    type(By.name("contact_midlename"), contactData2.getMiddlename());
    type(By.name("contact_lastname"), contactData2.getLastname());
    type(By.name("contact_address"), contactData2.getAddress());
    type(By.name("contact_home"), contactData2.getHome());
  }
  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

  public void initNextPageContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[1]"));
  }

  public void initSaveContactCreation() { click(By.xpath("//div[@id='content']/form/input[21]"));
  }


}
