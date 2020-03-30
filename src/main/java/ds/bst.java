package ds;


// Reference: https://www.techiedelight.com/binary-search-tree-bst-interview-questions/
// Worst case time complexity for all operations (search, insert, delete) on BST is O(h) where h is the height of the tree as in worst case we will have to traverse through all the levels of tree
// https://www.geeksforgeeks.org/complexity-different-opWorst%20case%20time%20complexity%20for%20all%20operations%20(search,%20insert,%20delete)%20on%20BST%20is%20O(h)%20where%20h%20is%20the%20height%20of%20the%20tree%20as%20in%20worst%20case%20we%20will%20have%20to%20traverse%20through%20all%20the%20levels%20of%20treerations-binary-tree-binary-search-tree-avl-tree/

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

    public static Node insertRecur(Node root, int key){
        if(root == null)
            return new Node(key);

        if(key < root.data)
            root.left = insertRecur(root.left, key);
        /**
         * "root.left" is passed as root so that new Node is created & calls are recursively called to the point root.left is null
         * "root.left" is assigned so that the actual updation is done
         * Same holds good for "root.right" as well
         **/

        if(key > root.data)
            root.right = insertRecur(root.right, key);

        return root;

    }

    public static Node insertIterative(Node root, int key){
        Node curr = root;
        Node parent = null;

        if(root == null)
            return new Node(key);

        while (curr != null){

            parent = curr;

            if(key < curr.data)
                curr = curr.left;
            else
                curr = curr.right;
        }

        if( key < parent.data)
            parent.left = new Node(key);
        else if (key > parent.data)
            parent.right = new Node(key);

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

        Node rootRecur = null;
        int[] keys = {2,98,34,31,67};
        for(int key: keys){
            rootRecur = insertRecur(rootRecur, key);
        }
        System.out.println("In order traversal for insertion via recursion");
        inOrderTraversal(rootRecur);

        Node rootIter = null;
        for(int key: keys){
            rootIter = insertIterative(rootIter, key);
        }
        System.out.println("In order traversal for insertion via iteration");
        inOrderTraversal(rootIter);

    }
}
