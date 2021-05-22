package pages;

import org.openqa.selenium.WebElement;

public class UserPage extends BasePage {
	
	public WebElement getProfilnaSlika1() {
		return findElement("//img[@src= 'https://images-web.ug-be.cdn.united.cloud/2020/06/01/21/00/19/284168_profile_xl.png']");
	}
	
	public WebElement getProfileName() {
		return findElement("(//div[@class = 'profile-name-wrapper'])[2]/span");
	}
	
	public WebElement getPodesavanja() {
		return findElement("//span[contains(text(),'Podešavanja')]");
	}
}
