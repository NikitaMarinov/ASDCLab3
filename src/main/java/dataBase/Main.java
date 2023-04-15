package dataBase;

import MyList.MyList;
import tree.Tree;

import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> list = Manager.readFromFIle();
        System.out.println("Our list:");
       // Manager.showStudentArrayList(list);

        MyList myList = new MyList();
        myList.insertionFromDataBase(list);
        myList.print();

        System.out.println("Поиск:");
        System.out.println(myList.search(2));
        System.out.println("Удаление:");
        myList.remove(2); // по индексу,не айди
        myList.print();

        Tree tree = new Tree();
        tree.insertionFromDataBase(list);

        System.out.println("\nНаше дерево:");
        tree.printTree(tree.getRootNode());
        System.out.println("\nПоиск:");
        System.out.println(tree.findNodeByID(1));
        System.out.println("Удаление:");
        tree.remove(1);
        tree.printTree(tree.getRootNode());




        System.out.print("\n\nPre-order traversal: ");
        tree.printPreOrder(tree.getRootNode());

        System.out.print("\nPost-order traversal: ");
        tree.printPostOrder(tree.getRootNode());

        System.out.print("\nIn-order traversal: ");
        tree.printInOrder(tree.getRootNode());
    };

}

