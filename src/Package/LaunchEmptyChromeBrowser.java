package Package;

public class LaunchEmptyChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		new ChromeDriver();
	}

}
