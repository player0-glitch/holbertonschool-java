import java.util.List;

public class ManipulateArrayNumbers {
  public static int findNumberPosition(List<Integer> list, int numberToSearch) {
    if (list == null)
      return -1;
    return list.indexOf(numberToSearch);
  }

  public static void addNumber(List<Integer> list, int numberToAdd) {
    if (findNumberPosition(list, numberToAdd) != -1) {
      throw new IllegalArgumentException("Number already in the list");
    }
    list.add(numberToAdd);
  }

  public static void removeNumber(List<Integer> list, int numberToRemove) {
    int position = findNumberPosition(list, numberToRemove);

    if (position == -1)
      throw new IllegalArgumentException("Number not found in the list");
    list.remove(numberToRemove);
  }

  public static void replaceNumber(List<Integer> list, int numberToReplace, int replacementNumber) {
    int position = findNumberPosition(list, numberToReplace);

    if (position != -1) {
      list.set(position, replacementNumber);
    } else {
      list.add(replacementNumber);
    }
  }
}
