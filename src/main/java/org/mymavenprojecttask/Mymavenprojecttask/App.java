package org.mymavenprojecttask.Mymavenprojecttask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com/");
       
    }
}
