package view;
import controller.CounterListener;
import model.Counter;//import dem class Counter

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private final Counter counterModel;
    private JLabel jLabel_value;//noi hien thi data

    public CounterView(){
        this.counterModel = new Counter();//khoi tao mot cai counterModel
        this.init();
        //display
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("aka hoamz");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//dong cua so

        ActionListener ac = new CounterListener(this);

        JButton jButton_up = new JButton("Up");
        jButton_up.addActionListener(ac);
        JButton jButton_down = new JButton("Down");
        jButton_down.addActionListener(ac);

        jLabel_value = new JLabel(this.counterModel.getValue() + "",JLabel.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout());//mac dinh thi se la 1 hang va nhieu cot

        jPanel.add(jButton_up);
        jPanel.add(jLabel_value);
        jPanel.add(jButton_down);

        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
    }

    public void tangthem(){
        this.counterModel.tang();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
    public void giamdi(){
        this.counterModel.giam();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
}
