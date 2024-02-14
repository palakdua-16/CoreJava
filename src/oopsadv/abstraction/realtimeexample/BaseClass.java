package src.oopsadv.abstraction.realtimeexample;

abstract public class BaseClass {

    abstract String openBrowser();
    abstract String closeBrowser();

    void printLog(){
        System.out.println("Logs");
    }
}
