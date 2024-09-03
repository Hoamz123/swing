package createLayout;

import javax.swing.*;
import java.awt.*;

public class borderLayout extends JFrame {
    public borderLayout(){
        this.setTitle("aka hoamz");
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //set layout
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout1 =  new BorderLayout(50,50);
        this.setLayout(borderLayout1);
        //do borderLayout co 5 phan
        JButton jButton = new JButton("1");
        JButton jButton1 = new JButton("2");
        JButton jButton2 = new JButton("3");
        JButton jButton3 = new JButton("4");
        JButton jButton4 = new JButton("5");
        //add button
        this.add(jButton,BorderLayout.NORTH);
        this.add(jButton1,BorderLayout.SOUTH);
        this.add(jButton2,BorderLayout.CENTER);
        this.add(jButton3,BorderLayout.EAST);
        this.add(jButton4,BorderLayout.WEST);

        this.setVisible((true));//phuong thu de display
    }

    public static void main(String[] args) {
        borderLayout b = new borderLayout();
    }
}
