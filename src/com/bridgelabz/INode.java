package com.bridgelabz;


public class INode<K extends Comparable<K>> {

    K key;
    INode<K> left;
    INode<K> right;

    public INode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }


}
