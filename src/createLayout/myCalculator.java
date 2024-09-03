package createLayout;

import javax.swing.*;
import java.awt.*;

public class myCalculator extends JFrame {
    public myCalculator(){
        this.setTitle("aka hoamz");
        this.setSize(300,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField(50);//cho phep nhap van ban
        // chua gom cac thanh phan lai
        JPanel jPanel = new JPanel();//khoi tao 1 JPanel
        jPanel.setLayout(new BorderLayout());
        //nut nhap
        jPanel.add(jTextField,BorderLayout.CENTER);

        //tao font chu
        Font font = new Font("Arial",Font.BOLD,40);
        //tao nut
        JButton jButton = new JButton("0");
        jButton.setFont(font);
        JButton jButton1 = new JButton("1");
        jButton1.setFont(font);
        JButton jButton2 = new JButton("2");
        jButton2.setFont(font);
        JButton jButton3 = new JButton("3");
        jButton3.setFont(font);
        JButton jButton4 = new JButton("4");
        jButton4.setFont(font);
        JButton jButton5 = new JButton("5");
        jButton5.setFont(font);
        JButton jButton6 = new JButton("6");
        jButton6.setFont(font);
        JButton jButton7 = new JButton("7");
        jButton7.setFont(font);
        JButton jButton8 = new JButton("8");
        jButton8.setFont(font);
        JButton jButton9 = new JButton("9");
        jButton9.setFont(font);
        JButton jButton_cong = new JButton("+");
        jButton_cong.setFont(font);
        JButton jButton_tru = new JButton("-");
        jButton_tru.setFont(font);
        JButton jButton_nhan = new JButton("x");
        jButton_nhan.setFont(font);
        JButton jButton_chia = new JButton(":");
        jButton_chia.setFont(font);
        JButton jButton_rs = new JButton("=");
        jButton_rs.setFont(font);

        //
        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new GridLayout(5,3));

        //add nut
        jPanelButton.add(jButton);
        jPanelButton.add(jButton1);
        jPanelButton.add(jButton2);
        jPanelButton.add(jButton3);
        jPanelButton.add(jButton4);
        jPanelButton.add(jButton5);
        jPanelButton.add(jButton6);
        jPanelButton.add(jButton7);
        jPanelButton.add(jButton8);
        jPanelButton.add(jButton9);
        jPanelButton.add(jButton_cong);
        jPanelButton.add(jButton_tru);
        jPanelButton.add(jButton_nhan);
        jPanelButton.add(jButton_chia);
        jPanelButton.add(jButton_rs);


        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.NORTH);
        this.add(jPanelButton,BorderLayout.CENTER);


        //display
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //set look and feel
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//lay goc nhin he thong
            myCalculator myCalculator = new myCalculator();
        }catch (Exception e){
            e.printStackTrace();//in ra vi tri loi sai
        }
    }
}
