package utilities;

public class BrowserUtilities {

    public static void waitFor(int sec){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
