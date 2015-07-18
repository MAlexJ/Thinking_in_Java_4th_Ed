package example_06_upcasting_2;

public class TestMain {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();

        Destination destination = parcel.new PDestination("label");
        String line = destination.readLine();
        System.out.println(line);

        // Error -> Contents contents = parcel.new ......
        Contents contents = parcel.contents();
        int value = contents.value();
        System.out.println(value);
    }
}