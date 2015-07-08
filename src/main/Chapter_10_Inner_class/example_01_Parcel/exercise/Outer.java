package example_01_Parcel.exercise;

/**
 * Created by Alex on 08.07.2015.
 */
public class Outer {
    class Inner {
        public Inner() {
            System.out.println(getClass().getSimpleName());
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.inner();

    }

}
