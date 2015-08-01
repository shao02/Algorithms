package algo.tree.rbTree;

public class Node<Key extends Comparable<Key>,Value> {
  public Key key;
  private Value val;
  public Node left;
  public Node right;
  //parent color;
  public boolean color;
  public int N;
  
  public Node(Key key, Value val, boolean color,int N){
	  this.key = key;
	  this.val = val;
	  this.color = color;
	  this.N = N;
  }
}
