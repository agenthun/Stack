package com.agenthun;

/**
 * Created by Agent Henry on 2015/7/27.
 */
public class FindMinNodeStack {
    MyNodeStack<Integer> elem;
    MyNodeStack<Integer> min;

    public FindMinNodeStack() {
        elem = new MyNodeStack<>();
        min = new MyNodeStack<>();
    }

    public void push(int data) {
        elem.push(data);
        if (min.isEmpty()) {
            min.push(data);
        } else {
            if (data < min.peek()) min.push(data);
        }
    }

    public int min() {
        if (min.isEmpty()) return Integer.MAX_VALUE;
        else return min.peek();
    }

    public int pop(int data) {
        int topData = elem.peek();
        elem.pop();
        if (topData == this.min()) min.pop();
        return topData;
    }

    public static void main(String[] args) {
        FindMinNodeStack s = new FindMinNodeStack();
        s.push(4);
        s.push(5);
        System.out.println("min = " + s.min());

        s.push(3);
        s.push(1);
        s.push(9);
        System.out.println("min = " + s.min());
    }
}
