package taquin.vue.swing;
import javax.swing.JButton;
import javax.swing.JPanel;


public class VueSwing extends JPanel{
    
    JPanel p = new JPanel();

    public void init() {
        JButton b1, b2, b3, b4, b5, b6, b7, b8, bVide, bStart;
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        bVide = new JButton("");
        bStart = new JButton("Start");

        b1.add(p);
        b2.add(p);
        b3.add(p);
        b4.add(p);
        b5.add(p);
        b6.add(p);
        b7.add(p);
        b8.add(p);
        bVide.add(p);
        bStart.add(p);
    }

}
