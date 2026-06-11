import java.util.Objects;

public class Author implements Comparable<Author> {
  private String name;
  private String surname;

  public Author(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  @Override
  public String toString() {
    return name + " " + surname;
  }

  @Override
  public int compareTo(Author other) {
    int surnameCompare = this.surname.compareTo(other.surname);
    if (surnameCompare == 0) {
      return this.surname.compareTo(other.name);
    }
    return surnameCompare;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Author))
      return false;

    Author a = (Author) o;
    return Objects.equals(name, a.name) &&
        Objects.equals(surname, a.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, surname);
  }
}
