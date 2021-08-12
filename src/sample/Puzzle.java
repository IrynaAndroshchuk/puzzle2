package sample;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Puzzle {
    int pictWidth;
    int pictHeight;
    int rectNumbers = 16;
    int a = (int) Math.sqrt(rectNumbers);
    int rectWidth;
    int rectHeight;
    List<Rectangle> rectangles = new ArrayList<>();

    public Puzzle(int pictWidth, int pictHeight) {
        this.pictWidth = pictWidth;
        this.pictHeight = pictHeight;

        this.rectWidth = pictWidth / a;
        this.rectHeight = pictHeight / a;
    }

    public void addRect() throws IOException {
        for (int i = 0; i < rectNumbers; i++) {
            int dWidth = (i - (int)(i / a) * a) * rectWidth;
            int dHeight = i / a * rectHeight;

            rectangles.add(new Rectangle(i, rectWidth, rectHeight, dWidth, dHeight));
        }
        for (int i = 0; i < rectNumbers; i++) {
            cropImage(rectangles.get(i));
        }
    }
    private void cropImage(Rectangle rectangle) throws IOException {

        FileSystem fileSystem = new FileSystem();
        BufferedImage imBuff = ImageIO.read(fileSystem.readFile());

        BufferedImage dest = imBuff.getSubimage(rectangle.dWidth, rectangle.dHeight, rectangle.width, rectangle.height);
        ImageIO.write(dest, "JPG", new FileOutputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped"+rectangle.n+".jpg"));
    }
}
