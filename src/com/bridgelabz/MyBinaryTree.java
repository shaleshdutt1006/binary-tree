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

    public int getSize() {
        return this.getSizeRecursively(root);
    }

    private int getSizeRecursively(INode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
    }

    public void search(K value) {
        int counter = 0;
        INode<K> temp = root;
        if (temp != null) {
            while (temp.key.compareTo(value) < 0) {

                temp = temp.right;

            }
            if (temp.key == value) {
                counter++;
            }
            if (root.key == value)
                counter++;
            while (temp.key.compareTo(value) > 0) {

                temp = temp.left;

            }
            if (temp.key == value) {
                counter++;
            }
            if (counter > 0) {
                System.out.println("Element " + value + " is present");
            } else {
                System.out.println("Element " + value + " is not present");
            }
        }
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

    @Override
    public String toString() {
        return "MyBinaryTree [root=" + root + ", getSize()=" + getSize() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

}






