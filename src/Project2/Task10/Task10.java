package Project2.Task10;

public interface Task10 {
    void open();

    void close();

    String getTitle();
}


interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends Task10, TakesScreenshot {

    void navigate();
}


class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Chrome Title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Make Chrome Browser Window Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Facebook in Chrome Browser");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open FireFox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close FireFox Browser");
    }

    @Override
    public String getTitle() {
        return "FireFox Title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Make FireFox Browser Window Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Facebook in FireFox Browser");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("CLose Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Safari Title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Make Safari Browser Window Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Facebook in Safari Browser");
    }
}
