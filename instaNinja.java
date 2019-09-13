package calC;

import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class instaNinja {
	public static AppiumDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
//		Insta_ninja a=new Insta_ninja();
//		a.connectServer("ultron","192.168.1.8:5555","Android","6.0.1");
//		a.App_info("com.instagram.android","com.instagram.mainactivity.MainActivity");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "ultron");
		cap.setCapability("udid", "192.168.1.8:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("appPackage", "com.instagram.android");
		cap.setCapability("appActivity", "com.instagram.mainactivity.MainActivity");
		cap.setCapability("noSign", true);
		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<MobileElement>driver=new AppiumDriver<MobileElement>(url,cap);
//		                                                       ******************login button*******************
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("com.instagram.android:id/log_in_button")).click();
//		                                                       *****************login credentials***************
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("com.instagram.android:id/login_username")).sendKeys("ninjatester101@gmail.com");
		driver.findElement(By.id("com.instagram.android:id/password")).sendKeys("ninjatester@101");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//		                                                        ***************InstaStory{Text}*****************
//		String story_text="Hey World!,This is NinjaTester101";
//		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Profile\"]")).click();
//		driver.findElement(By.id("com.instagram.android:id/row_profile_header_imageview")).click();		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.LinearLayout")).click();
//				for(int i=0;i<4;i++){
//					driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
//					driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);}
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"TYPE\"]")).click();
//		driver.findElement(By.id("com.instagram.android:id/text_to_cam_edit_text")).sendKeys(story_text);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.ImageView")).click();
//		driver.findElement(By.id("com.instagram.android:id/recipients_picker_button")).click();
//		driver.findElement(By.id("com.instagram.android:id/selectable_user_row_send_button_text_view")).click();
//		driver.findElement(By.id("com.instagram.android:id/button_send")).click();
				
//		                                                        *********************Follow***********************
		String username="_loksa";
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Search and Explore\"]")).click();
		driver.findElement(By.id("com.instagram.android:id/action_bar_search_edit_text")).click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.instagram.android:id/action_bar_search_edit_text")).sendKeys(username);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")).click();
		String headername = driver.findElement(By.id("com.instagram.android:id/profile_header_full_name")).getText();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Follow "+headername+" button\"]")).click();
		
		
//		                                                        ********Send message without following them*******
//		driver.findElement(By.id("com.instagram.android:id/action_bar_overflow_icon")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[5]/android.widget.LinearLayout")).click();
//		driver.findElement(By.id("com.instagram.android:id/row_thread_composer_edittext")).sendKeys("Jay Mata Ji ki, Bnna!!");
//		driver.findElement(By.id("com.instagram.android:id/row_thread_composer_button_send")).click();

		
		
	}}