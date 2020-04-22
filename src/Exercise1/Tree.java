package Exercise1;

public class Tree<value> {

    private Node<value> root;
    private Traverser traverser;

    public Tree(Node node){
        this.root = node;
        traverser = new BreadthFirstTraverser();
    }

    public void traverseTree(){
        traverser.traverse(root);
    }

}
