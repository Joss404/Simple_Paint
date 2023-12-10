import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseMotionListener, MouseListener{
    public String nomFigure;
    public Color currentColor;
    public Figure currentFigure;
    public ArrayList<Figure> figures;

    static int x,y;


    public void setnomFigure(String nomfigure){
        this.nomFigure=nomfigure;
    }

    public void setColor(Color color){
        this.currentColor=color;
    }

    public Drawing() {
        this.setBackground(Color.white);
        this.currentColor = Color.black;
        this.currentFigure = new Rectangle(0, 0, currentColor);
        this.figures = new ArrayList<>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.white);
        for(Figure f:figures){
            f.draw(g);
            this.repaint();
        }
    }

    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }

    public void setCurrentFigure(Figure figure) {
        this.currentFigure = figure;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();

        switch (nomFigure){
            case "Square" : figures.add(new Square(x,y,currentColor));
                break;
            case "Rectangle" : figures.add(new Rectangle(x,y,currentColor));
                break;
            case "Circle" : figures.add(new Square(x,y,currentColor));
                break;
            case "Ellipse" : figures.add(new Ellipse(x,y,currentColor));
                break;
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        figures.get(figures.size()-1).setBoundingBox(e.getX()-x,e.getY()-y);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e){
        figures.get(figures.size()-1).setBoundingBox(e.getX()-x,e.getY()-y);
        paintComponent(this.getGraphics());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
