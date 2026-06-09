import java.util.ArrayList;

public class Mobile {
  private ArrayList<Contact> contactList;

  public Mobile() {
    this.contactList = new ArrayList<>();
  }

  public int getContactPosition(String name) {
    for (int i = 0; i < contactList.size(); i++) {
      if (contactList.get(i).getName().equalsIgnoreCase(name))
        return i;
    }
    return -1;
  };

  public void addContact(Contact contact) throws Exception {
    if (getContactPosition(contact.getName()) >= 0)
      throw new Exception("Could not add contact. Contact with this name already exists");

    contactList.add(contact);
    System.out.println("Contact " + contact.getName() + " added successfully");
  }

  public void updateContact(Contact oldContact, Contact newContact) throws Exception {
    int oldPosition = getContactPosition(oldContact.getName());

    if (oldPosition == -1) {
      throw new Exception("Could not modify contact. Contact does not exist");
    }

    int newPosition = getContactPosition(newContact.getName());
    if (newPosition >= 0 && newPosition != oldPosition) {
      throw new Exception("Could not modify contact. Contact with this name already exists");
    }

    contactList.set(oldPosition, newContact);
    System.out.println("Contact " + oldContact.getName() + " was updated to " + newContact.getName());
  }

  public void removeContact(Contact contact) throws Exception {
    int position = getContactPosition(contact.getName());
    if (position == -1) {
      throw new Exception("Could not remove contact. Contact does not exist");
    }
    contactList.remove(position);
    System.out.println("Contact " + contact.getName() + " was successfully removed");
  }

  public void listContacts() {
    if (contactList.isEmpty()) {
      System.out.println("Your contact list is empty");
      return;
    }
    // System.out.println("--- Contact List ---");
    for (Contact c : contactList)
      System.out.println(c.getName() + " -> " + c.getPhoneNumber() + " (" + c.getType() + ")");
  }
}
