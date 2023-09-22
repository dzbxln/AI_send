
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.google.gson.Gson;
import org.apache.commons.codec.digest.DigestUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Set;

/**
 * 元数据：
 * 文档：
 * 内容描述：
 *
 * @Author 邓泽彬
 * @Date 2023/8/23 16:39
 */
public class AImain {
    public static void main(String[] args) throws Exception {
        System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Users\\猫猫虫\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        // 引用cookie文档
        String cookieFilePath = "cookie.txt";
        BufferedReader reader = new BufferedReader(new FileReader(cookieFilePath));
        StringBuilder cookieJson = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            cookieJson.append(line);
        }
        reader.close();
        // 解析Cookie
        Gson gson = new Gson();
        Cookie[] cookies = gson.fromJson(cookieJson.toString(), Cookie[].class);
        chromeDriver.get("https://wx.mail.qq.com/");
        chromeDriver.manage().window().maximize();
        // 添加Cookie到浏览器实例
        for (Cookie c : cookies) {
            chromeDriver.manage().addCookie(c);
        }
        // 刷新页面，然后就自动进去了
        chromeDriver.navigate().refresh();
        try {
            WebElement switcher_plogin = new WebDriverWait(chromeDriver, Duration.ofSeconds(20)).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver input) {
                            return input.findElement(By.id("composebtn"));
                        }
                    }
            );
            switcher_plogin.click();
            chromeDriver.switchTo().frame(chromeDriver.findElement(By.id("mainFrame"))); // 绕过第一个覆盖页
            WebElement element = chromeDriver.findElement(By.id("toAreaCtrl"));
            element.click();
            element.findElement(By.className("js_input")).click();
            Thread.sleep(500);
            element.findElement(By.className("js_input")).sendKeys("1776252636@qq.com"); // 收件人
            Thread.sleep(500);
            WebElement subject = chromeDriver.findElement(By.id("subject"));
            subject.click();
            Thread.sleep(500);
            subject.sendKeys("餐饮外卖管理系统验证码：540068"); // 主题
            Thread.sleep(500);
            chromeDriver.switchTo().frame(chromeDriver.findElement(By.tagName("iframe"))); // 进入第二个覆盖页
            WebElement bodyTag = chromeDriver.findElement(By.tagName("body"));
            bodyTag.click();
            Thread.sleep(500);
            bodyTag.sendKeys("餐饮外卖管理系统验证码：540068"); // 正文
            Thread.sleep(500);
            chromeDriver.switchTo().defaultContent();// 回到最顶层页面
            chromeDriver.switchTo().frame(chromeDriver.findElement(By.id("mainFrame"))); // 再次进入第一个覆盖页
            WebElement toolbar = chromeDriver.findElement(By.id("toolbar"));
            toolbar.findElement(By.name("sendbtn")).click(); // 点击发送按钮


//            以下是登录部分，后面的验证码需要自己手动完成，用来获取cookie
//            Thread.sleep(5 * 1000);
//            chromeDriver.findElement(By.id("QQMailSdkTool_auto_login")).click();
//            chromeDriver.switchTo().frame(chromeDriver.findElement(By.className("QQMailSdkTool_login_loginBox_qq_iframe")));
//            chromeDriver.switchTo().frame(chromeDriver.findElement(By.id("ptlogin_iframe")));
//            chromeDriver.findElement(By.id("switcher_plogin")).click();
////                    .findElement(By.xpath("//*[@id=\"switcher_plogin\"]")).click();
//            Thread.sleep(1000);
//            chromeDriver.findElement(By.id("u")).sendKeys("3400670763");
//            Thread.sleep(500);
//            chromeDriver.findElement(By.id("p")).sendKeys("dzbbjj520");
//            Thread.sleep(500);
//            chromeDriver.findElement(By.id("login_button")).click();
            // 现在一分钟内手动登录完成
            // 然后把下面那部分代码运行，将登录cookie写入txt文档。然后注释掉代码。
            Thread.sleep(60 * 1000);
//            Set<Cookie> cookies = chromeDriver.manage().getCookies();
//
//            // 将Cookie写入文本文件
//            FileWriter writer = new FileWriter("cookie.txt");
//            Gson gson = new Gson();
//            writer.write(gson.toJson(cookies));
//            writer.close();
//            System.out.println("Cookie写入完成。");

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            chromeDriver.quit();
        }
    }
}
