import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener {

    private  Drawing myDraw=new Drawing();
    public Graphics g1;
    public MyFrame(String Title,int x,int y) {
    super(Title);
    this.setSize(x,y);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPanel = this.getContentPane();

    JMenuBar m= new JMenuBar();

    JMenu menu1= new JMenu("File");
    JMenuItem New = new JMenuItem("New");
    JMenuItem open = new JMenuItem("Open");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem quit = new JMenuItem("Quit");
    menu1.add(New);
    menu1.add(open);
    menu1.add(save);
    menu1.add(quit);
    m.add(menu1);


    JButton Ellipse= new JButton("Ellipse");
    contentPanel.add(Ellipse);
    Ellipse.addActionListener(this);

    JButton Cercle= new JButton("Cercle");
    contentPanel.add(Cercle);
    Cercle.addActionListener(this);

    JButton Rectangle= new JButton("Rectangle");
    contentPanel.add(Rectangle);
    Rectangle.addActionListener(this);

    JButton Carre= new JButton("Carre");
    contentPanel.add(Carre);
    Carre.addActionListener(this);

    JButton blackButton = new JButton("noir");
    blackButton.setBackground(Color.BLACK);

    JButton redButton = new JButton("rouge");
    redButton.setBackground(Color.RED);

    JButton greenButton = new JButton("vert");
    greenButton.setBackground(Color.GREEN);

    JButton blueButton = new JButton("bleu");
    blueButton.setBackground(Color.BLUE);

    JButton yellowButton = new JButton("jaune");
    yellowButton.setBackground(Color.YELLOW);

    JButton magentaButton = new JButton("violet");
    magentaButton.setBackground(Color.MAGENTA);

    JButton pinkButton = new JButton("rose");
    pinkButton.setBackground(Color.PINK);

    JButton orangeButton = new JButton("orange");
    orangeButton.setBackground(Color.ORANGE);

    JPanel buttonPanel = new JPanel(new FlowLayout(140, 0, 0));
    buttonPanel.add(m);
    buttonPanel.add(blackButton);
    buttonPanel.add(redButton);
    buttonPanel.add(greenButton);
    buttonPanel.add(blueButton);
    buttonPanel.add(yellowButton);
    buttonPanel.add(magentaButton);
    buttonPanel.add(pinkButton);
    buttonPanel.add(orangeButton);
    buttonPanel.add(Ellipse);
    buttonPanel.add(Cercle);
    buttonPanel.add(Rectangle);
    buttonPanel.add(Carre);


    contentPanel.add(buttonPanel);

        this.setVisible(true);
    }
        public static void main (String args[]){
            MyFrame win = new MyFrame("Paint it black",600,400);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String cmd=e.getActionCommand();
        switch (cmd)
        {
            case "rouge":
                System.out.println("noir have been clicked !");
                myDraw.setColor(Color.red);
                break;
            case "noir":
                System.out.println("noir have been clicked !");
                myDraw.setColor(Color.black);
                break;
            case "Carre":
                System.out.println("Carre have been clicked !");
                break;
            case "Rectangle":
                System.out.println("Rectangle have been clicked !");
                myDraw.setnomFigure(cmd);
                break;
            case "Cercle":
                System.out.println("Cercle have been clicked !");
                break;
            case "Ellipse":
                System.out.println("Ellipse have been clicked !");
                break;
        }
    }
    /*
    class ClickListener extends MouseAdapter {
        public void MousePressed(MouseEvent e) {
            Rectangle R = new Rectangle(20,20, Color.BLACK);
            origineX = e.getX();
            origineY = e.getY();
        }

        public void MouseReleased(MouseEvent e) {
            int finX = e.getX();
            int finY = e.getY();

            //g.fillRect(origineX, origineY, finX, finY);
        }
     */

    /*
    public class MyFrame extends JPanel implements MouseListener {
        private int x = 0;
        private int y = 0;

        public MyPanel() {
            setPreferredSize(new Dimension(400, 400));
            setBackground(Color.WHITE);
            addMouseListener(this);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(x, y, 20, 20);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

     */
}
