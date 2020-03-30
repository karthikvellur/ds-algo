package ds;


class Node{
    int data;

    Node left, right;
    Node(int key){
        data = key;
        left = null;
        right = null;
    }
}

public class bst {

    public static Node insert(Node root, int key){
        if(root == null)
            return new Node(key);

        if(key < root.data)
            root.left = insert(root.left, key);
        /**
         * "root.left" is passed as root so that new Node is created & calls are recursively called to the point root.left is null
         * "root.left" is assigned so that the actual updation is done
         * Same holds good for "root.right" as well
         **/

        if(key > root.data)
            root.right = insert(root.right, key);

        return root;

    }

    public static void inOrderTraversal(Node root){
        if(root == null)
            return;

        inOrderTraversal(root.left);
        System.out.println(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args){

        Node root = null;
        int[] keys = {2,98,34,31,67};

        for(int key: keys){
            root = insert(root, key);
        }

        inOrderTraversal(root);

    }
}
