package evg.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.linkText("groups"))) {
return;
    }
    click(By.linkText("Группы"));
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void gotoContactCreation() {
    click(By.linkText("Добавить контакт"));
  }

  public void gotoHomePage() {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.linkText("Главная"));
  }
}


