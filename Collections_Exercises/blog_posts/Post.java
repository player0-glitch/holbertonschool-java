import java.util.*;

public class Post implements Comparable<Post> {
  private Author author;
  private String title;
  private String body;
  private Categories category;

  public Post(Author author, String title, String body, Categories category) {
    this.author = author;
    this.title = title;
    this.body = body;
    this.category = category;
  }

  public Author getAuthor() {
    return this.author;
  }

  public String getTitle() {
    return this.title;
  }

  public String getBody() {
    return this.body;
  }

  public Categories getCategory() {
    return this.category;
  }

  @Override
  public String toString() {
    return this.title;
  }

  @Override
  public int compareTo(Post other) {
    return this.title.compareTo(other.title);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Post))
      return false;

    Post p = (Post) o;
    return Objects.equals(author, p.author) &&
        Objects.equals(title, p.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, title);
  }
}
