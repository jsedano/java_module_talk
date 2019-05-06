package com.javamoduletalk.gui;

import javax.swing.JOptionPane;
import com.javamoduletalk.data.Data;

public class ShowData {

    public static void main(String []args) {
        JOptionPane.showMessageDialog(null,new Data().getData(),"Data",JOptionPane.PLAIN_MESSAGE);
    }

}
