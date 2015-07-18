package example_06_upcasting_1;

public class Parcel {

    public class PContents implements Contents {
        private int num = 7;

        @Override
        public int value() {
            return this.num;
        }
    }

    public class PDestination implements Destination {
        private String label;

        public PDestination(String str) {
            this.label = str;
        }

        @Override
        public String readLine() {
            return this.label;
        }
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();

        Contents contents = p.new PContents();
        int value = contents.value();
        System.out.println(value);

        Destination destination = p.new PDestination("String");
        String readLine = destination.readLine();
        System.out.println(readLine);
    }
}
