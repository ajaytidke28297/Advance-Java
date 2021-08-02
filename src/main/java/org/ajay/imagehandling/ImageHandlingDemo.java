package org.ajay.imagehandling;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandlingDemo {
    public static void main(String[] args) {
        int width = 963;
        int height = 640;

        BufferedImage bufferedImage = null;

        bufferedImage = readFromFile(width, height, bufferedImage);

        writeToFile(bufferedImage);
    }

    private static BufferedImage readFromFile (int width, int height, BufferedImage bufferedImage) {
        try {
            File file = new File("D:\\Java Projects\\Advance-Java\\sample.png");

            bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            //Reading input file
            bufferedImage = ImageIO.read(file);

            System.out.println("Reading complete. " + bufferedImage);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bufferedImage;
    }

    private static void writeToFile (BufferedImage bufferedImage) {
        try {
            File file = new File("D:\\sample.png");

            ImageIO.write(bufferedImage, "png", file);

            System.out.println("Writing complete ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
