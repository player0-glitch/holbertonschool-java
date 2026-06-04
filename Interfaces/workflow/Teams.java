public class Teams implements NotificationChannel {

  @Override
  public void notify(Message message) {
    System.out.printf("[TEAM] {%s} - %s%n", message.getMessageType(), message.getText());
  }
}
