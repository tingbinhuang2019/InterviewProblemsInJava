import java.util.*;

public class StrobogrammaticNumber {
  Map<Character, Character> map = new HashMap<Character, Character>() {
    {
      put('6', '9');
      put('9', '6');
      put('0', '0');
      put('8', '8');
      put('1', '1');
    }
  };

  public boolean isStrobogrammatic(String num) {
    int l = 0, r = num.length() - 1;

    while (l <= r) {

      if (!map.containsKey((num.charAt(l)))) {
        return false;
      }

      if (map.get(num.charAt(l)) != num.charAt(r)) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }

  public static void main(String args[]) {
    StrobogrammaticNumber s = new StrobogrammaticNumber();
    boolean t = s.isStrobogrammatic("69");
    System.out.println((t));
  }

}