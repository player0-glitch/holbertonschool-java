import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
  private List<Post> posts;

  public Blog() {
    this.posts = new ArrayList<>();
  }

  public void addPost(Post post) {
    if (post != null) {
      this.posts.add(post);
    }
  }

  public Set<String> getAllAuthors() {
    Set<String> authors = new TreeSet<>();

    for (Post post : posts) {
      authors.add(post.getAuthor());
    }

    return authors;
  }

  public Map<String, Integer> getCountByCategory() {
    Map<String, Integer> categoryCountMap = new TreeMap<>();

    for (Post post : posts) {
      String category = post.getCategory();
      categoryCountMap.put(category, categoryCountMap.getOrDefault(category, 0) + 1);
    }

    return categoryCountMap;
  }
}
