package evg.tests.model;

public class ContactData2 {
  private final String address;
  private final String lastname;
  private final String email;
  private final String middlename;
  private final String nickname;
  private String group;

  public ContactData2(String address, String lastname, String email, String middlename, String nickname, String group) {
    this.address = address;
    this.lastname = lastname;
    this.email = email;
    this.middlename = middlename;
    this.nickname = nickname;
    this.group = group;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail() {
    return email;
  }

  public String getLastname() {
    return lastname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getNickname() {
    return nickname;
  }

  public String getGroup() {
    return group;
  }
}
