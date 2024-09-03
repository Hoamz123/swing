package createLayout;

import javax.swing.*;
import java.awt.*;

public class GirdLayout extends JFrame{

        //constructor
        public GirdLayout()
        {
            this.setTitle("aka hoamz");
            this.setSize(500,300);//kich co
            this.setLocationRelativeTo(null);//xuat ra chinh giua
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //set layout
            GridLayout gridLayout = new GridLayout();
            GridLayout gridLayout1 = new GridLayout(3,3);//4 hang 4 cot
            GridLayout gridLayout2 = new GridLayout(4,4,25,25);
            this.setLayout(gridLayout1);
            for(int i=1;i<10;i++){
                JButton jButton = new JButton(i + "");// int  + "" -> thanh String
                //add nut vao
                this.add(jButton);
            }

            this.setVisible(true);//in ra man hinh
        }

        public static void main(String[] args) {
            GirdLayout h = new GirdLayout();
        }

}

