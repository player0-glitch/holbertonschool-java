public class Slack implements NotificationChannel {

  @Override
  public void notify(Message message) {
    System.out.printf("[Slack] {%s} - %s%n", message.getMessageType(), message.getText());
  }
}
