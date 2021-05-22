package pages;

import org.openqa.selenium.WebElement;

public class CreateProfilesPage extends BasePage {
	
	public WebElement getImeProfila() {
		return findElement("//div[@class = 'name']/div/input");
	}
	
	public WebElement getUzrastFromZeroToSix() {
		return findElement("//span[contains(text(),'0-6')]");
	}
	
	public WebElement getUzrastFromSevenToEleven() {
		return findElement("//span[contains(text(),'7-11')]");
	}
	
	public WebElement getUzrastFromTwelveToFourteen() {
		return findElement("//span[contains(text(),'12-14')]");
	}
	
	public WebElement getUzrastFromFifteenToSeventeen() {
		return findElement("//span[contains(text(),'15-17')]");
	}
	
	public WebElement getUzrastEighteenPlus() {
		return findElement("//span[contains(text(),'18+')]");
	}
	
	public WebElement getGodinaRodjenja() {
		return findElement("//*[contains(text(), 'Godina rođenja')]/../input");
	}
	
	public WebElement getProfilnaSlika1() {
		return findElement("//img[@src= 'https://images-web.ug-be.cdn.united.cloud/2020/06/01/21/00/19/284168_profile_xl.png']");
	}
	
	public WebElement getPozadinaSvetla() {
		return findElement("//span[contains(text(),'Svetla')]");
	}
	
	public WebElement getPozadinaTamna() {
		return findElement("//span[contains(text(),'Tamna')]");
	}
	
	public WebElement getButtonKreirajProfil() {
		return findElement("//button[@class = 'button primary']");
	}
	
	public WebElement getErrorMessageIme() {
		return findElement("//span[contains(text(),'Niste uneli ime.')]");
	}
	
	public WebElement getErrorMessageGodina() {
		return findElement("//span[contains(text(),'Niste pravilno uneli godinu.')]");
	}
}
