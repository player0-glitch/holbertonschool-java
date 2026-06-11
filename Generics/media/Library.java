import java.util.List;
import java.util.ArrayList;

class Library<T extends Media> {
  private List<T> mediaList;

  public Library() {
    this.mediaList = new ArrayList<>();
  }

  public void addMedia(T media) {
    mediaList.add(media);
  }

  public List<T> getMediaList() {
    return this.mediaList;
  }
}
