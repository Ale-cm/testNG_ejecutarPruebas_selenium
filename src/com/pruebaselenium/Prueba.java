

package com.pruebaselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prueba {

    @Test (  priority = 1 , description = "Evalúa el título del documento")
    void pruebaTitle(){
        // PULL REQUEST 
        ChromeOptions chrome_options = new ChromeOptions(); //inyecta valores desde el momento en que se habre
        chrome_options.addArguments("--headless");


        System.setProperty( "webdriver.chrome.driver", "C:\\webdrivers\\chrome\\chromedriver.exe" );


        WebDriver driver = new ChromeDriver(chrome_options);

        driver.get("http://wikipedia.org/");


        Assert.assertEquals(driver.getTitle() , "Wikipedia");
    }

    @Test (  priority = 2, description = "Examina la prueba 2")
    void pruebaDos(){

        System.out.println( "Prueba dos OK");

    }


    @Test (  priority = 3, description = "Examina la prueba 3")
    void pruebaTres(){

        System.out.println( "Prueba tres OK");
    }
}
