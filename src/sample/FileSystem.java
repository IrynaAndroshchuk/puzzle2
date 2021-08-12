package sample;

import java.awt.image.BufferedImage;
import java.io.InputStream;

public class FileSystem {
    BufferedImage image = null;

    public InputStream readFile() {
        return getClass().getResourceAsStream("../website.jpg");
    }
}
