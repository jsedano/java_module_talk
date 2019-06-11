module com.javamoduletalk.serviceone {
    requires com.javamoduletalk.api;
    provides com.javamoduletalk.api.Printer with com.javamoduletalk.serviceone.PrinterImpl;
}
