package pages;

import org.openqa.selenium.WebElement;

public class ProfilesPage extends BasePage {
	
	public WebElement getButtonKreiranjeProfila() {
		return findElement("//button[text() = 'Kreiranje profila']");
	}
	
	public WebElement getNoviProfil() {
		return findElement("//span[text() = 'Novi profil']");
	}
	
	public WebElement getPorodicniProfil() {
		return findElement("//span[contains(text(),'Porodični')]");
	}
}
