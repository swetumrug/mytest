/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.mycompany;

import com.mycompany.dominosselenium.FileUtil;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import junit.framework.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author swetu
 */
public class firstTest {
     private WebDriver driver;
  private String baseUrl;
   private JavascriptExecutor js;
    public firstTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");  
        driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;
   driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.dominos.com/");
     driver.manage().window().maximize();
    
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
   driver.quit();
    }
    
    @Test
  public void signinPassTest() throws Exception {
         driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[2]/li[1]/button")).click();
     
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys(FileUtil.readForm().getUsername());
    driver.findElement(By.id("Password")).click();
   driver.findElement(By.id("Password")).clear();
    driver.findElement(By.id("Password")).sendKeys(FileUtil.readForm().getPassword());
    Thread.sleep(40);
    driver.findElement(By.cssSelector("#login-modal-form > div.css-h34j8g > button.css-670g51")).click();

     driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div/div/div/div[6]/a")).click();
 
  }
  
  
    
//     @Test
//  public void test1() throws Exception {
//     driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/nav/ul[2]/li[1]/button")).click();
//     
//    driver.findElement(By.id("Email")).click();
//    driver.findElement(By.id("Email")).clear();
//    driver.findElement(By.id("Email")).sendKeys("swetaleasamia@gmail.com");
//    driver.findElement(By.id("Password")).click();
//   driver.findElement(By.id("Password")).clear();
//    driver.findElement(By.id("Password")).sendKeys("slsgroup123");
//    //*[@id="login-modal-form"]/div[4]/button[1]
//    //*[@id="login-modal-form"]/div[5]/button
//    
////     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
////     wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Sign In For this Order")));
////     
////     WebElement elem = driver.findElement(By.linkText("Sign In For this Order"));
////     elem.click();
//
//
////button[@type='submit'][1]
// 
// Thread.sleep(40);
//// if(driver.findElement(By.xpath(" //*[@id=\"recaptcha-anchor\"]/div[1]")).isDisplayed()){
////     driver.findElement(By.xpath(" //*[@id=\"recaptcha-anchor\"]/div[1]")).click();
////Thread.sleep(40);
////driver.findElement(By.xpath("//button[@type='submit'[1] or @data-quid='sign-in-button']")).click();
//// }else{
////     Thread.sleep(40);
//driver.findElement(By.cssSelector("#login-modal-form > div.css-h34j8g > button.css-670g51")).click();
//// }
////driver.findElement(By.xpath(" //*[@id=\"recaptcha-anchor\"]/div[1]")).click();
////Thread.sleep(40);
////driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
//   // driver.findElement(By.xpath("//*[@data-quid=\"sign-in-button\"]")).click();
//    driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div/div/div/div[6]/a")).click();
//    driver.findElement(By.id("Carryout")).click();
//    driver.findElement(By.id("City")).click();
//   driver.findElement(By.id("City")).clear();
//    driver.findElement(By.id("City")).sendKeys("Streamwood");
//    driver.findElement(By.id("Region")).click();
//    new Select(driver.findElement(By.id("Region"))).selectByVisibleText("IL");
//    driver.findElement(By.xpath("//button[@type='submit']")).click();
//    driver.findElement(By.xpath("//div[@id='locationsResultsPage']/div/div[2]/div/div[3]/div/div[2]/div/a/span")).click();
//    
//    
//    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/div/div[3]/section/header/h2/button/span")).click();
//    driver.findElement(By.xpath("//img[@alt='Build your pizza']")).click();
//    
//   // Thread.sleep(2000);
//    
////    Set<String> handler = driver.getWindowHandles();
////    Iterator<String> it = handler.iterator();
////    
////   String parentWindowId = it.next();
////    System.out.println("Parent window id"+ parentWindowId);
////    
////    String childWindowId = it.next();
////    System.out.println("Child window id"+ childWindowId);
////    
////    driver.switchTo().window(childWindowId);
////    
////    Thread.sleep(2000);
////    
////         System.out.println("Child window pop up title"+driver.getTitle());
////         
//       //driver.switchTo().window("Domino's Pizza Builder");  
//       
//    
////    Alert alert = driver.switchTo().alert();
////    
//// String alertMessage= driver.switchTo().alert().getText();
//// 
////         System.out.println(alertMessage);
////         Thread.sleep(5000);
////         
////         Assert.assertEquals("Domino's Pizza Builder",alertMessage );
//    driver.findElement(By.id("crust_type|12THIN")).click();
//    driver.manage().window().maximize();
//    
//   driver.findElement(By.xpath("//*[@id=\"pageModal\"]/div")).click();
// driver.findElement(By.cssSelector("#pageModal > div")).isEnabled(); 
////    
//    JavascriptExecutor js1 = (JavascriptExecutor) driver;//scroll bar
//js1.executeScript("document.getElementById('pageModal').scrollDown += 200");//        
////js1.executeScript("window.scrollBy(0,3000)", "");
//////        
////        JavascriptExecutor js2 = (JavascriptExecutor) driver;//scroll bar
////        js2.executeScript("window.scrollBy(0,3000)", "");
//
//driver.findElement(By.xpath("//*[@id=\"pageModal\"]/div/section/div/div/ol/li[2]/section/div/div[3]/div/div/label[3]/svg/path[3]")).click();
//   
////    driver.findElement(By.name("Weight|C--2")).click();
// //  new Select(driver.findElement(By.name("Weight|C--2"))).selectByVisibleText("Light");
////    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[2]/section/div/div[2]/div/header/button")).click();
////    driver.findElement(By.xpath("//input[@value='J']")).click();
////    driver.findElement(By.xpath("//input[@value='G']")).click();
////    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[5]/section/div/div/fieldset/div/div[2]/button[2]")).click();
////    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[5]/section/div/div/fieldset[2]/div/div[2]/button[2]")).click();
////    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[5]/section/div/div/fieldset[2]/div/div[2]/button[2]")).click();
////    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[7]/aside/section/div/button")).click();
////    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/div/div[3]/section/header/h2/button")).click();
////    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/div/div[3]/section/div/div/div[2]/div/a")).click();
////    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[2]/section/div/div[3]/div/div/label[3]/input")).click();
////    driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[7]/aside/section/div/button")).click();
////    driver.findElement(By.xpath("//div[@id='stepUpsell']/div/button")).click();
////    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/div/div[2]/ol/li[3]/span")).click();
////    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/div/div[3]/section/header/h2/button")).click();
////    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/div/div[3]/section/div/div/div[2]/div/a[2]")).click();
////    driver.findElement(By.xpath("//input[@value='G']")).click();
////    driver.findElement(By.xpath("//input[@value='O']")).click();
////    driver.findElement(By.xpath("//input[@value='J']")).click();
//  //  driver.findElement(By.xpath("//div[@id='pageModal']/div/section/div/div/ol/li[7]/aside/section/div/button")).click();
////    driver.findElement(By.linkText("done with this coupon")).click();
////    driver.findElement(By.xpath("//div[@id='js-myOrderPage']/a/span")).click();
////    driver.findElement(By.xpath("//div[@id='genericOverlay']/section/header/button")).click();
////    driver.findElement(By.linkText("Continue Checkout")).click();
////    driver.findElement(By.xpath("//body[@id='_dpz']/div/section/div/div/div[2]/button")).click();
////    driver.findElement(By.id("Vehicle_Color")).click();
////    new Select(driver.findElement(By.id("Vehicle_Color"))).selectByVisibleText("White");
////    driver.findElement(By.id("Vehicle_Make")).click();
////    new Select(driver.findElement(By.id("Vehicle_Make"))).selectByVisibleText("Toyota");
////    driver.findElement(By.id("Vehicle_Model")).click();
////    driver.findElement(By.id("Vehicle_Model")).clear();
////    driver.findElement(By.id("Vehicle_Model")).sendKeys("Siena");
////    driver.findElement(By.id("Pickup_Preference")).click();
////    new Select(driver.findElement(By.id("Pickup_Preference"))).selectByVisibleText("Passenger Side");
////    driver.findElement(By.xpath("//form[@id='payment-form']/div[7]/div/div[2]/div/div[6]/div/label")).click();
////    driver.findElement(By.id("Credit_Card_Number")).click();
////    driver.findElement(By.id("Credit_Card_Number")).clear();
////    driver.findElement(By.id("Credit_Card_Number")).sendKeys("3333 - 3333 - 3333 - 3333");
////    driver.findElement(By.id("Expiration_Month")).click();
////    driver.findElement(By.id("Expiration_Month")).clear();
////    driver.findElement(By.id("Expiration_Month")).sendKeys("02");
////    driver.findElement(By.id("Expiration_Year")).click();
////    driver.findElement(By.id("Expiration_Year")).clear();
////    driver.findElement(By.id("Expiration_Year")).sendKeys("32");
////    driver.findElement(By.id("Credit_Card_Security_Code")).click();
////    driver.findElement(By.id("Credit_Card_Security_Code")).clear();
////    driver.findElement(By.id("Credit_Card_Security_Code")).sendKeys("222");
////    driver.findElement(By.id("Billing_Postal_Code")).click();
////    driver.findElement(By.id("Billing_Postal_Code")).clear();
////    driver.findElement(By.id("Billing_Postal_Code")).sendKeys("44444");
////    driver.findElement(By.xpath("//button[@type='submit']")).click();
//  }
    
}
