import java.util.Map;
import java.util.HashMap;

class Warehouse<T> implements Storable<T> {
  private Map<String, T> inventory;

  public Warehouse() {
    this.inventory = new HashMap<>();
  }

  @Override
  public void addToInventory(String name, T value) {
    inventory.put(name, value);
  }

  @Override
  public T getFromInventory(String name) {
    return inventory.get(name);
  }

  public Map<String, T> getInventory() {
    return inventory;
  }
}
