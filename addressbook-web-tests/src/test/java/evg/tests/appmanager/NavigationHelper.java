package evg.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("Группы"));
  }

  public void gotoContactCreation(){
    click(By.linkText("Добавить контакт"));
  }

  public void returnToHomePage() {
    click(By.linkText("Главная"));
  }
}
