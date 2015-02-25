import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class MyStackTest {

  @Test
  public void customStack() {
    
    System.out.println("--------------------------------");
    System.out.println("Testing for form with Java stack");
    System.out.println("--------------------------------");
    
    MyStack<Integer> st = new MyStack<Integer>();
    Stack<Integer> st1 = new Stack<Integer>();
    int j = 0;
    System.out.println("Fill a Java stack and MyStack with some random numbers ");
    for (int i = 0; i < 5; ++i) {
      j = (int) ((int) 2000 * Math.random());
      System.out.println("Pushing in: " + j);
      st.push(j);
      st1.push(j);
    }
    System.out.println("Print the 2 stacks for comparison");
    System.out.println("MyStack:");
    while (!st.isEmpty()) {
      System.out.println(st.pop());
    }

    System.out.println("Normal Stack:");
    while (!st1.isEmpty()) {
      System.out.println(st1.pop());
    }
    System.out.println("--------------------------------");

    System.out.println("--------------------------------");
    System.out.println("Testing empty works");
    System.out.println("--------------------------------");

    MyStack<Integer> stack2 = new MyStack<Integer>(30);
    System.out.println("Pushing in 6,10,2.");
    stack2.push(6);
    stack2.push(10);
    stack2.push(2);

    System.out.println("Popping " + stack2.pop());
    System.out.println("Popping " + stack2.pop());
    System.out.println("Popping " + stack2.pop());
    System.out.println("Reports empty now.");
    System.out.println("Popping " + stack2.pop());
    System.out.println("--------------------------------");

    System.out.println("--------------------------------");
    System.out.println("Testing if full then reject works");
    System.out.println("--------------------------------");
    MyStack<Integer> stack3 = new MyStack<Integer>(2);
    System.out.println("Pushing in 6,10,2.");
    stack3.push(6);
    stack3.push(10);
    System.out.println("Reports error when pushing in 2.");
    stack3.push(2);
    System.out.println("--------------------------------");
  }

  @Test
  public void testPush() throws Exception {
  }

  @Test
  public void testEmptyWorks() {
    MyStack<Integer> stack = new MyStack<Integer>(30);
    stack.push(6);
    stack.push(10);
    stack.push(2);

    assertEquals(new Integer(2), stack.pop());
    assertEquals(new Integer(10), stack.pop());
    assertEquals(new Integer(6), stack.pop());
    assertEquals(null, stack.pop());
  }

  @Test
  public void testMax() throws Exception {
    MyStack<Integer> stack = new MyStack<Integer>(2);
    stack.push(6);
    stack.push(10);
    stack.push(2);

    assertEquals(new Integer(10), stack.pop());
    assertEquals(new Integer(6), stack.pop());
  }

  @Test
  public void testPop() throws Exception {

  }

  @Test
  public void testIsEmpty() throws Exception {

  }
}