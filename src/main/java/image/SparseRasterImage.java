package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage {
    Map<Point, Color> pixelsMap;

    public SparseRasterImage(Color color, int width, int height){
        super(width, height);
        createRepresentation();

        for(int x=0; x < width; x++){
            for(int y=0; y < height; y++){
                pixelsMap.put(new Point(x, y), color);
            }
        }
    }

    public SparseRasterImage(Color[][] pixels){
        super(pixels.length, pixels[0].length);
        createRepresentation();

        for(int x=0; x < width; x++){
            for(int y=0; y < height; y++){
                pixelsMap.put(new Point(x, y), pixels[x][y]);
            }
        }

    }

    public void createRepresentation(){
        pixelsMap = new HashMap<>();
    }

    public void setPixelColor(Color color, int x, int y){
        pixelsMap.put(new Point(x,y),color);
    }

    public Color getPixelColor(int x, int y){
        return pixelsMap.getOrDefault(new Point(x,y), Color.WHITE);
    }

    private void setPixelsColor(Color[][] pixels){
        for(int x=0; x < width; x++){
            for(int y=0; y < height; y++){
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    private void setPixelsColor(Color color){
        for(int x=0; x < width; x++){
            for(int y=0; y < height; y++){
                setPixelColor(color, x, y);
            }
        }
    }
}
