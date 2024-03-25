public class MyStack<T> {
  private MyLinkedList<T> list = new MyLinkedList<>();

  public void push(T item) {
    list.add(item);
  }

  public T pop() {
    if (list.getSize() == 0) {
      throw new IllegalStateException("Stack is empty");
    }
    T data = list.get(list.getSize() - 1);
    list.delete(list.getSize() - 1);
    return data;
  }

  public boolean isEmpty() {
    return list.getSize() == 0;
  }
}
