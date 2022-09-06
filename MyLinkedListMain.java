package UC8;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(40);

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.insert(myFirstNode, myThirdNode);
        System.out.println(myLinkedList.search(30));
        myLinkedList.printMyNode();

        myLinkedList.insert(myThirdNode, myFourthNode);
        myLinkedList.printMyNode();
    }
}