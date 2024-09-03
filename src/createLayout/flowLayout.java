package createLayout;

import javax.swing.*;
import java.awt.*;

public class flowLayout extends JFrame {

    //constructor
    public flowLayout()
    {
        this.setTitle("aka hoamz");
        this.setSize(500,300);//kich co
        this.setLocationRelativeTo(null);//xuat ra chinh giua
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        //Set layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout2 = new FlowLayout(FlowLayout.CENTER,50,50);//khoang cah giua cac button
        this.setLayout(flowLayout2);
        //tao button
        JButton jButton_1 = new JButton("Boy");
        JButton jButton_2 = new JButton("Girl");
        JButton jButton_3 = new JButton("Gay");

        //add thanh phan
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);


        this.setVisible(true);//in ra man hinh
    }

    public static void main(String[] args) {
        flowLayout vd = new flowLayout();
    }

}
