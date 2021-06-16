package org.cn.tree;

class Node<K extends Comparable<K>> {
    K key;
    private Node<K> left;
    private Node<K> right;
    Node<K> parent;

    public Node(K key) {
        this.key = key;
    }

    Node<K> left() {
        return left;
    }

    void setLeft(Node<K> left) {
        this.left = left;
        left.parent = this;
    }

    Node<K> right() {
        return right;
    }

    void setRight(Node<K> right) {
        this.right = right;
        right.parent = this;
    }
}
