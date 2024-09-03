package view;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Vi du JFrame aka hoamz");//khoi tao JFrame
        jFrame.setSize(600,400);//ngang 600 ,cao 400

        //gan vi tri hien thi
        jFrame.setLocation(200,200);//toa do cua cua so khi in ra
        //cach de tat chuong trinh hoan toan khi tat cua so
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //cho phep hien thi
        jFrame.setVisible(true);
    }
}
