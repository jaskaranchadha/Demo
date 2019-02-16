import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	public static WebDriver driver;
	
	//static By username_text_field = By.xpath("(//INPUT[@name='username' and @placeholder='Email'])[1]");
	//By password_text_field = By.xpath("(//INPUT[@name='password' and @placeholder='Password'])");
	
	
	public login(WebDriver driver){
		login.driver = driver;
	}


	public static void typeUsername(String username, WebDriver driver){
		//WebElement txt_username = driver.findElement(username_text_field);
		WebElement txt_username = driver.findElement(By.className("form-control"));
		System.out.println("check 2");
		System.out.println(txt_username);
		txt_username.sendKeys(username);
		System.out.println("check 3");
	}
	public static void typepassword(String password, WebDriver driver){
		//WebElement txt_username = driver.findElement(username_text_field);
		WebElement txt_password = driver.findElement(By.name("password"));
		System.out.println("check 2");
		System.out.println(txt_password);
		txt_password.sendKeys(password);
		System.out.println("check 3");
	}

}
