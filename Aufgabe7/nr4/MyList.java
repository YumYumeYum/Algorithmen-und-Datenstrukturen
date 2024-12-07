public class MyList<T> {

   private class Node {
      
      T value;
      Node next;
      
      Node(T value) {
          this.value = value;
          this.next = null;
      }
  }

   //attribute Mylist
   private Node head;   //erster Knoten
   private Node tail;   //letzter Knoten
   private int size;

   public MyList() {
      this.head = null;
      this.tail = null;
      this.size = 0;
   }

   public void add(T x){
      Node newNode = new Node(x);
      if(head == null){
         head = newNode;
         tail = newNode;
      } else {
         tail.next = newNode;
         tail = newNode;
      }
      size++;
   }

   public int size(){
      return size;
   }

   public T get(int index){

      if(index < 0 || index >= size){
         throw new IndexOutOfBoundsException("index out of bounds!");
      }
      Node firstNode = head;
      for(int i = 0; i < index; i++){
         firstNode = firstNode.next;
      }

      return firstNode.value;
   }

   public T remove(int index){

      Node current = head;

      if(index < 0 || index >= size){
         throw new IndexOutOfBoundsException("Hier koennte ihre Werbung stehen");
      }
      if(index == 0){
         head = current.next;   //gibt head eins weiter bei index 0 und entferne knoten pointer fuer muellabfuhr 
      } else {
         Node previous = null;
         for(int i = 0; i < index; i++){
            previous = current;
            current = current.next;
         }
         previous.next = current.next;
      }
      size--;
      return current.value;
   }

}