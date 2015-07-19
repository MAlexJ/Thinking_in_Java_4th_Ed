package example_01;

public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "N{" +
                "v=" + value +
                ", n=" + next +
                '}';
    }
}
