public class MyQueue<T> {
  private MyLinkedList<T> list = new MyLinkedList<>();

  public void enqueue(T item) {
    list.add(item);
  }

  public T dequeue() {
    if (list.getSize() == 0) {
      throw new IllegalStateException("Queue is empty");
    }
    T data = list.get(0);
    list.delete(0);
    return data;
  }

  public boolean isEmpty() {
    return list.getSize() == 0;
  }
}