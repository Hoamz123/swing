package controller;

import view.CounterView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class CounterListener implements Action {
    private final CounterView ctv;

    public CounterListener(CounterView ctv){
        this.ctv = ctv;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("ban dan nhan nut");
        String src = e.getActionCommand();//lay ten nut user vua  an
//        System.out.println("ban dan nhan nut" + src);
        if(src.equals("Up")){
            this.ctv.tangthem();
        }
        else if(src.equals("Down")){
            this.ctv.giamdi();
        }
    }

    @Override
    public Object getValue(String key) {
        return null;
    }

    @Override
    public void putValue(String key, Object value) {

    }

    @Override
    public void setEnabled(boolean b) {

    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }
}
