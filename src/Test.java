public class Test {
    public static void main(String[] args) {
        BinarySearchTree bts = new BinarySearchTree();
        bts.add(60);
        bts.add(40);
        bts.add(10);
        bts.add(20);
        bts.add(30);
        System.out.println("Original: ");
        bts.inOrder();
        bts.remove(40);
        System.out.println("\nAfter remove 40: ");
        bts.inOrder();
        bts.remove(60);
        System.out.println("\nAfter remove 60: ");
        bts.inOrder();
    }
}
