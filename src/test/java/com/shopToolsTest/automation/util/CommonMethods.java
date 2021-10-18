package com.shopToolsTest.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	public static WebDriver driver;
	public static Properties prop;

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public CommonMethods() {
		driver = Setup.driver;
	}

	public void refresh() {
		driver.navigate().refresh();

	}

	public void back() {
		driver.navigate().back();
	}

	public void forward() {
		driver.navigate().forward();
	}

	public void scrollerBottom() {
		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		}
	}

	public void readFromConfigFle() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
	}
}
