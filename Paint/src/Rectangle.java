import java.awt.*;

public class Rectangle extends Figure {
    public Rectangle(int px, int py, Color c) {
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

