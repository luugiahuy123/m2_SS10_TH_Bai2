package ss10.TH.TrienKhaiLopLinkedList;

public class MyLinkList {
    public Object printList;
    private Node head;
    private int numNodes;

    public MyLinkList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void addFirst(int i) {
    }

    public void add(int i, int i1) {
    }

    private class Node {
        private Node next;
        private final Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public void add(int index, Object data) {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
        public void addFirst(Object data) {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
            numNodes++;
        }

        public Node get(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        public void printList(){
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}


