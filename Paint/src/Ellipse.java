import java.awt.*;
public class Ellipse extends Figure {
    public Ellipse(int px, int py, Color c) {
        super(c, new Point(px, py));
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.height = heightBB;
        this.width = widthBB;
    }

    @Override
    public void draw(Graphics g) {
    }
}