package collnection2;

public class NodeTest {
    public static void test(Node<?> node){
        while (node != null){
            System.out.println("value is"+ node.getValue());
            node=node.next;
        }
    }

    public static void main(String[] args) {
        Node<String> root = new Node<>("Step1");
        Node<String> root1 = new Node<>("Step2");
        Node<Integer> root2= new Node<Integer>(23,new Node<Integer>((11)));
//        root.next=node1;
        test(root2);
    }
}
