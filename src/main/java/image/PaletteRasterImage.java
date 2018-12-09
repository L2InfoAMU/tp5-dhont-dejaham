package image;


import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PaletteRasterImage implements Image {
    private int height;
    private int width;
    private List<Color> palette;
    private int[][] pixels;

    public PaletteRasterImage(Color color, int width, int height){
        this.height = height;
        this.width = width;
        this.createRepresentation();
        palette.add(color);
    }

    public PaletteRasterImage(Color[][] pixels){
        createRepresentation();
        this.height = pixels[0].length;
        this.width = pixels.length;

        for(int x=0; x< width; x++){
            for(int y=0; y< height; y++){
                if(!palette.contains(pixels[x][y])){
                    palette.add(pixels[x][y]);
                    this.pixels[x][y] = palette.indexOf(pixels[x][y]);
                }
            }
        }
    }

    public void createRepresentation(){
        palette = new ArrayList<>();
        this.pixels = new int[width][height];
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
        if(!palette.contains(color)) {
            palette.add(color);
        }        
        pixels[x][y] = palette.indexOf(color);
    }
}