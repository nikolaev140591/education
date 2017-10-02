package evg.tests.model;

public class ContactData2 {
  private final String middlename;
  private final String lastname;
  private final String address;
  private final String home;

  public ContactData2(String middlename, String lastname, String address, String home) {
    this.middlename = middlename;
    this.lastname = lastname;
    this.address = address;
    this.home = home;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getHome() {
    return home;
  }
}



