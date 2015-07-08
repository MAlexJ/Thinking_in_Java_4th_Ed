package example_02_Sequence;

/**
 * Created by Alex on 08.07.2015.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        this.items = new Object[size];
    }

    public void add(Object item) {
        if (items.length > next)
            items[next++] = item;
    }


    public static void main(String[] args) {
        //Filling an array
        Sequence sequence = new Sequence(5);
        for (int i = 1; i < 20; i++) {
            sequence.add(Integer.valueOf(i));
        }

        Selector s = sequence.select();
        while (s.end()) {
            System.out.print(" " + s.current());
            s.next();
        }

    }

    private class SelectSequence implements Selector {
        private int count = 0;

        @Override
        public boolean end() {
            return count < items.length;
        }

        @Override
        public Object current() {
            return items[count];
        }

        @Override
        public void next() {
         if(count<items.length)
            count++;
        }
    }

    public Selector select() {
        return new SelectSequence();
    }

}
