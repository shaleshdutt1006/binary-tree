package com.bridgelabz;

public class MyBinaryTree<K extends Comparable<K>> {
    private INode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private INode<K> addRecursively(INode<K> current, K key) {
        if (current == null)
            return new INode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult < 0) {
            current.left = addRecursively(current.left, key);

        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public void print() {
        printRec(root);
    }

    void printRec(INode root) {
        if (root != null) {
            System.out.println(root.key);
            printRec(root.left);
            printRec(root.right);
        }
    }


}



