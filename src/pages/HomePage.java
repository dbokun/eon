package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	
	public WebElement getButtonUlogujSe() {
		return findElement("//a[contains(text(),'Uloguj se')]");
	}
	
	public WebElement getAcceptAllCookies() {
		return findElement("//a[@id='CybotCookiebotDialogBodyButtonAccept']");
	}
	
	public WebElement getButtonPodesavanja() {
		return findElement("//span[text() = 'Podešavanja']");
	}
}
