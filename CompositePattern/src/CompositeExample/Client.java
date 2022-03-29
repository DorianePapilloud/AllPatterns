package CompositeExample;

public class Client {
    public static void main(String[] args) {
        Component root = setUpTree();
        root.operation();

    }
    public static Component setUpTree(){
        Component node1 = new Composite("Node 1");
        Component node2 = new Composite("Node 2");

        Component l1 = new Leaf("Leaf 1");
        Component l2 = new Leaf("Leaf 2");
        Component l3 = new Leaf("Leaf 3");

        node1.add(l3);
        node1.add(node2);
        node2.add(l1);
        node2.add(l2);

        return node1;
    }

}
