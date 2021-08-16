package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public  By menuUser = By.id("menuUser");
	private By coutry = By.name("countryListboxRegisterPage");
	private By shop = By.xpath("/html/body/header/nav/div/a/span[1]");
	private By btn = By.id("register_btnundefined");
	private By check = By.name("i_agree");
	private By lembreMe = By.xpath("//input[@name=\"remember_me\"]");
	private By signin = By.xpath("//button[@id=\"sign_in_btnundefined\"]");
	
	

	public By getLembreMe() {
		return lembreMe;
	}

	public By getSignin() {
		return signin;
	}

	public By getCheck() {
		return check;

	}

	public By getMenuUser() {
		return menuUser;
	}

	public By getCoutry() {
		return coutry;
	}

	public By getShop() {
		return shop;
	}

	public By getBtn() {
		return btn;
	}

}