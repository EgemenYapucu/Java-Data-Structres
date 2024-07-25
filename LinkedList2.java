public class LinkedList2{
    private Node root;
    
    public void addNode(Node next){
        if(root.getter_nextNode()==null){
            root.setter_nextNode(next);
        }
        else{
            next.setter_nextNode(root.getter_nextNode());
            root.setter_nextNode(next);
        }
    }
    public LinkedList2(Node next){
        root.setter_value(-1);
        root.setter_nextNode(null);
        addNode(next);
    }
}