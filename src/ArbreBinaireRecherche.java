public class ArbreBinaireRecherche {
    public static void main(String[] args) {
        Node node=new Node();
        //Node n=node.find(8);
        //System.out.println("Find return :"+n);

        Node n1=node.find1(8);
        System.out.println("Find return :"+n1);
    }
}

class Node{
    Node left,rigth;
    int value;

    //Solution 1
    public Node find1(int v){
        Node currentNode = this, leftNode=left, rigthNode=rigth;
        while(currentNode!=null){
            if(v==currentNode.value) return currentNode;
            else if(v<currentNode.value){
                currentNode=currentNode.left;
                leftNode=null==leftNode?null:currentNode.left;
            }else {
                currentNode=currentNode.rigth;
                rigthNode=null==rigthNode?null:currentNode.rigth;
            }
        }
        return null;
    }

    //Solution 2
    public Node find(int v){
        Node current = this;
        while (current != null && current.value !=v){
            current=v<current.value? current.left:current.rigth;
        }
        return current;
    }
}
