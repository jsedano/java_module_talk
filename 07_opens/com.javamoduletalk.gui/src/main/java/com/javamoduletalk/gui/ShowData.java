package com.javamoduletalk.gui;

import java.lang.reflect.Field;

import javax.swing.JOptionPane;
import com.javamoduletalk.data.Data;

public class ShowData {

    public static void main(String []args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Data data = new Data();
        Field f = data.getClass().getDeclaredField("data");
        f.setAccessible(true);
        f.set(data, data.getData()+ ", esto se añadio con reflection");

        JOptionPane.showMessageDialog(null, data.getData(),"Data",JOptionPane.PLAIN_MESSAGE);
    }

}
