package view;

import javax.swing.*;
//do JFrame la lop abstract nen co the ke thua luon
public class myWindow extends JFrame {

    public myWindow()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit cua so
    }

    public void display(){
        this.setVisible(true);
    }
    public void display(String title){
        this.setTitle(title);
        this.setVisible(true);
    }

    public void display(String title,int width,int height){
        this.setTitle(title);
        this.setSize(width,height);
        this.setLocationRelativeTo(null);//in ra cua so o chinh giua
        this.setVisible(true);
    }

    public static void main(String[] args) {
        myWindow mw = new myWindow();
        mw.display("aka hoamz",500,300);
    }
}
