package com.ds.graphs;

public class DFSGraphDemo {

	public static void main(String[] args) {
		DFSGraph myGraph = new DFSGraph(6);
		myGraph.addGraphnode(0, 2);
		myGraph.addGraphnode(0, 1);
		myGraph.addGraphnode(1, 4);
		myGraph.addGraphnode(1, 0);
		myGraph.addGraphnode(4, 3);
		myGraph.addGraphnode(4, 1);
		myGraph.addGraphnode(3, 5);
		myGraph.addGraphnode(3, 4);
		myGraph.addGraphnode(2, 5);
		myGraph.addGraphnode(2, 0);
		myGraph.addGraphnode(5, 3);
		myGraph.addGraphnode(5, 2);
		myGraph.exploreDFSGraph(0);
	}
}
