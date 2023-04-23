public class Node
{
    public Object data;
    public Node link;

    public Node(Object dataToAdd){
        data = dataToAdd;
        link = null;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public Node getLink(){
        return link;
    }
    public void setLink(Node link)
    {
        this.link = link;
    }
}