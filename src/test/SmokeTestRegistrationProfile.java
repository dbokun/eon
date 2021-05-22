package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class SmokeTestRegistrationProfile extends BaseTest{
	
	WebDriver driver = Browser.getBrowser();
	WebDriverWait wait = new WebDriverWait(driver, 120);
	String userName = "eon.test2";
	String password = "Un1ted1578";
	String imeProfila = "Test1";
	String imeProfila2 = "Test2";
	String imeProfilaZaAzuriranje = "ProfilZaAzuriranje";
	String godinaRodjenja = "2010";
	
	@Test
	public void createProfileTest() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(eon.getHomePage().getButtonUlogujSe())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getLoginPage().getButtonAcceptCookie())).click();
		eon.getLoginPage().getDropDownJezik().click();
		eon.getLoginPage().getSrpskiJezik().click();
		eon.getLoginPage().getDropDownProvajder().click();
		eon.getLoginPage().getSbbProvajder().click();
		eon.getLoginPage().getKorisnickoIme().click();
		eon.getLoginPage().getKorisnickoIme().clear();
		eon.getLoginPage().getKorisnickoIme().sendKeys(userName);
		eon.getLoginPage().getLozinka().click();
		eon.getLoginPage().getLozinka().clear();
		eon.getLoginPage().getLozinka().sendKeys(password);
		eon.getLoginPage().getButtonUlogujSe().click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getProfilesPage().getButtonKreiranjeProfila())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getImeProfila())).click();
		eon.getCreateProfilesPage().getImeProfila().clear();
		eon.getCreateProfilesPage().getImeProfila().sendKeys(imeProfila);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getUzrastFromFifteenToSeventeen())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getProfilnaSlika1())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getPozadinaTamna())).click();
		eon.getCreateProfilesPage().getButtonKreirajProfil().click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getUserPage().getProfilnaSlika1())).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getUserPage().getProfileName()));
		String profileName = eon.getUserPage().getProfileName().getText();
		assertEquals(imeProfila, profileName);	   
	}
	
	@Test
	public void createProfileWithoutEnteringAniDataTest() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(eon.getHomePage().getButtonUlogujSe())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getLoginPage().getButtonAcceptCookie())).click();
		eon.getLoginPage().getDropDownJezik().click();
		eon.getLoginPage().getSrpskiJezik().click();
		eon.getLoginPage().getDropDownProvajder().click();
		eon.getLoginPage().getSbbProvajder().click();
		eon.getLoginPage().getKorisnickoIme().click();
		eon.getLoginPage().getKorisnickoIme().clear();
		eon.getLoginPage().getKorisnickoIme().sendKeys(userName);
		eon.getLoginPage().getLozinka().click();
		eon.getLoginPage().getLozinka().clear();
		eon.getLoginPage().getLozinka().sendKeys(password);
		eon.getLoginPage().getButtonUlogujSe().click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getProfilesPage().getNoviProfil())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getButtonKreirajProfil())).click();
		String errorMessageIme = eon.getCreateProfilesPage().getErrorMessageIme().getText();
		assertEquals("Niste uneli ime.",errorMessageIme);
	}
	
	@Test
	public void createProfileWithInvalidDataTest() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(eon.getHomePage().getButtonUlogujSe())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getLoginPage().getButtonAcceptCookie())).click();
		eon.getLoginPage().getDropDownJezik().click();
		eon.getLoginPage().getSrpskiJezik().click();
		eon.getLoginPage().getDropDownProvajder().click();
		eon.getLoginPage().getSbbProvajder().click();
		eon.getLoginPage().getKorisnickoIme().click();
		eon.getLoginPage().getKorisnickoIme().clear();
		eon.getLoginPage().getKorisnickoIme().sendKeys(userName);
		eon.getLoginPage().getLozinka().click();
		eon.getLoginPage().getLozinka().clear();
		eon.getLoginPage().getLozinka().sendKeys(password);
		eon.getLoginPage().getButtonUlogujSe().click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getProfilesPage().getNoviProfil())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getImeProfila())).click();
		eon.getCreateProfilesPage().getImeProfila().clear();
		eon.getCreateProfilesPage().getImeProfila().sendKeys(imeProfila2);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getUzrastEighteenPlus())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getGodinaRodjenja())).click();
		eon.getCreateProfilesPage().getGodinaRodjenja().clear();
		eon.getCreateProfilesPage().getGodinaRodjenja().sendKeys(godinaRodjenja);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getProfilnaSlika1())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getPozadinaSvetla())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getButtonKreirajProfil())).click();
		String errorMessageGodina = eon.getCreateProfilesPage().getErrorMessageGodina().getText();
		assertEquals("Niste pravilno uneli godinu.",errorMessageGodina);
	}
	
	@Test
	public void editProfileTest() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(eon.getHomePage().getButtonUlogujSe())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getLoginPage().getButtonAcceptCookie())).click();
		eon.getLoginPage().getDropDownJezik().click();
		eon.getLoginPage().getSrpskiJezik().click();
		eon.getLoginPage().getDropDownProvajder().click();
		eon.getLoginPage().getSbbProvajder().click();
		eon.getLoginPage().getKorisnickoIme().click();
		eon.getLoginPage().getKorisnickoIme().clear();
		eon.getLoginPage().getKorisnickoIme().sendKeys(userName);
		eon.getLoginPage().getLozinka().click();
		eon.getLoginPage().getLozinka().clear();
		eon.getLoginPage().getLozinka().sendKeys(password);
		eon.getLoginPage().getButtonUlogujSe().click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getProfilesPage().getButtonKreiranjeProfila()));
		eon.getProfilesPage().getButtonKreiranjeProfila().click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getImeProfila()));
		eon.getCreateProfilesPage().getImeProfila().clear();
		eon.getCreateProfilesPage().getImeProfila().sendKeys(imeProfilaZaAzuriranje);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getUzrastFromFifteenToSeventeen()));
		eon.getCreateProfilesPage().getUzrastFromFifteenToSeventeen().click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getProfilnaSlika1()));
		eon.getCreateProfilesPage().getProfilnaSlika1().click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getCreateProfilesPage().getPozadinaTamna()));
		eon.getCreateProfilesPage().getPozadinaTamna().click();
		eon.getCreateProfilesPage().getButtonKreirajProfil().click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getUserPage().getProfilnaSlika1())).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getUserPage().getProfileName()));
		String profileName = eon.getUserPage().getProfileName().getText();
		assertEquals(imeProfilaZaAzuriranje, profileName);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getHomePage().getButtonPodesavanja())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getSettingsPage().getMojProfil())).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getSettingsPage().getPromeniProfilnuSliku())).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getSettingsPage().getProfilnaSlika2())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getSettingsPage().getButtonPotvrdi())).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(eon.getSettingsPage().getPromeniImeProfila())).click();
		eon.getSettingsPage().getPromeniImeProfila().clear();
		eon.getSettingsPage().getPromeniImeProfila().sendKeys(imeProfilaZaAzuriranje + "Promenjen");
		wait.until(ExpectedConditions.elementToBeClickable(eon.getSettingsPage().getUzrastFromTwelveToFourteen())).click();
		wait.until(ExpectedConditions.elementToBeClickable(eon.getSettingsPage().getButtonAzuriraj())).click();
		wait.until(ExpectedConditions.visibilityOf(eon.getSettingsPage().getMessagePodesavanja()));
		
		String activeMessage = eon.getSettingsPage().getMessagePodesavanja().getText();
		assertEquals("Podešavanja su sačuvana",activeMessage);
		
		String promenjenoIme = eon.getSettingsPage().getPromeniImeProfila().getText();
		assertEquals(imeProfilaZaAzuriranje + "Promenjen", promenjenoIme);
		
	    WebElement slika2 = driver.findElement(By.xpath("//*[@class = 'top-part']/div/img"));
	    String srcSlika2 = slika2.getAttribute("src");
	    String srcSlika1 = eon.getUserPage().getProfilnaSlika1().getAttribute("src");
	    assertNotEquals(srcSlika1, srcSlika2);
	    System.out.println(srcSlika1);
	    System.out.println(srcSlika2);
	    
	    WebElement selektovaniUzrast = driver.findElement(By.xpath("//span[@class = 'range-value active']"));
	    assertEquals("12-14", selektovaniUzrast.getText());
	    System.out.println(selektovaniUzrast.getText());
	}
}
