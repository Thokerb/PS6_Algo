package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Node<value> extends Object {

    public Node(value val){
        value = val;
        children = new ArrayList<Node<value>>();
    }

    public value value;
    public List<Node<value>> children;

    @Override
    public String toString() {
        return "Value: "+value;
    }
}
