package com.example.check123123123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class VitimexTest {

    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeClass
    public void SetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vitimex.com.vn");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    //adudaduauduad
    @Test
    public void testtimkiemvathemsanpham()throws InterruptedException{

        String duongannuttk = "//a[@data-id='js-click-search']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(duongannuttk))).click();
        driver.findElement(By.id("inputSearchAuto")).sendKeys("áo");
        driver.findElement(By.className("btn-search")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/products/ao-vest-nam-dang-om-slimfit-vitimex-avs-5003']")).click();
        Thread.sleep(5000);
        String nutsize = "//label[@data-value='1']";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(nutsize)));
        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@id='btn-addtocart']")).click();
        System.out.println("them vao gio hang thanh cong");
    }
    @AfterClass
    public void hetphim(){
        driver.quit();
    }
}
