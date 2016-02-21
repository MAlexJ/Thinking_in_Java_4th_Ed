package example_02;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by Alex on 21/02/2016.
 */

public class DirFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return false;
    }
}
