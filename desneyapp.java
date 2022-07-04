package appiumDemo;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class desneyapp {
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
			installdisneyapp();
			}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public static void installdisneyapp() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo");
		cap.setCapability("udid", "OVINKFHATGIR6PBE");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\erdew\\eclipse-workspace\\appiumtests\\apk\\Disney_v1.1.3_apkpure.com.apk");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Application Started....");

}

}