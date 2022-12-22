package BinarySearchTree;

public class BSTree {
    Node root;

    public BSTree() {
        this.root = null;
    }



    // INSERTING DATA INTO BINARY SEARCH TREE.
    public boolean insert(int data){
        Node newnode= new Node(data);

        if(newnode==null){
            return false;
        }
        if(root==null){
            root= newnode;
        }
        Node temp=root;

        while(true){
            if(root.getData()==data){
                return false;
            }

            if(data< temp.getData()){
                //in left side
                if(temp.getLeft()==null){
                    temp.setLeft(newnode);
                }
                temp=temp.getLeft();
            }else{
                //in right side
                if(temp.getRight()==null){
                    temp.setRight(newnode);
                }
                temp=temp.getRight();
            }
        }
    }


    // PREORDER

    public void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.println(root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    // POSTEORDER

    public void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getData());
    }


    // INEORDER

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());

    }

    // MAXIMUM OF ELEMENTS
    public void maxElement(){
        if(root==null){
            return;
        }
        if(root.getRight()==null && root.getLeft()==null){
            System.out.println(root);
        }
        Node max=root;
        while(max.getRight()!=null){

            max=max.getRight();
        }
        System.out.println(max.getData());
    }


    //MINIMUM OF ELEMENTS


    public void minElement(){
        if(root==null){
            return;
        }
        if(root.getRight()==null && root.getLeft()==null){
            System.out.println(root);
        }
        Node temp=root;
        while(temp.getLeft()!=null){
            temp=temp.getLeft();
        }
        System.out.println(temp);

    }
}
