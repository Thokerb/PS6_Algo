package Exercise1;


import java.util.Stack;

public class BreadthFirstTraverser implements Traverser {

    @Override
    public void traverse(Node root) {
        var stack = new Stack<Node>();
        stack.push(root);

        while (!stack.empty()){

            var node = stack.pop();
            visit(node);
            for (var child : node.children) {
                stack.push( (Node) child);  //java bad
            }


        }
    }

    @Override
    public void visit(Node node) {
        System.out.println(node);
    }
}
