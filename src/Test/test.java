package Test;

import view.CounterView;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            CounterView counterView = new CounterView();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
