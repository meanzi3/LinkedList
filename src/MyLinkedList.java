import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {
  private Node<T> head;
  private int size;

  public int getSize() {
    return size;
  }

  private static class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  // MyLinkedList의 마지막 노드에 data를 추가
  public void add(T data) {
    Node<T> newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      Node<T> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
    size++;
  }

  // MyLinkedList의 i 번째 노드의 data를 반환
  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.data;
  }

  // MyLinkedList의 i 번째 노드의 데이터를 삭제
  public void delete(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    if (index == 0) {
      head = head.next;
    } else {
      Node<T> current = head;
      for (int i = 0; i < index - 1; i++) {
        current = current.next;
      }
      current.next = current.next.next;
    }
    size--;
  }

  // Iterator 인터페이스 구현
  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private Node<T> current = head;

      @Override
      public boolean hasNext() {
        return current != null;
      }

      @Override
      public T next() {
        T data = current.data;
        current = current.next;
        return data;
      }
    };
  }
}
