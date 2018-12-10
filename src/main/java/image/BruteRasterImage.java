package image;

import javafx.scene.paint.*;
import util.Matrices;

import java.util.Arrays;
import java.util.Objects;

public class BruteRasterImage extends RasterImage {
    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        super(width, height);
        createRepresentation();
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
              pixels[i][j] = color;
            }
        }

    }

    public BruteRasterImage(Color[][] colors){
        super(colors.length, colors[0].length);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresNonNull(colors);
        Matrices.requiresRectangularMatrix(colors);

        this.pixels = colors.clone();
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return pixels[x][y];
    }

    public void createRepresentation(){
        this.pixels = new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[x][y] = color;
    }

    private void setPixelsColor(Color[][] pixels){
        this.pixels = pixels.clone();
    }

    private void setPixelsColor(Color color){
        for(Color[] row: pixels)
            Arrays.fill(row, color);
    }

}
