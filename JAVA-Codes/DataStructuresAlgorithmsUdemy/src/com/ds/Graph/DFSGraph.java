package com.ds.Graph;

import java.util.Stack;

public class DFSGraph {

	int size;
	AdjList[] myArray;

	public DFSGraph(int size) {
		this.size = size;
		this.myArray = new AdjList[this.size];
		for (int i = 0; i < this.size; i++) {
			this.myArray[i] = new AdjList();
			this.myArray[i].head = null;
		}
	}

	public void addGraphnode(int source, int destination) {
		GraphNode newNode = new GraphNode(destination, null);
		newNode.next = this.myArray[source].head;
		this.myArray[source].head = newNode;
	}

	public void exploreDFSGraph(int startVertex) {
		boolean[] isVisited = new boolean[this.size];
		for (int i = 0; i < this.size; i++) {
			isVisited[i] = false;
		}
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(startVertex);
		while (!myStack.isEmpty()) {
			int tempNode = myStack.pop();
			myStack.push(tempNode);
			isVisited[tempNode] = true;
			GraphNode tempHead = this.myArray[tempNode].head;
			boolean isDone = true;
			while (tempHead != null) {
				if (isVisited[tempHead.value] == false) {
					myStack.push(tempHead.value);
					isVisited[tempHead.value] = true;
					isDone = false;
					break;
				} else {
					tempHead = tempHead.next;
				}
			}
			if (isDone) {
				int outputNode = myStack.pop();
				System.out.println("Visited Node: " + outputNode);
			}
		}
	}
}
