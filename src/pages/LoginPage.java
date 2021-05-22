package pages;

import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	public WebElement getButtonAcceptCookie() {
		return findElement("//*[@id=\"app\"]/div[1]/div/div/button");
	}
	
	public WebElement getDropDownJezik() {
		return findElement("(//*[@class='selected-arrow'])[1]");
	}
	
	public WebElement getSrpskiJezik() {
		return findElement("//div[@value = 'srp']");
	}
	
	public WebElement getDropDownProvajder() {
		return findElement("(//*[@class='selected-arrow'])[2]");
	}
	
	public WebElement getSbbProvajder() {
		return findElement("//div[@value = 'sbb-qa']");
	}
	
	public WebElement getKorisnickoIme() {
		return findElement("//input[@id = 'user_name']");
	}
	
	public WebElement getLozinka() {
		return findElement("//input[@id = 'user_password']");
	}
	
	public WebElement getButtonUlogujSe() {
		return findElement("//button[@class = 'submit-btn button common-primary']");
	}
}
