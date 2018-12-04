/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bk;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cynthia
 */
public class BK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.getProperty("webdriver.gecko.driver","C:\\Program Files\\selenium-server-standalone\\geckodriver-v0.23.0-win64\\geckodriver.exe");
    WebDriver driver= new FirefoxDriver();
    driver.get("https://www.bk.rw");    	
    WebElement link, link1, link2 ;
 
    link =driver.findElement(By.xpath("//a[@href='https://www.bk.rw/personal']"));
    link.click();
 
    //first click "Current & Saving"
    link1 =driver.findElement(By.xpath("//*[@id=\"nav\"]/div/div/div[2]/ul[1]/li[2/a"]));
    link1.click();
    
    //Then click the link you want to
    link2=driver.findElement(By.xpath("//a[@href='https://bk.rw/personal/checking-saving/personal-current']"));
    //try {
      //Thread.sleep(5000);
    	//} catch (InterruptedException ex) {
     //Logger.getLogger(BK.class.getName()).log(Level.SEVERE, null, ex);
    	//}
     driver.quit();


    }
    
}
