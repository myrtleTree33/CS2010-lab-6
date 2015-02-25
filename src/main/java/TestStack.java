/**
 * Created by joel on 2/25/15.
 */

import sun.security.util.BigInt;

import java.util.*;
import java.math.*;

public class TestStack {
  public static void main(String[] args) {
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
}

// Implement the following class
class MyNode<E> {

  private BigInteger priority = BigInteger.ZERO;
  private E data;

  public BigInteger getPriority() {
    return priority;
  }

  public void setPriority(BigInteger priority) {
    this.priority = priority;
  }

  public E getData() {
    return data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public MyNode(BigInteger priority, E data) {
    this.priority = priority;
    this.data = data;
  }
}

// Implement the comparator class needed when a PriorityQueue object is created
class ComparatorMyNode<E> implements Comparator<MyNode<E>> {
  public int compare(MyNode<E> e1, MyNode<E> e2) {
    BigInteger a = e1.getPriority(), b = e2.getPriority();
    return a.compareTo(b);
  }
}

// Implement the stack using PriorityQueue
class MyStack<E> {
  private PriorityQueue<MyNode<E>> pq;
  private BigInteger i = BigInteger.ZERO;
  private Integer size;

  
  /**
   * Creates a new stack, with a min priority queue
   * @param size Cannot be larger than Integer.MAX_VALUE
   */
  public MyStack(Integer size) {
    initialize(size);
  }
  
  public MyStack() {
    initialize(50);
  }
  
  private void initialize(Integer size) {
    this.size = size;
    pq = new PriorityQueue<MyNode<E>>( size, new ComparatorMyNode<E>());
    i = BigInteger.valueOf(size);
  }
  
  public Boolean push(E item) {
    if ( i.compareTo(BigInteger.ZERO) == 0 ) {
      // means queue full
      System.err.println("Queue full.");
      return false;
    }
    pq.offer(new MyNode<E>(i, item));
    i = i.subtract(BigInteger.ONE);
    return true;
    
  }
  
  public E pop() {
    if (isEmpty()) {
      System.err.println("Queue empty.");
      return null;
    }
    i = i.add(BigInteger.ONE);
    E elem = pq.poll().getData();
    return elem;
  }
  
  public Boolean isEmpty() {
    return (i.compareTo(BigInteger.valueOf(size)) == 0);

  }
  
}

  
  