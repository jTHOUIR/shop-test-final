package com.shopToolsTest.automation.util;

public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {

		DriverManager driverManager;
		driverManager = new ChromeDriverManager();
		///switch (type) {
		///case CHROME:
		///	driverManager = new ChromeDriverManager();
		///	break;
		///case FIREFOX:
//			driverManager = new ChromeDriverManager();
//			break;
//		case IE:
//			driverManager = new ChromeDriverManager();
//			break;
//		default:
//			driverManager = new ChromeDriverManager();
//			break;
//		}
		return driverManager;

	}

}
