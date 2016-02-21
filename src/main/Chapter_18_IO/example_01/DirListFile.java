package example_01;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Alex on 21/02/2016.
 */
public class DirListFile {
    public static void main(String[] args) {
        File file = new File(".");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));
    }
}
