package binarytree;

/**
 * 
 * 
 */
public class BinaryTree {

    BinaryTreeNode<Integer> tree = null;

    public void insert(int val) {
        add(tree,val);
    }
    
    public void add(BinaryTreeNode<Integer> node, int val) {
        if(node == null)  {
            node = new BinaryTreeNode<Integer>(val);
        } else {
            if(node.left.value <= val) {
                add(node.left,val);
            } else {
                add(node.right,val);
            }
        }

    }

    /* Depth first search */
    public void display() {

    }

    public static void main(String[] args) {
        
    }



    
}
