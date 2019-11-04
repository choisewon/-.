import javax.swing.*;
/**
 * クラス MyMouseFrame の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (2019.11.04)
 */
public class MyMouseFrame extends JFrame
 {  
    public JPanel p;
    public JLabel l;
    public MyMouseFrame()
    {
       this.setTitle("MouseListner&MouseMotionListner");
       this.setSize(400,300);
       this.setVisible(true);
       
       p = new JPanel();
       this.add(p);
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void MyPanel()
    {
        l = new JLabel("No Mouse Event");
        this.add(l);
    }
}
