package webapp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.awt.Dimension;
import java.awt.Panel;

import static io.appium.java_client.touch.TapOptions.tapOptions;;

public class hopscotch {
		AndroidDriver<AndroidElement> driver;
			
			@BeforeTest
			public void BT() throws MalformedURLException
			{
		    DesiredCapabilities dc = new DesiredCapabilities();
				
		    dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8N71X63QW");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"in.hopscotch.android");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"in.hopscotch.android.activity.SplashActivity ");
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
				}
		
		@Test(enabled=true)
		
		public void positive() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElementByAndroidUIAutomator("text(\"Girl\")").click();
			driver.findElementByAndroidUIAutomator("text(\"1-6 years\")").click();
			//driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"))").click();
			Thread.sleep(5000);
			driver.findElements(MobileBy.className("android.widget.ImageView")).get(6).click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Girls Pink Sleeveless All-Over Print Gown\"))").click();
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"1-2 years\"))").click();
			//driver.findElements(MobileBy.className("android.widget.ImageView")).get(3).click();
			//AndroidElement one=driver.findElement(MobileBy.id("in.hopscotch.android:id/pdp_header_item_image"));
		  TouchAction TA=new TouchAction(driver);
		//	Double Screenwidthend= one.getSize().getWidth() * 0.9 ;
			//int scrollover=Screenwidthend .intValue();
			Thread.sleep(3000);
		//	TA.longPress(longPressOptions().withElement(element(one)).withDuration(ofSeconds(3))).moveTo(PointOption.point(0, scrollover)).release().perform();
		//	TA.longPress(longPressOptions().withElement(element(one)).withDuration(ofSeconds(3))).moveTo(element(two)).release().perform();
			TA.longPress(PointOption.point(1032,610)).moveTo(PointOption.point(64, 658)).release().perform();
			TA.longPress(PointOption.point(1032,610)).moveTo(PointOption.point(64, 658)).release().perform();
			TA.longPress(PointOption.point(1032,610)).moveTo(PointOption.point(64, 658)).release().perform();
			driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
			driver.findElement(MobileBy.id("in.hopscotch.android:id/cart_icon")).click();
			//driver.findElements(MobileBy.className("android.widget.ImageView")).get(2).click();)
			driver.findElement(MobileBy.id("in.hopscotch.android:id/bottom_navigation_item_icon")).click();
			Thread.sleep(3000);
			driver.findElements(MobileBy.className("android.widget.TextView")).get(2).click();
			//driver.findElements(MobileBy.className("android.widget.ImageView")).get(9).click();
			//driver.findElementByAndroidUIAutomator("text(\"Trending on Hopscotch\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Footwear\")").click();
			//driver.findElements(MobileBy.className("android.widget.ImageView")).get(9).click();
			//driver.findElementByAndroidUIAutomator("text(\"Unisex Black And White Text Print LED\")").click();
			//driver.findElementByAndroidUIAutomator("text(\"rlGis Red Text Print Onesie and Skirt Set with Hairband\")").click();
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Unisex Blue Solid LED Slip Ons Sneakers\"))").click();
			//driver.findElements(MobileBy.className("android.widget.ImageView")).get(3).click();
			//driver.findElementByAndroidUIAutomator("text(\"Euro 26 (2.5-3 years)\")").click();
		//	driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
			//driver.pressKey(new KeyEvent(AndroidKey.BACK));
			//driver.findElements(MobileBy.className("android.widget.ImageView")).get(3).click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Unisex Pink Unicorn Applique Led Flip Flop\"))").click();
		//	driver.findElementByAndroidUIAutomator("text(\"Unisex Pink Unicorn Applique Flip Flop\")").click();
			
			driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
			driver.findElementByAndroidUIAutomator("text(\"Euro 23 (2-3 years)\")").click();
			driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").click();
			driver.findElement(MobileBy.id("in.hopscotch.android:id/cart_icon")).click();
			String p1=driver.findElementByAndroidUIAutomator("text(\"599\")").getText();
			int pr1=Integer.parseInt(p1);
			
			
		//	String p2=driver.findElementByAndroidUIAutomator("text(\"2129\")").getText();
			//int pr2=Integer.parseInt(p2);
		//	int total=pr1+pr2;
			//String total1=driver.findElementByAndroidUIAutomator("text(\"3,327\")").getText();
			//int total2=Integer.parseInt(total1);
		//	int total2=3327;
			//System.out.println(total2);
			//if(total==total2)
			//{
				
			//	System.out.println("Price Matched");
		//	}
		//	else
		//	{
				
			//	System.out.print("Price not Matching");
		//	}
		}
			
@Test(enabled=false)
		
		public void positive1() throws InterruptedException
		{
	Thread.sleep(2000);
	driver.findElementByAndroidUIAutomator("text(\"Girl\")").click();
	driver.findElementByAndroidUIAutomator("text(\"1-6 years\")").click();
	driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"))").click();
	Thread.sleep(5000);
	driver.findElements(MobileBy.className("android.widget.ImageView")).get(6).click();
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Girls Pink Sleeveless All-Over Print Gown\"))").click();
	Thread.sleep(5000);
	List<AndroidElement> image = driver.findElements(MobileBy.className("android.widget.ImageView"));
	AndroidElement p=(AndroidElement) driver.findElements(MobileBy.className("android.widget.ImageView"));
	//if(p.equalsIgnoreCase("dresses"))
	//{
		for(int i=0;i<20;i++)
	{
		image.get(i).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Girls Pink Sleeveless All-Over Print Gown\"))").click();
		Thread.sleep(5000);
		
	}
	}
@Test(enabled=false)

public void positive2() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElementByAndroidUIAutomator("text(\"Girl\")").click();
	driver.findElementByAndroidUIAutomator("text(\"1-6 years\")").click();
	driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"))").click();
	Thread.sleep(5000);
	driver.findElements(MobileBy.className("android.widget.ImageView")).get(6).click();
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Girls Multi Coloured Unicorn Print Party Dress\").instance(0))"));
	//driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).get(2).click();
	int count=driver.findElements(MobileBy.id("android.widget.ImageView")).size();
			//System.out.println(count);
	for(int i=0;i<count;i++) {
		String pn=driver.findElements(MobileBy.id("in.hopscotch.android:id/productIcon")).get(i).getText();
		System.out.println(pn);
		if(pn.equalsIgnoreCase("Girls Multi Coloured Unicorn Print Party Dress")) {
			System.out.println(pn);
		//	driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			break;
		}
	}










}
		}



