package BaiTapGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Bai1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//tao mot frame
        frame.setTitle("CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);//khong theo layout nao
        frame.setSize(480,300);
        frame.setBackground(Color.CYAN);
        frame.setLocationRelativeTo(null);
        //3 cai nhan
        JLabel lb1 = new JLabel("First Number");
        JLabel lb2 = new JLabel("Second Number");
        JLabel lb3 = new JLabel("Result");
        lb1.setBounds(20,10,100,30);
        lb2.setBounds(20,50,100,30);
        lb3.setBounds(20,90,100,30);

        //3 cai textfield
        TextField text1 = new TextField("");
        TextField text2 = new TextField("");
        TextField text3 = new TextField("");

        text1.setBounds(140,10,200,20);
        text2.setBounds(140,50,200,20);
        text3.setBounds(140,90,200,20);

        //tao button clear
        JButton clear = new JButton("CLEAR");
        clear.setBounds(20,140,80,30);
        //clear.setBackground(Color.WHITE);//dat mau sac
        //set nut add va nut sub va nut mul va nut div
        JButton adD = new JButton("ADD");
        adD.setBounds(20,190,80,30);
        //adD.setBackground(Color.GRAY);
        JButton sub = new JButton("SUB");
        sub.setBounds(120,190,80,30);
        //sub.setBackground(Color.GRAY);
        JButton mul = new JButton("MUL");
        mul.setBounds(220,190,80,30);
        //mul.setBackground(Color.GRAY);
        JButton div = new JButton("DIV");
        div.setBounds(320,190,80,30);
        //div.setBackground(Color.GRAY);


        {
            //them vao frame
            frame.add(lb1);
            frame.add(lb2);
            frame.add(lb3);
            frame.add(text1);
            frame.add(text2);
            frame.add(text3);
            frame.add(clear);
            frame.add(adD);
            frame.add(sub);
            frame.add(mul);
            frame.add(div);
        }

        //thao tac khi an nut
        //thao tac voi nut cong
        adD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //lay ra 2 so o first number  va second number
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                //cong 2 so va in ra text3
                text3.setText(String.valueOf(a +""+ b));
            }
        });


        //thao tac voi nut tru

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //lay ra 2 so o first number  va second number
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                //cong 2 so va in ra text3
                text3.setText(String.valueOf(a-b));
            }
        });

        //thao tac voi nut nhan
        mul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //lay ra 2 so o first number  va second number
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                //cong 2 so va in ra text3
                text3.setText(String.valueOf(a*b));
            }
        });

        //thao tac voi nut chia
        div.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //lay ra 2 so o first number  va second number
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                //cong 2 so va in ra text3
                text3.setText(String.valueOf((float)a/b));
            }
        });

        //thao tac voi nut clear
        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");//xoa du lieu o textField 1
                text2.setText("");//xoa du lieu o textField 2
                text3.setText("");//xoa du lieu o textField 3
            }
        });
        frame.setVisible(true);//in ra man hinh khi chay
    }
}
