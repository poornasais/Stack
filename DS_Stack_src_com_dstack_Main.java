package com.dstack;

public class Main {

    public static void main(String[] args) {
	GStack<Integer> stack = new GStack();
	stack.push(10);
	stack.push(11);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
