package image;


import javafx.scene.paint.Color;
import java.util.List;
import java.util.Arrays;

public class PaletteRasterImage implements Image {
    int height;
    int width;
    List<Color> palette;
    int[][] pixels;

    public PaletteRasterImage(Color color, int width, int height){
        this.height = height;
        this.width = width;

    }
}