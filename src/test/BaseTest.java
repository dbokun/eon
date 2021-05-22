package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import browser.Browser;
import eon.Eon;


public class BaseTest {
	
	protected static Eon eon;
	
	@BeforeClass
	public static void setup() {
		eon = new Eon();
	}
	
	@AfterClass
	public static void cleanup() {
		Browser.getBrowser().quit();
	}
	
	@Before
	public void testSetup() {
		Browser.getBrowser().get("https://sr.eon.tv/");
	}
}
