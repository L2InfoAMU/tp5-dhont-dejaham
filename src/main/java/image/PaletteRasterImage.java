package image;


import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PaletteRasterImage extends RasterImage {
    private List<Color> palette;
    private int[][] pixels;

    public PaletteRasterImage(Color color, int width, int height){
        super(width, height);
        this.createRepresentation();
        palette.add(color);
    }

    public PaletteRasterImage(Color[][] pixels){
        super(pixels.length, pixels[0].length);
        createRepresentation();

        for(int x=0; x< width; x++){
            for(int y=0; y< height; y++){
                if(!palette.contains(pixels[x][y])){
                    palette.add(pixels[x][y]);
                    }
                this.pixels[x][y] = palette.indexOf(pixels[x][y]);
            }
        }
    }

    public void createRepresentation(){
        palette = new ArrayList<>();
        this.pixels = new int[width][height];
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return palette.get(pixels[x][y]);
    }

    public void setPixelColor(Color color, int x, int y){
        if(!palette.contains(color)) {
            palette.add(color);
        }
        pixels[x][y] = palette.indexOf(color);
    }

    public void setPixelsColor(Color[][] pixels){
        for(int x=0; x < pixels.length; x++){
            for(int y=0; y < pixels[0].length; y++){
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    private void setPixelsColor(Color color){
        if(!palette.contains(color))
            palette.add(color);
        for(int[] row: pixels)
            Arrays.fill(row, palette.indexOf(color));
    }
}