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

    public PaletteRasterImage(Color[][] pixels){

    }

    public void createRepresentation(){

    }

    @Override
    public Color getPixelColor(int x, int y) {
        return null;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPixelColor(Color color, int x, int y){

    }
}