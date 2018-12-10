package image;

import javafx.scene.paint.Color;

public class Rectangle implements Shape {
    private int x,y,width,height;
    private Color color;
    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public boolean contains(Point point) {
        return this.x<point.x && point.x<=this.x+width && this.y < point.y && point.y <= this.y +height;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
