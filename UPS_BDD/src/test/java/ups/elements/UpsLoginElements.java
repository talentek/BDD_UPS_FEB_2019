package ups.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsLoginElements {

	//UserID
	@FindBy(name="userID")
	public WebElement userId;

	//Password
	@FindBy(name = "password")
	public WebElement password;

	//Login Button
	@FindBy(xpath = "//*[@id='submitBtn']")
	public WebElement loginButton;

	//Login Error Message
	@FindBy(xpath = "//p[@class='ups-invalid_color-list ups-error_alert-list icon ups-icon-exclamation']")
	public WebElement errorMsg;

}
