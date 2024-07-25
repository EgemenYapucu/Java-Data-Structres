class Node{
    private int value;
    private Node nextNode;

    public void setter_value(int value){ this.value=value;}
    public void setter_nextNode(Node nextNode){ this.nextNode=nextNode;}
    public int getter_value(){ return value;}
    public Node getter_nextNode(){ return nextNode;}

    public Node(int value,Node nextNode){
        setter_nextNode(nextNode);
        setter_value(value);
    }
    public Node(int value){
        setter_value(value);
        nextNode = null;
    }
}