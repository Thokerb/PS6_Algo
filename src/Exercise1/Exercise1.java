package Exercise1;

import java.util.ArrayList;

public class Exercise1 {

    public static void main(String[] args) {
        var node = new Node<Integer>(4);
        var list = new ArrayList<Node<Integer>>();
        list.add(new Node<Integer>(9));


        list.add(new Node<Integer>(12));
        list.add(new Node<Integer>(45));
        list.add(new Node<Integer>(76));
        var node2 = new Node<Integer>(12);
        var list2 = new ArrayList<Node<Integer>>();
        list2.add(new Node<Integer>(800));
        node2.children  = list2;
        list.add(node2);
        node.children = list;
/*
    4
9,12,45,76,12
            |
            800

 */


        var tree = new Tree<Integer>(node);
        tree.traverseTree();
    }


}
