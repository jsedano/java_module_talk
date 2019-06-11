module com.javamoduletalk.servicetwo {
    requires com.javamoduletalk.api;
    provides com.javamoduletalk.api.Printer with com.javamoduletalk.servicetwo.PrinterImpl;
}
