package example_09_Enum_02;

/**
 * Created by Alex on 21.05.2015.
 */
public class EnumOrder {

    public static void main(String[] args) {

        for (Spiciness s : Spiciness.values()) {

            System.out.println(s + "  " + s.ordinal());
        }
    }

}
