package binarytree;

/**
 * 
 * 
 */
public class BinaryTree {

    BinaryTreeNode<Integer> tree = null;

    public void insert(int val) {
        tree = add(tree,val);
    }
    
    public BinaryTreeNode<Integer> add(BinaryTreeNode<Integer> node, int val) {
        if(node == null)  {
            node = new BinaryTreeNode<Integer>(val);
        } else {
            if(node.value <= val) {
                node.left = add(node.left,val);
            } else {
                node.right = add(node.right,val);
            }
        }
        return node;

    }

    /* Depth first search */
    public void display(BinaryTreeNode<Integer> tmp) {
       
        if(tmp != null) {
           
            if(tmp.left != null) {
                display(tmp.left);
            }
            System.out.println(tmp.value);
            if(tmp.right != null) {
                display(tmp.right);
            }
        }

    }

    public static void main(String[] args) {

        BinaryTree bTree = new BinaryTree();
        bTree.insert(40);
        bTree.insert(30);
        bTree.insert(50);
        bTree.insert(5);

        bTree.display(bTree.tree);

        
    }



    
}
