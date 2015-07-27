package com.agenthun;

import java.util.Arrays;

/**
 * Created by Agent Henry on 2015/7/27.
 */
public class MyStack<E> {
    private Object[] stack;
    private int size;

    public MyStack() {
        stack = new Object[10];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) stack[size - 1];
    }

    public E pop() {
        E e = peek();
        stack[size - 1] = null;
        size--;
        return e;
    }

    public E push(E item) {
        ensureCapacity(size + 1);
        stack[size++] = item;
        return item;
    }

    private void ensureCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            int newLen = 10;//每次扩充容量
            stack = Arrays.copyOf(stack, newLen);
        }
    }

    public static void main(String[] args) {
        MyStack<Integer> s = new MyStack<>();
        s.push(1);
        s.push(2);
        System.out.println("元素个数 = " + s.size);
        System.out.println("栈顶元素 = " + s.pop());
        System.out.println("栈顶元素 = " + s.pop());
    }
}
