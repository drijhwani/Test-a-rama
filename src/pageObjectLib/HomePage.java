package pageObjectLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.TestFieldlenseLogin;

public class HomePage extends TestFieldlenseLogin {

	public static String homePage() {

		// Check if the login was incorrect
		if (wd.findElement(By.className("message")).getText().equals("UNAUTHORIZED!")) {
			return wd.findElement(By.className("message")).getText() + " Login";
		} else {
			// Read the message on the home page and return it back to the
			// parent class
			WebDriverWait wait = new WebDriverWait(wd, 60);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("post-feed--empty-state")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("top-bar")));
			WebElement homePage = wd.findElement(By.className("post-feed--empty-state"));
			return homePage.getText();
		}
	}
}
