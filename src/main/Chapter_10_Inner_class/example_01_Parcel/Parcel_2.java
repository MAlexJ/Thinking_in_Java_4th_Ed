package example_01_Parcel;

/**
 * Created by Alex on 08.07.2015.
 */
public class Parcel_2 {

    class Contents {
        private int i = 11;

        public int value() {
            return this.i;
        }
    }

    class Destination {
        private String label;

        public Destination(String label) {
            this.label = label;
        }

        public String readLabel() {
            return this.label;
        }
    }

    public Contents context() {
        return new Contents();
    }

    public Destination to(String str) {
        return new Destination(str);
    }

    public static void main(String[] args) {
        //Outer class
        Parcel_2 parcel = new Parcel_2();

        //Inner class Contents
        Parcel_2.Contents c = parcel.context();
        System.out.println(c.value());

        //Inner class Destination
        Parcel_2.Destination d = parcel.to("AAA");
        System.out.println(d.readLabel());

    }
}
