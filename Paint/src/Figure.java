import java.awt.*;

public abstract class Figure {
    protected Color color;
    protected Point origin;
    protected int height;
    protected int width;

    public Figure(Color color, Point origin) {
        this.color = color;
        this.origin = origin;
    }

    public Color getColor() {
        return color;
    }

    public Point getOrigin() {
        return origin;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void draw(Graphics g);

    @Override
    public String toString() {
        return "Figure{" +
                "color=" + color +
                ", origin=" + origin +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
