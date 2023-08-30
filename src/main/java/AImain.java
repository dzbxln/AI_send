
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.List;

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
        System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Users\\公用\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--disable-gpu");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://huitu.xianyun.cool/");
        chromeDriver.manage().window().maximize();
//        EventFiringWebDriver eventDriver = new EventFiringWebDriver(chromeDriver);
//        eventDriver.register(new CustomWebDriverEventListener());
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
        try {
            // 当登录界面出现10s后
            WebElement loginElement2 = new WebDriverWait(chromeDriver, Duration.ofSeconds(10).toMillis()).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver webDriver) {
                            return webDriver.findElement(By.xpath("//*[@class=\"scroll-hide svelte-1pie7s6\"]"));
                        }
                    });
            List<WebElement> elements = chromeDriver.findElements(By.xpath("//*[@class=\"scroll-hide svelte-1pie7s6\"]"));
            if (elements != null && elements.size() > 0) {
                elements.get(0).sendKeys("tempest");
                elements.get(1).sendKeys("StormySky$2023");
                chromeDriver.findElement(By.xpath("//*[@class=\"lg primary svelte-1ipelgc\"]")).click();
            }
            // 当关键字文本框出现10s后
            WebElement loginElement = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver webDriver) {
                            return webDriver.findElement(By.xpath("//*[@class=\"scroll-hide svelte-4xt1ch input-tag-append autocomplete\"]"));
                        }
                    });

            // 获取所有的Cookie
            java.util.Set<Cookie> allCookies = chromeDriver.manage().getCookies();
            Cookie cookies = null;
            Cookie cookies1 = null;
            int i = 0;
            // 打印每个Cookie的信息
            for (Cookie cookie : allCookies) {
                if (i == 0)
                    cookies = cookie;
                else
                    cookies1 =cookie;
                i++;
            }
            String cookie = cookies.getName()+"="+cookies.getValue()+";"+cookies1.getName()+"="+cookies1.getValue();

            List<WebElement> elements2 = chromeDriver.findElements(By.xpath("//*[@class=\"scroll-hide svelte-4xt1ch input-tag-append autocomplete\"]"));
            elements2.get(0).click();
            String send = "huge filesize,colorful,art-book,light_blush,breasts,gyaru,barefoot,(wide_shot),((full_shot)),";
            send += hairList.hair();
            send += eyesList.eyes();
            send += characterList.character();
            elements2.get(0).sendKeys(send);
            Thread.sleep(2000);
            elements2.get(0).sendKeys(Keys.ENTER);
            Thread.sleep(2000);

            elements2.get(1).click();
            elements2.get(1).sendKeys("((ugly))),(((duplicate))),((morbid)),((mutilated)),(((tranny)))," +
                    "(((trans))),((trannsexual))),(((mutation))),(((deformed)))(((long neck))),((bad anatomy))(((bad proportions))),(((extra arms))),(((extra legs))), " +
                    "(((disfigured))),((more than 2 nipples))),malformed,mutated,(hermaphrodite),((extra limbs)).((missing arms)).((missing legs)).((poorly drawn hands))((poorty drawn face))," +
                    "(mutation,poorly drawn :1.2),(long body :1.3).multiple breasts,cloned face,gross proportions, mutated hands,bad hands,bad feet,long neck,missing limb," +
                    "(malformed limbs),malformed hands,(fused fingers).(too many fingers),extra fingers,missing fingers,extra digit,fewer digits,(mutated hands and fingers :1.5)," +
                    "low res,text,error,cropped,worst quality,low quality,normal quality,jpeg artifacts,signature,watermark,username,blurry,text font ui,futa,yaoi,");
            Thread.sleep(2000);
            elements2.get(1).sendKeys(Keys.ENTER);
            Thread.sleep(2000);

            WebElement range_id_2 = chromeDriver.findElement(By.id("range_id_2"));
            int size = range_id_2.getSize().width;
            Actions action = new Actions(chromeDriver);
            action.clickAndHold(range_id_2).perform();
            action.dragAndDropBy(range_id_2, size, 0);
            Thread.sleep(2000);
            chromeDriver.findElement(By.xpath("//*[@class=\"lg primary gradio-button svelte-1ipelgc\"]")).click();

            // 图片生成后
            WebElement loginElement3 = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver webDriver) {
                            return webDriver.findElement(By.xpath("//*[@class=\"svelte-g4rw9\"]"));
                        }
                    });
            Thread.sleep(2000);

            // 进入以图绘图
            chromeDriver.findElementById("img2img_tab").click();
            // 确认跳转完成
            WebElement loginElementImg = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver webDriver) {
                            return webDriver.findElement(By.xpath("//*[@class=\"svelte-p3y7hu\"]"));
                        }
                    });
            WebElement element = chromeDriver.findElement(By.id("component-1197"));
            List<WebElement> elements1 = element.findElements(By.className("svelte-1cl284s"));
            System.out.println(elements1.size());
//            List<WebElement> elements1 = chromeDriver.findElements(By.xpath("//*[@class=\"svelte-1cl284s\"]"));
//            elements1.get(elements1.size() - 2).click();
//            elements1.get(elements1.size() - 1).click();
            Thread.sleep(2000);
//            chromeDriver.findElementById("img2img_generate").click();
            WebElement loginElement6 = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver webDriver) {
                            return webDriver.findElement(By.xpath("//*[@class=\"lg primary gradio-button svelte-1ipelgc\"]"));
                        }
                    });
            List<WebElement> elements3 = chromeDriver.findElements(By.xpath("//*[@class=\"lg primary gradio-button svelte-1ipelgc\"]"));
            System.out.println(elements3.size());
            elements3.get(elements3.size() - 1).click();
            // 图片生成后
            WebElement loginElementImg2 = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver webDriver) {
                            return webDriver.findElement(By.xpath("//*[@class=\"svelte-g4rw9\"]"));
                        }
                    });
            // 确定保存按钮的存在
            chromeDriver.findElementById("save_txt2img").click();
            WebElement loginElement4 = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                    new ExpectedCondition<WebElement>() {
                        @Override
                        public WebElement apply(WebDriver webDriver) {
                            return webDriver.findElement(By.xpath("//*[@class=\"download svelte-xrr240\"]"));
                        }
                    });
            String url = loginElement4.findElement(By.tagName("a")).getAttribute("href");
            URL url1 = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
            connection.setRequestProperty("Cookie", cookie);
            InputStream inputStream = connection.getInputStream();
            byte[] bytes = toByteArray(inputStream);
            String base64Image = Base64.getEncoder().encodeToString(bytes);
            inputStream.close();

            JSONObject paramJson = new JSONObject();
            paramJson.putOpt("msgtype", "image");

            //url路径
            URL url2=new URL(url);
            //获取连接
            HttpURLConnection connection1=(HttpURLConnection)url2.openConnection();
            connection1.setConnectTimeout(3*1000);
            //设置请求头
            connection1.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.110 Safari/537.36");
            connection1.setRequestProperty("Cookie", cookie);
            InputStream inputStream1 = connection1.getInputStream();
            String md5 = DigestUtils.md5Hex(inputStream1);

            JSONObject image = new JSONObject().putOpt("base64",base64Image).putOpt("md5",md5);
            paramJson.putOpt("image",image);
            JSONObject sendRe = JSONUtil.parseObj(HttpUtil.post("https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=a5ad8503-dc80-4d0a-adb9-8421dc0d7e2e", paramJson.toString()));
            System.out.println(sendRe);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
//            Thread.sleep(2*60*1000);
            chromeDriver.quit();
        }
    }

    private static byte[] toByteArray(InputStream inputStream) throws Exception {
        byte[] buffer = new byte[1024];
        int len;
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
;            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            return outputStream.toByteArray();
        }
    }

    // 自定义 WebDriverEventListener
    static class CustomWebDriverEventListener implements WebDriverEventListener {

        @Override
        public void beforeAlertAccept(WebDriver webDriver) {

        }

        @Override
        public void afterAlertAccept(WebDriver webDriver) {

        }

        @Override
        public void afterAlertDismiss(WebDriver webDriver) {

        }

        @Override
        public void beforeAlertDismiss(WebDriver webDriver) {

        }

        @Override
        public void beforeNavigateTo(String url, WebDriver driver) {
            // 执行导航之前的操作
        }

        @Override
        public void afterNavigateTo(String url, WebDriver driver) {
            // 执行导航之后的操作
        }

        @Override
        public void beforeNavigateBack(WebDriver webDriver) {

        }

        @Override
        public void afterNavigateBack(WebDriver webDriver) {

        }

        @Override
        public void beforeNavigateForward(WebDriver webDriver) {

        }

        @Override
        public void afterNavigateForward(WebDriver webDriver) {

        }

        @Override
        public void beforeNavigateRefresh(WebDriver webDriver) {

        }

        @Override
        public void afterNavigateRefresh(WebDriver webDriver) {

        }

        @Override
        public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

        }

        @Override
        public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

        }

        @Override
        public void beforeClickOn(WebElement webElement, WebDriver webDriver) {

        }

        @Override
        public void afterClickOn(WebElement webElement, WebDriver webDriver) {

        }

        @Override
        public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

        }

        @Override
        public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

        }

        @Override
        public void beforeScript(String s, WebDriver webDriver) {

        }

        // 其他监听器方法...

        @Override
        public void afterScript(String script, WebDriver driver) {
            // 当执行脚本后，检查浏览器是否关闭，然后关闭驱动
            if (driver instanceof ChromeDriver && !driver.getWindowHandles().isEmpty()) {
                // 如果浏览器仍处于打开状态，不关闭驱动
                return;
            }
            driver.quit();
        }

        @Override
        public void beforeSwitchToWindow(String s, WebDriver webDriver) {

        }

        @Override
        public void afterSwitchToWindow(String s, WebDriver webDriver) {

        }

        @Override
        public void onException(Throwable throwable, WebDriver webDriver) {

        }

        @Override
        public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

        }

        @Override
        public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

        }

        @Override
        public void beforeGetText(WebElement webElement, WebDriver webDriver) {

        }

        @Override
        public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

        }
    }
}
