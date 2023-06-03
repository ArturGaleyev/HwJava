package Project2.Task10;

public class Tester {
    public static void main(String[] args) {

        RemoteWebDriver[] webDriver = {
                new ChromeDriver(),
                new FirefoxDriver(),
                new SafariDriver(),
        };

        for (RemoteWebDriver w : webDriver) {
            w.open();
            w.close();
            System.out.println(w.getTitle());
            w.getScreenshot();
            w.navigate();
            System.out.println();
        }

    }
}
