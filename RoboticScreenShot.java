package com.CaptureText;

import java.time.Duration;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboticScreenShot {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.id("alert1")).click();
		
		Robot robot = new Robot();
		Dimension dimension=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(dimension);
		BufferedImage bufferedimage=robot.createScreenCapture(rec);
		ImageIO.write(bufferedimage, "png", new File(".\\ScreenShot\\FullScreen1.png"));
		
		driver.close();
	}

}
