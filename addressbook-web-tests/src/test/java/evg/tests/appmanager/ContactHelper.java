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

  public void fillContactForm2(ContactData2 contactData2) {
    type(By.name("email"), contactData2.getEmail());
    type(By.name("lastname"), contactData2.getLastname());
    type(By.name("middlename"), contactData2.getMiddlename());
    type(By.name("nickname"), contactData2.getNickname());
    type(By.name("address"), contactData2.getAddress());

  }


  public void initNextPageContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[1]"));
  }

  public void initSubmitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[1]"));
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void initSubmitContactModification() {
    click(By.name("update"));
  }

}
