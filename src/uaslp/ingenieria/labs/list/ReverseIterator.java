package uaslp.ingenieria.labs.list;

/**
 * Va a iterar a la lista de atrás para adelante
 */
public class ReverseIterator {

    private Node currentNode;

    public ReverseIterator(Node currentNode){
        this.currentNode=currentNode;
    }

    public boolean hasPrevious(){
        return currentNode!=null;
    }

    public int previous(){
        int data = currentNode.getData();

        currentNode = currentNode.getPrevious();

        return data;
    }

    Node getCurrentNode(){
        return currentNode;
    }
}
