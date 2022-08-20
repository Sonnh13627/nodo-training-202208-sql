package collnection2;

public class TreeNode<T> {
    private T value;
    private TreeNode<T> nextSibling;
    private TreeNode<T> firstChild;
    private TreeNode<T> parent;

    public TreeNode(T v){
        value = v;
    }

    public TreeNode<T> getNextSibling() {
        return nextSibling;
    }

    public void setNextSibling(TreeNode<T> nextSibling) {
        this.nextSibling = nextSibling;
    }

    public TreeNode<T> getParent() {
        return getParent();
    }

    public TreeNode<T> getFirstChild() {
        return nextSibling;
    }
    public void addChild(TreeNode<T> child){
        if (child == null)return;
        child.parent = parent;
        if (firstChild==null){
            firstChild = child;
        }else{
            TreeNode<T> temp = firstChild;
            while (temp.nextSibling != null){
                temp = temp.nextSibling;
            }
            temp.nextSibling=child;
        }

    }
    TreeNode<T> addChild(T value){
        TreeNode<T> node = new TreeNode<T>(value);
        addChild(node);
        return node;
    }
    public static <T> boolean contains(TreeNode<T> node, T avalue){
        if (node.value.equals(avalue))return true;
        TreeNode<T> temp = node.firstChild;
        while (temp !=null){
            if(contains(temp,avalue)) return true;
            temp = temp.nextSibling;
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode<String> root = new TreeNode<>("0");
        TreeNode<String> node1 =new TreeNode<>( "1.0");
        root.addChild(node1);
        root.addChild(new TreeNode<>("1.1"));
        root.addChild(new TreeNode<>("1.2"));
        root.addChild(new TreeNode<>("1.3"));
        TreeNode<String> node2 = node1.nextSibling;
        System.out.println("next sibling of" +node1.value+" is" + node2.value);
        TreeNode<String> node3 = node2.nextSibling;
        System.out.println("next sibling of" +node2.value+" is" + node3.value);
        node2.addChild(new TreeNode<>("2.0.0"));
        node2.addChild(new TreeNode<>("2.1.0"));
        node2.addChild(new TreeNode<>("2.1.1"));
    }
}
