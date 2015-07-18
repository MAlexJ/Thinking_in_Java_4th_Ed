package example_06_upcasting_2;

public class Parcel {
    private class PContents implements Contents {
        private int num = 7;

        @Override
        public int value() {
            return this.num;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        public PDestination(String str) {
            this.label = str;
        }

        @Override
        public String readLine() {
            return this.label;
        }
    }

    public Contents contents() {
        return new PContents();
    }

    public Destination destination(String str) {
        return new PDestination(str);
    }

}
