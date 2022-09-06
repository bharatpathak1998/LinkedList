package UC1;

public class MyLinkedList {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        System.out.println(myFirstNode.getKey()+"->"+mySecondNode.getKey()+"->"+myThirdNode.getKey());
    }
}