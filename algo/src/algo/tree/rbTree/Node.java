package algo.tree.rbTree;

public class Node<Key extends Comparable<Key>,Value> {
  private Key key;
  private Value val;
  private Node left;
  private Node right;
  //parent color;
  private boolean color;
  private int N;
  
  public Node(Key key, Value val, boolean color,int N){
	  this.key = key;
	  this.val = val;
	  this.color = color;
	  this.N = N;
  }
}
