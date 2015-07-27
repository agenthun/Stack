package com.agenthun;

/**
 * Created by Agent Henry on 2015/7/27.
 */
public class MyNodeStack<E> {
    Node<E> top = null;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public E pop() {
        if (this.isEmpty()) {
            return null;
        }
        E data = top.data;
        top = top.next;
        return data;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public static void main(String[] args) {
        MyNodeStack<Integer> s = new MyNodeStack<>();
        s.push(1);
        s.push(2);
        System.out.println("栈顶元素 = " + s.peek());

        s.pop();
        System.out.println("栈顶元素 = " + s.peek());
        s.pop();
        System.out.println("栈顶元素 = " + s.peek());
    }
}

class Node<E> {
    Node<E> next = null;
    E data;

    public Node(E data) {
        this.data = data;
    }
}
