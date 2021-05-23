package binarytree;
/**
 * 
 */
public class BinaryTreeNode<T> {

    public T value;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T val) {
        value = val;
        left = null;
        right = null;
    }

    

}