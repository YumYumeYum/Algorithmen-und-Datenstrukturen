public class MyList {

   private class Node {
      
      Integer value;
      Node next;
      
      Node(Integer value) {
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
      this.size = 0;
   }

   public void add(Integer x){
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

   public Integer get(int index){

      if(index < 0 && index >= size){
         throw new IndexOutOfBoundsException("index out of bounds!");
      }
      Node firstNode = head;
      for(int i = 0; i < index; i++){
         firstNode = firstNode.next;
      }

      return firstNode.value;
   }

   public Integer remove(int index){

      Node current = head;

      if(index < 0 && index >= size){
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

   public static void main(String[] args) {
      MyList l= new MyList();
      for (int i=1; i<=10; ++i)
         l.add(8*i);
      l.remove(3);
      for (int i=l.size()-1; i>=0; --i)
         System.out.print(" " + l.get(i));
      System.out.println();
   }
}
