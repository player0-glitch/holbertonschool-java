import java.util.ArrayList;
import java.util.List;

public class VideoProcessor {
  private List<NotificationChannel> channels = new ArrayList<>();

  public void registerChannel(NotificationChannel channel) {
    channels.add(channel);
  }

  public void process(Video v) {
    String msgTxt = v.getFile() + " - " + v.getFormat();
    Message msg = new Message(msgTxt, MessageType.LOG);

    for (NotificationChannel c : channels) {
      c.notify(msg);
    }
  }
}
