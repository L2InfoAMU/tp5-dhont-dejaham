package image;

import javafx.scene.paint.*;
import util.Matrices;

import java.util.Objects;

public class BruteRasterImage implements Image {
    private int width;
    private int height;
    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        this.height = height;
        this.width = width;
        this.pixels = new Color[width][height];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
              pixels[i][j] = color;
            }
        }

    }

    public BruteRasterImage(Color[][] colors){
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresNonNull(colors);
        Matrices.requiresRectangularMatrix(colors);

        this.width = colors.length;
        this.height = colors[0].length;
        this.pixels = colors.clone();
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void createRepresentation(){
        Color[][] representation = pixels.clone();
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y] = color;
    }

    private void setPixelsColor(Color[][] pixels){
        this.pixels = pixels.clone();
    }

    protected void setWidth(int width){
        this.width = width;
    }

    protected void setHeight(int height){
        this.height = height;
    }
}
