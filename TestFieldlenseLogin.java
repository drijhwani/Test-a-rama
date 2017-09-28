package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectLib.HomePage;
import pageObjectLib.LoginPage;

public class TestFieldlenseLogin {

	public static WebDriver wd = new ChromeDriver();

	@Test
	public void testLogin() {
		LoginPage.loginToFieldLense("testFieldLense@gmail.com", "123456");
		String homePageResponse = HomePage.homePage();
		String expected = "The Feed is made up of all the posts on the project.";
		assertTrue(homePageResponse.contains(expected));
		wd.close();
	}
}
