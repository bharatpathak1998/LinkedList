package UC5;

public class MyLinkedList<K> {

    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode<K> newNode, INode<K> myNewNode) {
        INode<K> tempNode = newNode.getNext();
        newNode.setNext(myNewNode);
        myNewNode.setNext(tempNode);
    }

    public INode<K> popFirst() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public void printMyNode() {
        System.out.println("My Nodes : "+head);
    }
}