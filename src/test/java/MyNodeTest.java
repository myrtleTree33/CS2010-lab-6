import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class MyNodeTest {

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }
  
  @Test
  public void testInit() throws Exception {
    MyNode<Integer> a = new MyNode<Integer>(BigInteger.ZERO, new Integer(20));
    MyNode<Integer> b = new MyNode<Integer>(BigInteger.ZERO, new Integer(46));
  }
}