package pages;

import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage {
	
	public WebElement getMojProfil() {
		return findElement("//span[contains(text(),'Moj profil')]");
	}
	
	public WebElement getPromeniProfilnuSliku() {
		return findElement("//span[contains(text(),'Promeni')]");
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
	
	public WebElement getButtonAzuriraj() {
		return findElement("//button[contains(text(),'Ažuriraj')]");
	}
	
	public WebElement getButtonObrisiProfil() {
		return findElement("//button[contains(text(),'Obriši profil')]");
	}
	
	public WebElement getProfilnaSlika2() {
		return findElement("//img[@src= 'https://images-web.ug-be.cdn.united.cloud/2020/06/01/21/00/51/432433_profile_xl.png']");
	}
	
	public WebElement getPromeniImeProfila() {
		return findElement("//div[@class = 'input-text']/input");
	}
	
	public WebElement getButtonPotvrdi() {
		return findElement("//span[text() = 'Potvrdi']");
	}
	
	public WebElement getMessagePodesavanja() {
		return findElement("//p[text() = 'Podešavanja su sačuvana']");
	}
}
