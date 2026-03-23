package Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Reusableclass;

public class PojoFB extends Reusableclass {

	public PojoFB() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}



	@FindBy(id = "_R_1h6kqsqppb6amH1_")
	private WebElement email;
	
	@FindBy(id="_R_1hmkqsqppb6amH1_")
	private WebElement password;
	
}
