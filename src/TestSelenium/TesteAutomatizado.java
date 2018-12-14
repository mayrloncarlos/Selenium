package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado 
{
    public static void main(String[] args) throws Exception 
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mayrl\\Desktop\\eclipse-workspace\\teste-de-sistema\\libs\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        
       WebElement campoDeTexto = driver.findElement(By.name("q"));
       campoDeTexto.sendKeys("Caelum");
       
       campoDeTexto.submit();
    }
}
