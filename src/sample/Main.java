package sample;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main extends Application {

    double d = 5.5f;
    int a, b, c, d = 0;
    int x, y = 0;
    double imageX1, imageX2, imageX3, imageX4, imageX5, imageX6, imageX7, imageX8, imageX9, imageX10, imageX11, imageX12, imageX13, imageX14, imageX15, imageX16;
    double imageY1, imageY2, imageY3, imageY4, imageY5, imageY6, imageY7, imageY8, imageY9, imageY10, imageY11, imageY12, imageY13, imageY14, imageY15, imageY16;
    Label label;
    boolean flag = true;

    @Override
    public void start(Stage stage) throws Exception {
        FileSystem fileSystem = new FileSystem();
        InputStream stream = fileSystem.readFile();

        Image image = new Image(stream);
        //Creating the image view
        ImageView imageView = new ImageView();
        //Setting image to the image view
        imageView.setImage(image);
        //Setting the image view parameters
        imageView.setX(10);
        imageView.setY(10);
        imageView.setFitWidth(575);
        imageView.setPreserveRatio(true);
        //Setting the Scene object
        Group root = new Group(imageView);
        Scene scene = new Scene(root, 595, 370);
        stage.setTitle("Puzzle game");
        stage.setResizable(false);

        Image image1 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped0"));
        Image image2 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped1"));
        Image image3 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped2"));
        Image image4 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped3"));
        Image image5 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped4"));
        Image image6 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped5"));
        Image image7 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped6"));
        Image image8 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped7"));
        Image image9 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped8"));
        Image image10 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped9"));
        Image image11 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped10"));
        Image image12 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped11"));
        Image image13 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped12"));
        Image image14 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped13"));
        Image image15 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped14"));
        Image image16 = new Image(new FileInputStream("C:\\Users\\User\\Desktop\\puzzle2\\resources\\cropped\\cropped15"));

        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);
        ImageView imageView5 = new ImageView(image5);
        ImageView imageView6 = new ImageView(image6);
        ImageView imageView7 = new ImageView(image7);
        ImageView imageView8 = new ImageView(image8);
        ImageView imageView9 = new ImageView(image9);
        ImageView imageView10 = new ImageView(image10);
        ImageView imageView11 = new ImageView(image11);
        ImageView imageView12 = new ImageView(image12);
        ImageView imageView13 = new ImageView(image13);
        ImageView imageView14 = new ImageView(image14);
        ImageView imageView15 = new ImageView(image15);
        ImageView imageView16 = new ImageView(image16);

        int img1X1 = 1000;
        int img1Y1 = 500;
        int img2X2 = 750;
        int img2Y2 = 500;
        int img3X3 = 500;
        int img3Y3 = 500;
        int img4X4 = 250;
        int img4Y4 = 500;
        int img5X5 = 1000;
        int img5Y5 = 375;
        int img6X6 = 750;
        int img6Y6 = 375;
        int img7X7 = 500;
        int img7Y7 = 375;
        int img8X8 = 250;
        int img8Y8 = 375;
        int img9X9 = 1000;
        int img9Y9 = 250;
        int img10X10 = 750;
        int img10Y10 = 250;
        int img11X11 = 500;
        int img11Y11 = 250;
        int img12X12 = 250;
        int img12Y12 = 250;
        int img13X13 = 1000;
        int img13Y13 = 125;
        int img14X14 = 750;
        int img14Y14 = 125;
        int img15X15 = 500;
        int img15Y15 = 125;
        int img16X16 = 250;
        int img16Y16 = 125;

        root.getChildren().addAll(imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16);
        stage.setScene(scene);
        stage.show();
        Puzzle puzzle = new Puzzle(1000, 500);
        puzzle.addRect();

        imageView1.setX(img1X1);
        imageView2.setX(img2X2);
        imageView3.setX(img3X3);
        imageView4.setX(img4X4);
        imageView5.setX(img5X5);
        imageView6.setX(img6X6);
        imageView7.setX(img7X7);
        imageView8.setX(img8X8);
        imageView9.setX(img9X9);
        imageView10.setX(img10X10);
        imageView11.setX(img11X11);
        imageView12.setX(img12X12);
        imageView13.setX(img13X13);
        imageView14.setX(img14X14);
        imageView15.setX(img15X15);
        imageView16.setX(img16X16);

        imageView1.setX(img1Y1);
        imageView1.setX(img2Y2);
        imageView1.setX(img3Y3);
        imageView1.setX(img4Y4);
        imageView1.setX(img5Y5);
        imageView1.setX(img6Y6);
        imageView1.setX(img7Y7);
        imageView1.setX(img8Y8);
        imageView1.setX(img9Y9);
        imageView1.setX(img10Y10);
        imageView1.setX(img11Y11);
        imageView1.setX(img12Y12);
        imageView1.setX(img13Y13);
        imageView1.setX(img14Y14);
        imageView1.setX(img15Y15);
        imageView1.setX(img16Y16);

        imageView1.setCursor(Cursor.HAND);
        imageView2.setCursor(Cursor.HAND);
        imageView3.setCursor(Cursor.HAND);
        imageView4.setCursor(Cursor.HAND);
        imageView5.setCursor(Cursor.HAND);
        imageView6.setCursor(Cursor.HAND);
        imageView7.setCursor(Cursor.HAND);
        imageView8.setCursor(Cursor.HAND);
        imageView9.setCursor(Cursor.HAND);
        imageView10.setCursor(Cursor.HAND);
        imageView11.setCursor(Cursor.HAND);
        imageView12.setCursor(Cursor.HAND);
        imageView13.setCursor(Cursor.HAND);
        imageView14.setCursor(Cursor.HAND);
        imageView15.setCursor(Cursor.HAND);
        imageView16.setCursor(Cursor.HAND);

        imageView1.setOnMouseClicked((MouseEvent e) -> {
            a = 1;
            imageX1 = imageView1.getTranslateX() + img1X1;
            imageY1 = imageView1.getTranslateX() + img1Y1;
            if (a == 1 && b == 2 && flag) {
                imageView1.setX(imageX2);
                imageView2.setX(imageX1);
                imageView1.setY(imageY2);
                imageView2.setY(imageY1);
                x = img1X1;
                img1X1 = img2X2;
                img2X2 = x;
                y = img1Y1;
                img1Y1 = img2Y2;
                img2Y2 = y;
                a = 0;
                b = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
            if (a == 1 && c == 3 && flag) {
                imageView1.setX(imageY3);
                imageView3.setX(imageY1);
                imageView1.setY(imageY3);
                imageView3.setY(imageY1);
                x = img1X1;
                img1X1 = img3X3;
                img3X3 = x;
                y = img1Y1;
                img1Y1 = img3Y3;
                a = 0;
                c = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
            if (a == 1 && d == 4 && flag) {
                imageView1.setX(imageX4);
                imageView4.setX(imageX1);
                imageView1.setY(imageY4);
                imageView4.setY(imageY1);
                x = img1X1;
                img1X1 = img4X4;
                img4X4 = x;
                y = img1Y1;
                img1Y1 = img4Y4;
                img4Y4 = y;
                a = 0;
                d = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
        });
        imageView2.setOnMouseClicked((MouseEvent e) -> {
            b = 2;
            imageX2 = imageView2.getTranslateX() + img2X2;
            imageY2 = imageView2.getTranslateY() + img2Y2;
            if (a == 1 && b == 2 && flag) {
                imageView1.setX(imageX2);
                imageView2.setX(imageX1);
                imageView1.setY(imageY2);
                imageView1.setY(imageY2);
                x = img1X1;
                img1X1 = img2X2;
                img2X2 = x;
                y = img1Y1;
                img1Y1 = img2Y2;
                img2Y2 = y;
                b = 0;
                a = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
            if (b == 2 && c == 3 && flag) {
                imageView3.setX(imageX2);
                imageView2.setX(imageX3);
                imageView3.setY(imageY2);
                imageView2.setY(imageY3);
                x = img3X3;
                img3X3 = img2X2;
                img2X2 = x;
                y = img3Y3;
                img3Y3 = img2Y2;
                img2Y2 = y;
                b = 0;
                c = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
            if (b = 2 && d == 4 && flag) {
                imageView2.setX(imageX4);
                imageView4.setX(imageX2);
                imageView2.setY(imageY4);
                imageView4.setY(imageY2);
                x = img2X2;
                img2X2 = img4X4;
                img4X4 = x;
                y = img2Y2;
                img2Y2 = img4Y4;
                img4Y4 = y;
                b = 0;
                d = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
        });
        imageView3.setOnMouseClicked((MouseEvent e) -> {
            c = 3;
            imageX3 = imageView3.getTranslateX() + img3X3;
            imageY3 = imageView3.getTranslateY() + img3Y3;
            if (a == 1 && c == 3 && flag) {
                imageView1.setX(imageX3);
                imageView3.setX(imageX1);
                imageView1.setY(imageY3);
                imageView3.setY(imageY1);
                x = img1X1;
                img1X1 = img3X3;
                img3X3 = x;
                y = img1Y1;
                img1Y1 = img3Y3;
                img3Y3 = y;
                a = 0;
                c = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
            if (b == 2 && c == 3 && flag) {
                imageView2.setX(imageX3);
                imageView3.setX(imageX1);
                imageView2.setY(imageY3);
                imageView3.setY(imageY2);
                x = img2X2;
                img2X2 = img3X3;
                img3X3 = x;
                y = img2Y2;
                img2Y2 = img3Y3;
                img3Y3 = y;
                b = 0;
                c = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
            if (c == 4 && d == 4 && flag) {
                imageView3.setX(imageX4);
                imageView4.setX(imageX3);
                imageView3.setY(imageY4);
                imageView4.setY(imageY3);
                x = img3X3;
                img3X3 = img4X4;
                img4X4 = x;
                y = img3Y3;
                img3Y3 = img4Y4;
                img4Y4 = y;
                c = 0;
                d = 0;
                x = 0;
                y = 0;
                if (img1X1 = 250 && img1Y1 = 125 && img2X2 = 500 && img2Y2 = 125 && img3X3 = 750 && img3Y3 = 125 && img4X4 = 1000 && img4Y4 = 125 && img5X5 = 250 && img5Y5 = 250 && img6X6 = 500 && img6Y6 = 250 && img7X7 = 750 && img7Y7 = 250 && img8X8 = 1000 && img8Y8 = 250 && img9X9 = 250 && img9Y9 = 375 && img10X10 = 500 && img10Y10 = 375 && img11X11 = 750 && img11Y11 = 375 && img12X12 = 1000 && img12Y12 = 375 && img13X13 = 250 && img13Y13 = 500 && img14X14 = 500 && img14Y14 = 500 && img15X15 = 750 && img15Y15 = 500 && img16X16 = 1000 && img16Y16 = 500) {
                    label = new Label("Let's do it");
                    root.getChildren().add(label);
                    label.setFont(new Font("Arial", 30));
                    label.setTranslateX(40);
                    label.setTranslateY(400);
                    flag = false;
                }
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
