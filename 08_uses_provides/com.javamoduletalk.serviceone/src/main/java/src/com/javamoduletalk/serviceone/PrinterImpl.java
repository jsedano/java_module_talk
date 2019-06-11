package com.javamoduletalk.serviceone;


import com.javamoduletalk.api.Printer;

public class PrinterImpl implements Printer{

    public void print(String toPrint){
        System.out.println(toPrint.toUpperCase());
    }

}
