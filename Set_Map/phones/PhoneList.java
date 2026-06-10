import java.util.ArrayList;
import java.util.HashMap;

public class PhoneList {
  private HashMap<String, ArrayList<Phone>> contacts;

  public PhoneList() {
    this.contacts = new HashMap<>();
  }

  public void addPhone(String name, Phone phone) {
    contacts.putIfAbsent(name, new ArrayList<>());

    contacts.get(name).add(phone);
  }

  public ArrayList<Phone> isFind(String name) {
    return contacts.get(name);
  }
}
