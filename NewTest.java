import class.login;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
public static WebDriver driver;
	
	//static By username_text_field = By.xpath("(//INPUT[@name='username' and @placeholder='Email'])[1]");
	//By password_text_field = By.xpath("(//INPUT[@name='password' and @placeholder='Password'])");
	
	
//	public login(WebDriver driver){
//		login.driver = driver;
//	}

//	public static void typeUsername(String username, WebDriver driver){
		//WebElement txt_username = driver.findElement(username_text_field);
//		WebElement txt_username = driver.findElement(By.className("form-control"));
//		System.out.println("check 2");
//		System.out.println(txt_username);
//		txt_username.sendKeys(username);
//		System.out.println("check 3");
//	}
//	public static void typepassword(String password, WebDriver driver){
		//WebElement txt_username = driver.findElement(username_text_field);
//		WebElement txt_password = driver.findElement(By.name("password"));
//		System.out.println("check 2");
//		System.out.println(txt_password);
//		txt_password.sendKeys(password);
//		System.out.println("check 3");
//	}

//}
  @Test
  public void f() {
	  //System.setProperty("webdriver.gecko.driver","C:\\Users\\Jaskaran Singh\\Downloads\\geckodriver-master\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/");
	  driver.findElement(By.xpath("(//A[@class='go-text-right'][text()=' Login'][text()=' Login'])[2]/../../..//A[@href='javascript:void(0);']")).click();
		driver.findElement(By.xpath("(//A[@class='go-text-right'][text()=' Login'][text()=' Login'])[2]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("check 0");
		//WebElement txt_username = driver.findElement(By.className("form-control"));
		//txt_username.clear();
		//txt_username.sendKeys("abc");
		//System.out.println("check 1");
		login.typeUsername("user@phptravels.com", driver);
		login.typepassword("demouser", driver);
		driver.findElement(By.xpath("//BUTTON[@type='submit'][text()='Login']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			String alertMsg1 = driver.findElement(By.className("RTL")).getText();
			System.out.println(alertMsg1);}
		catch (Exception e) {
			String alertMsg = driver.findElement(By.className("resultlogin")).getText();
			System.out.println(alertMsg);}
  }
  @BeforeTest
  public void beforeTest() {
	  //initiate the Browser
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Jaskaran Singh\\Downloads\\geckodriver-master\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.phptravels.net/");
  }

  @AfterTest
  public void afterTest() {
	  //close the Browser
	  driver.quit()
  }

}
