package algo.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.logging.Logger;
public class BreadthFirstSearch {
	private static final Logger LOGGER = Logger.getLogger(BreadthFirstSearch.class.getName());																	getLogger(BreadthFirstSearch.class.getName());
	static public void bfs(Node s){
		if(s == null)
			return ;
		Set<Node> setForVisit = new HashSet<Node>();
		Queue q = new LinkedList();
		LOGGER.info("Logger Name: "+LOGGER.getName());
		q.add(s);
		setForVisit.add(s);
		while(!q.isEmpty()){
			Node cur = (Node)q.remove();
			LOGGER.info("cur: "+cur.data);
			Node child;
			if(cur.neighbors == null)
				continue;
			for(Node neighbor : (List<Node>)cur.neighbors){
				if(!setForVisit.contains(neighbor)){
					q.add(neighbor);
					setForVisit.add(neighbor);
				}
			}
		}
	}

	public static class Node<Type>{
		public List<Node> neighbors = null;
		public Type data; 
		public Node(Type data){
			this.data = data;
		}
		public void setNeighbors(List neighbors){
			this.neighbors = new ArrayList(neighbors);
		}
	}
	
	static public void main(String[] args){
		Node<Integer> node1 = new Node(1);
		Node<Integer> node2 = new Node(2);
		Node<Integer> node3 = new Node(3);
		Node<Integer> node4= new Node(4);
		Node<Integer> node5 = new Node(5);
		Node<Integer> node6 = new Node(6);
		Node<Integer> node7= new Node(7);
		List<Node> neighbor1 = new ArrayList<Node> ();
		neighbor1.add(node1);
		neighbor1.add(node6);
		neighbor1.add(node2);
		node7.setNeighbors(neighbor1);
		neighbor1.clear();
		neighbor1.add(node1);
		neighbor1.add(node2);
		node3.setNeighbors(neighbor1);
		neighbor1.clear();
		neighbor1.add(node5);
		neighbor1.add(node4);
		neighbor1.add(node3);
		neighbor1.add(node7);
		node1.setNeighbors(neighbor1);
		neighbor1.clear();
		neighbor1.add(node5);
		neighbor1.add(node7);
		node6.setNeighbors(neighbor1);
		neighbor1.clear();
		neighbor1.add(node1);
		node4.setNeighbors(neighbor1);
		neighbor1.clear();
		neighbor1.add(node7);
		neighbor1.add(node3);
		node2.setNeighbors(neighbor1);
		neighbor1.clear();
		neighbor1.add(node1);
		neighbor1.add(node6);
		node5.setNeighbors(neighbor1);
		bfs(node5);
	}
}
