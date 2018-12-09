package image;

import javafx.scene.paint.Color;

public abstract class RasterImage implements Image{
    int height;
    int width;

    public RasterImage(int width, int height){
        this.height = height;
        this.width = width;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public abstract Color getPixelColor(int x, int y);

}
