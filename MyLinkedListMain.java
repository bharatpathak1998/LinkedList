package UC6;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(70);
        MyNode<Integer> myThirdNode = new MyNode<>(30);

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.insert(myFirstNode, myThirdNode);
        myLinkedList.printMyNode();

        System.out.println("After Deleting Last Element Using Pop Last Method : ");
        myLinkedList.popLast();
        myLinkedList.printMyNode();
    }
}