package eon;

import pages.CreateProfilesPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilesPage;
import pages.SettingsPage;
import pages.UserPage;

public class Eon {
	
	private HomePage homePage;
	private LoginPage loginPage;
	private ProfilesPage profilesPage;
	private CreateProfilesPage createProfilesPage;
	private UserPage userPage;
	private SettingsPage settingsPage;
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}
	
	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}
	
	public ProfilesPage getProfilesPage() {
		if (profilesPage == null) {
			profilesPage = new ProfilesPage();
		}
		return profilesPage;
	}
	public CreateProfilesPage getCreateProfilesPage() {
		if (createProfilesPage == null) {
			createProfilesPage = new CreateProfilesPage();
		}
		return createProfilesPage;
	}
	
	public UserPage getUserPage() {
		if (userPage == null) {
			userPage = new UserPage();
		}
		return userPage;
	}
	
	public SettingsPage getSettingsPage() {
		if (settingsPage == null) {
			settingsPage = new SettingsPage();
		}
		return settingsPage;
	}
}
