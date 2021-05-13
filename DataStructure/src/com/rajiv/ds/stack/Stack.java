package com.rajiv.ds.stack;

public class Stack {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.pop();
		s.pop();
	}
	int arr[] = null;
	int capacity = 2;
	int top =-1;
	
	public Stack() {
		this.arr = new int[capacity];
	}
	
	public Stack(int capacity) {
		this.capacity = capacity;
		 this.arr = new int[capacity];
	}

	public void push(int data) {
		if(isFull()) {
			System.out.println("stack is full cant insert");
			return;
		}
		arr[++top] = data;
		System.out.println(data + "inserted into stack");
		
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		int data = arr[top--];
		System.out.println(data +" removed from stack");
	}
	public boolean isEmpty() {
		return top ==-1;
		
	}
	
	public boolean isFull() {
		return (top+1) ==capacity;
	}
}

