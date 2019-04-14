import java.util.*;

public class ZigzagIterator {

  private List<Integer> v1, v2;
  private int c1, c2;

  public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
    this.v1 = new ArrayList<Integer>(v1);
    this.v2 = new ArrayList<Integer>(v2);
    this.c1 = 0;
    this.c2 = 0;
  }

  public int next() {

    if (c1 == v1.size()) {
      return getValue2();
    }

    if (c2 == v2.size()) {
      return getValue1();
    }

    if ((c1 + c2) % 2 == 0) {
      return getValue1();
    } else {
      return getValue2();
    }
  }

  public boolean hasNext() {
    return c1 + c2 < v1.size() + v2.size();
  }

  public int getValue1() {
    c1++;
    return v1.get(c1 - 1);
  }

  public int getValue2() {
    c2++;
    return v2.get(c2 - 1);
  }

  public static void main(String args[]) {

    List<Integer> v1 = new ArrayList<Integer>();
    v1.add(1);
    v1.add(2);

    List<Integer> v2 = new ArrayList<Integer>();
    v2.add(3);
    v2.add(4);
    v2.add(5);
    v2.add(6);

    ZigzagIterator i = new ZigzagIterator(v1,v2);
    List<Integer> list = new ArrayList<Integer>();

    while(i.hasNext()) {
      list.add(i.next());
    }
    System.out.println(list);
  }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2); while (i.hasNext()) v[f()] =
 * i.next();
 */
  