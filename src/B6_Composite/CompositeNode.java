package B6_Composite;

public class CompositeNode extends Node {
    int value;
    Node left, right;

    CompositeNode(int value) {
        this.value = value;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    void setRight(Node right) {
        this.right = right;
    }

    @Override
    void duyetCay() {
        System.out.println("Composite Node: " + value);
        if (left != null) {
            left.duyetCay();
        }
        if (right != null) {
            right.duyetCay();
        }
    }
}