package com.javamoduletalk.client;

import com.javamoduletalk.api.Printer;

import java.util.ServiceLoader;


public class Main{

  public static void main(String []args){
    String mensaje = "Hola service providers";
    ServiceLoader<Printer> services = ServiceLoader.load(Printer.class);
    for(Printer p : services){
        p.print(mensaje);
    }
  }

}
