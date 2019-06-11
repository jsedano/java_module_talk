package com.javamoduletalk.servicetwo;


import com.javamoduletalk.api.Printer;
import java.util.Date;

public class PrinterImpl implements Printer{

    public void print(String toPrint){
        System.out.println(new Date()+": "+toPrint);
    }

}
