package ups.actions;

import org.openqa.selenium.support.PageFactory;
import ups.elements.UpsLoginElements;
import ups.utilities.UpsDriverSetup;

public class UpsLoginActions {

	UpsLoginElements loginTest;

	public UpsLoginActions() {
		this.loginTest = new UpsLoginElements();
		PageFactory.initElements(UpsDriverSetup.driver, loginTest);

	}

	public String upsLoginPage() {
		UpsDriverSetup.driver.get("https://www.ups.com/lasso/login");
		String title = UpsDriverSetup.driver.getTitle();
		return title;

	}

	public void setUserID(String userId) {
		loginTest.userId.sendKeys(userId);

	}

	public void setPassword(String password) {
		loginTest.password.sendKeys(password);

	}

	public void loginClick() {
		loginTest.loginButton.click();
	}

	public boolean errorReadMsg() {
		return loginTest.errorMsg.isDisplayed();
	}

}
