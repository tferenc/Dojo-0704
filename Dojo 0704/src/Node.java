import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tamás Ferenc on 2017. 07. 04..
 */
public class Node
{

    int Data;
    Node nextNode;
    Node slow;
    Node fast;
    private List<Node> nodeList = new ArrayList<>();

    public Node(int data)
    {
        Data = data;
        this.nextNode = nextNode;
    }

    public Node next()
    {
        return nextNode;
    }

    public boolean hasloop()
    {
       slow = this;
       fast = this;
            while(fast != null && fast.next() != null) {
                slow = slow.next();
                fast = fast.next().next();

                if (slow == fast) {
                    return true;
                }
            }
        return false;
    }

    public void nodes()
    {
        Node n = this;
        while (n.nextNode!=null){
            nodeList.add(n);
            n = this.next();
        }
        for (Node node : nodeList) {
            System.out.println(node.Data);
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;
        n5.nextNode = n4;

        System.out.println(n5.hasloop());

    }
}
