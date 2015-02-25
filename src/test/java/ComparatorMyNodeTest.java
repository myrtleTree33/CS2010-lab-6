import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class ComparatorMyNodeTest {

  @Test
  public void testCompare() throws Exception {
    MyNode<Integer> a = new MyNode<Integer>(BigInteger.ZERO, new Integer(20));
    MyNode<Integer> b = new MyNode<Integer>(BigInteger.ZERO, new Integer(46));
  }
}