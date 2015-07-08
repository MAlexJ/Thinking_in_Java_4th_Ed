package example_01_Parcel;

/**
 * Created by Alex on 08.07.2015.
 */
public class Parcel_1 {
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

        private String readLabel() {
            return this.label;
        }
    }

    public void ship(String str) {
        Contents c = new Contents();
        System.out.println(c.value());
        Destination d = new Destination(str);
        System.out.println(d.readLabel());

    }


    public static void main(String[] args) {
        Parcel_1 p = new Parcel_1();
        p.ship("Tasmania");
    }

}
