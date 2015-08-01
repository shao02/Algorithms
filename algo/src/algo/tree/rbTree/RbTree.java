package algo.tree.rbTree;

public class RbTree<Key extends Comparable<Key>,Value> {
  private static final boolean RED = true;
  private static final boolean BLACK = false;
  private Node root;
  
  private boolean isRed(Node x){
    if(x == null)
    	return false;
    return x.color == RED;
  }
  
  private int size(Node x){
  	if(x == null) 
  		return 0;
  	return x.N;
  }
  
  public int size(){
  	return size(root);
  }
  
  public Value get(Key key){
  	return get(root,key);
  }
  
  private Value get(Node x, Key key){
  	while(x != null){
  		int cmp = key.compareTo((Key)x.key);
  		if (cmp < 0) x = x.left;
  	}
  }
  
}
