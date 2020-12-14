import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
    long value;
    long position;
    Node leftChild;
    Node rightChild;

    Node min(){
        if (this.leftChild == null){
            return this;
        }
        return this.leftChild.min();
    }

    Node findSuccessor(){
        return this.min();
    }
}

class BST {
    Node insert(Node currentNode, long value, int pos){
        if (currentNode == null){
            currentNode = new Node();
            currentNode.value = value;
            currentNode.position = pos;
            System.out.println(pos);
            return currentNode;
        }
        if (value > currentNode.value){
            pos = 2*pos+1;
            currentNode.rightChild = insert(currentNode.rightChild, value, pos);
        } else if (value < currentNode.value) {
            pos = 2*pos;
            currentNode.leftChild = insert(currentNode.leftChild, value, pos);
        }
        return currentNode;
    }

    Node delete(Node currentNode, long value){
        if (value < currentNode.value){
            currentNode.leftChild = delete(currentNode.leftChild, value);
        } else if (value > currentNode.value){
            currentNode.rightChild = delete(currentNode.rightChild, value);
        } else {
            System.out.println(currentNode.position);
            if (currentNode.leftChild == null){
                return currentNode.rightChild;
            } else if (currentNode.rightChild == null){
                return currentNode.leftChild;
            }
            currentNode.value = currentNode.rightChild.findSuccessor().value;
            currentNode.rightChild = delete(currentNode.rightChild, currentNode.value);
        }
        return currentNode;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BST tree = new BST();
        Node root = null;
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0){
            st = new StringTokenizer(br.readLine());
            char o = st.nextToken().charAt(0);
            long x = Long.parseLong(st.nextToken());
            if (o == 'i'){
                root = tree.insert(root, x, 1);
            } else if (o == 'd'){
                root = tree.delete(root, x);
            }
        }
    }
}