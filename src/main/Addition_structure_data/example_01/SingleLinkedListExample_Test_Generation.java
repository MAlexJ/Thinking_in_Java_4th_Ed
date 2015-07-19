package example_01;

/**
 * Created by Alex on 19.07.2015.
 */
public class SingleLinkedListExample_Test_Generation {
    public static void main(String[] args) {
        Node tail = null;
        for (int i = 0; i < 10; i++) {
            tail = new Node(i, tail);
        }

        System.out.println(tail);
    }
}
