package com.rajiv.ds.queue;

public class Queue {

	int capacity = 2;
	int arr[] = null;
	int front = 0;
	int rear = -1;

	public Queue() {
		this.arr = new int[capacity];
	}

	public Queue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}

	public void enqueue(int data) {
		if (size() == capacity) {
			System.out.println("Queue is full cant insert");
			return;
		}
		rear = rear + 1;
		arr[rear] = data;
		System.out.println(data + " equeueed into Queue");

	}

	public void dequeue() {

		if (front == size()) {
			System.out.println("Queue is empty");
			return;
		}
		int data = arr[front];
		for (int i = front; i < rear; i++) {
			arr[i] = arr[i + 1];
		}
		rear--;
		System.out.println(data + " dequeued from Queue");

	}

	public int size() {
		return rear + 1;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.dequeue();
		q.dequeue();

	}
}
