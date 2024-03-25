public class Main {
  public static void main(String[] args) {
    // MyLinkedList 예제
    MyLinkedList<Integer> linkedList = new MyLinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.delete(1);

    System.out.println("MyLinkedList:");
    for (Integer data : linkedList) {
      System.out.println(data);
    }

    // Queue 예제
    MyQueue<Integer> queue = new MyQueue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    System.out.println("\nQueue:");
    while (!queue.isEmpty()) {
      System.out.println(queue.dequeue());
    }

    // Stack 예제
    MyStack<Integer> stack = new MyStack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("\nStack:");
    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
    }
  }
}
