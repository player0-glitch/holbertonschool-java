import java.util.HashSet;
import java.util.TreeSet;

class DuplicatedNumbers {
  public static TreeSet<Integer> isFind(int[] numbers) {
    TreeSet<Integer> duplicates = new TreeSet<>();
    HashSet<Integer> seenNumbers = new HashSet<>();

    if (numbers == null) {
      return duplicates;
    }

    for (int num : numbers) {
      if (!seenNumbers.add(num)) {
        duplicates.add(num);
      }
    }

    return duplicates;
  }
}
