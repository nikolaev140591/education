package evg.tests.model;

public class ContactData2 {
  private final String email;
  private final String lastname;
  private final String middlename;
  private final String nickname;
  private final String address;


  public ContactData2(String email, String lastname, String middlename, String nickname, String address) {
    this.email = email;
    this.lastname = lastname;
    this.middlename = middlename;
    this.nickname = nickname;
    this.address = address;
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

  public String getAddress() {
    return address;
  }

}

