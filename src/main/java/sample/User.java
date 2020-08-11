package sample;

import java.util.Date;
import java.util.Objects;

/**
 * Sample user class, rewrite hashcode() and equals() function
 */
public class User {

  private int age;
  private String name;
  private Date time;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return age == user.age &&
        Objects.equals(name, user.name) && //Note, here we can use Objects functions
        Objects.equals(time, user.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name, time); //Note, here we can use Objects functions
  }
}
