import java.awt.*;

public class Square extends Figure {
    public Square(int px, int py, Color c) {
        super(c, new Point(px, py));
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        int max = Math.max(heightBB, widthBB);
        this.height = max;
        this.width = max;
    }

    @Override
    public void draw(Graphics g) {
        // Leave empty for now
    }
}

