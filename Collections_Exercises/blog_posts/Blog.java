import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.HashSet;

public class Blog {
  private Set<Post> posts;

  public Blog() {
    this.posts = new HashSet<>();
  }

  public void addPost(Post post) {
    if (!posts.add(post))
      throw new IllegalArgumentException("Post already exists");
  }

  public Set<Author> getAllAuthors() {
    Set<Author> authors = new TreeSet<>();

    for (Post post : posts) {
      authors.add(post.getAuthor());
    }

    return authors;
  }

  public Map<Categories, Integer> getCountByCategory() {
    Map<Categories, Integer> categoryCountMap = new HashMap<>();

    for (Post post : posts) {
      categoryCountMap.put(post.getCategory(), categoryCountMap.getOrDefault(post.getCategory(), 0) + 1);
    }

    return categoryCountMap;
  }

  public Set<Post> getPostsByAuthor(Author auth) {
    Set<Post> result = new TreeSet<>();
    for (Post p : this.posts) {
      if (p.getAuthor().equals(auth)) {
        result.add(p);
      }
    }
    return result;
  }

  public Set<Post> getPostsByCategory(Categories category) {
    Set<Post> result = new TreeSet<>();
    for (Post p : this.posts) {
      if (p.getCategory() == category) {
        result.add(p);
      }
    }
    return result;
  }

  public Map<Categories, Set<Post>> getAllPostsByCategories() {
    Map<Categories, Set<Post>> result = new HashMap<>();
    for (Post post : posts) {
      result.computeIfAbsent(post.getCategory(), k -> new TreeSet<>()).add(post);
    }
    return result;
  }

  public Map<Author, Set<Post>> getAllPostsByAuthor() {
    Map<Author, Set<Post>> result = new HashMap<>();
    for (Post post : posts) {
      result.computeIfAbsent(post.getAuthor(), k -> new TreeSet<>()).add(post);
    }
    return result;
  }
}
