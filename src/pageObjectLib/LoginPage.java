package pageObjectLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.TestFieldlenseLogin;

public class LoginPage extends TestFieldlenseLogin {

	public static void loginToFieldLense(String login, String password) {

		wd.get("https://app.fieldlens.com");
		WebDriverWait wait = new WebDriverWait(wd, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-email")));
		WebElement loginField = wd.findElement(By.id("login-email"));
		loginField.sendKeys(login);
		WebElement passwordField = wd.findElement(By.id("password"));
		passwordField.sendKeys(password);

		// Wait for the login button to be available
		if (wd.findElement(By.tagName("button")).isEnabled()) {
			WebElement loginButton = wd.findElement(By.tagName("button"));
			loginButton.click();
		}
	}
}
