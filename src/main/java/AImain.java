
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
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
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
        String oris;
        do {
            System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Users\\34006\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
//        chromeOptions.addArguments("--disable-gpu");
            ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
            chromeDriver.get("https://huitu.xianyun.cool/");
            chromeDriver.manage().window().maximize();
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
                    elements.get(0).sendKeys("enigma");
                    elements.get(1).sendKeys("MysteriousEnigma%12");
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
                        cookies1 = cookie;
                    i++;
                }
                String cookie = cookies.getName() + "=" + cookies.getValue() + ";" + cookies1.getName() + "=" + cookies1.getValue();

                List<WebElement> elements2 = chromeDriver.findElements(By.xpath("//*[@class=\"scroll-hide svelte-4xt1ch input-tag-append autocomplete\"]"));
                elements2.get(0).click();
//                Scanner scanner = new Scanner(System.in);
//                String shuru = scanner.next();
                //white_bodystocking,black_pantyhose,black_bodystocking,wide_shot,
                String send = "nsfw,(((incredibly absurdres))),((huge filesize)),art-book,light_blush,off-shoulder shirt,medium breasts,gyaru,((white_stirrup_legwear)),(legs),unbuttoned clothes,";
                send += hairList.hair();
                send += eyesList.eyes();
                send += characterList.character();
                elements2.get(0).sendKeys(send);
//                elements2.get(0).sendKeys(shuru);
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

                List<WebElement> elements3 = chromeDriver.findElement(By.id("tab_txt2img")).findElement(By.id("txt2img_steps"))
                        .findElements(By.className("svelte-1cl284s"));
                elements3.get(2).clear();
                elements3.get(2).sendKeys("80");
                Thread.sleep(200);
                List<WebElement> elements6 = chromeDriver.findElement(By.id("tab_txt2img")).findElement(By.id("txt2img_column_size"))
                        .findElement(By.id("txt2img_width")).findElements(By.className("svelte-1cl284s"));
                elements6.get(2).clear();
                elements6.get(2).sendKeys("1080");
                Thread.sleep(200);
                List<WebElement> elements7 = chromeDriver.findElement(By.id("tab_txt2img")).findElement(By.id("txt2img_column_size"))
                        .findElement(By.id("txt2img_height")).findElements(By.className("svelte-1cl284s"));
                elements7.get(2).clear();
                elements7.get(2).sendKeys("1080");

                chromeDriver.findElement(By.id("txt2img_seed")).findElement(By.xpath("//*[@class=\"svelte-og1zwl\"]")).clear();
                Thread.sleep(200);
                chromeDriver.findElement(By.id("txt2img_seed")).findElement(By.xpath("//*[@class=\"svelte-og1zwl\"]")).sendKeys("18319234825");
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
                Thread.sleep(2000);
                WebElement tab_img2img = chromeDriver.findElementById("tab_img2img");
                // 确认跳转完成
                WebElement loginElementImg = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                        new ExpectedCondition<WebElement>() {
                            @Override
                            public WebElement apply(WebDriver webDriver) {
                                return tab_img2img.findElement(By.xpath("//*[@class=\"svelte-p3y7hu\"]"));
                            }
                        });
                List<WebElement> element2 = tab_img2img.findElement(By.id("img2img_settings"))
                        .findElement(By.id("sampler_selection_img2img"))
                        .findElement(By.id("img2img_steps")).findElements(By.className("svelte-1cl284s"));
                element2.get(2).clear();
                element2.get(2).sendKeys("80");
                Thread.sleep(200);
                List<WebElement> elements4 =
                        tab_img2img.findElement(By.id("img2img_column_size")).findElement(By.id("img2img_width")).findElements(By.className("svelte-1cl284s"));
                elements4.get(2).clear();
                elements4.get(2).sendKeys("1080");
                Thread.sleep(200);
                List<WebElement> elements5 = tab_img2img.findElement(By.id("img2img_column_size")).findElement(By.id("img2img_height")).findElements(By.className("svelte-1cl284s"));
                elements5.get(2).clear();
                elements5.get(2).sendKeys("1080");
                Thread.sleep(200);
//                WebElement element = tab_img2img.findElement(By.id("component-4149"));
//                List<WebElement> elements1 = element.findElements(By.className("svelte-1cl284s"));
//                elements1.get(10).clear();
//                elements1.get(10).sendKeys("0.2");// 重绘幅度
//                Thread.sleep(200);
//                elements1.get(2).clear();
//                elements1.get(2).sendKeys("7");//提示词占比
                List<WebElement> img2img_cfg_scale = tab_img2img.findElement(By.id("img2img_cfg_scale")).findElements(By.className("svelte-1cl284s"));
                img2img_cfg_scale.get(2).clear();
                img2img_cfg_scale.get(2).sendKeys("7");
                Thread.sleep(200);
                List<WebElement> img2img_denoising_strength = tab_img2img.findElement(By.id("img2img_denoising_strength")).findElements(By.className("svelte-1cl284s"));
                img2img_denoising_strength.get(2).clear();
                img2img_denoising_strength.get(2).sendKeys("0.3");
                Thread.sleep(200);
                WebElement element1 = tab_img2img.findElement(By.id("img2img_toprow"))
                        .findElement(By.id("img2img_actions_column"))
                        .findElement(By.id("img2img_generate_box"))
                        .findElement(By.id("img2img_generate"));
                System.out.println(element1.getTagName());
                element1.click();
                // 图片生成后
                Thread.sleep(90 * 1000);
                // 确定保存按钮的存在
                tab_img2img.findElement(By.id("save_img2img")).click();
                WebElement loginElement4 = new WebDriverWait(chromeDriver, Duration.ofSeconds(5).toMillis()).until(
                        new ExpectedCondition<WebElement>() {
                            @Override
                            public WebElement apply(WebDriver webDriver) {
                                return tab_img2img.findElement(By.xpath("//*[@class=\"download svelte-xrr240\"]"));
                            }
                        });
                String url = loginElement4.findElement(By.tagName("a")).getAttribute("href");
                URL url1 = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
                connection.setRequestProperty("Cookie", cookie);
                InputStream inputStream = connection.getInputStream();
                String saveDirectory = "C:\\Users\\34006\\Desktop\\AI绘图\\";
                String fileName = getFileNameFromUrl(url1);
                String savePath = saveDirectory + fileName;
                OutputStream outputStream = new FileOutputStream(savePath);
                byte[] buffer = new byte[2048];
                int length;
                while ((length = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, length);
                }
                inputStream.close();
                outputStream.close();
                System.out.println("图片下载完成并保存");
                System.out.println("是否发送？");
                Scanner input = new Scanner(System.in);
                oris = input.next();
                if ("y".equals(oris) || "Y".equals(oris)) {
                    URL url11 = new URL(url);
                    HttpURLConnection connection1 = (HttpURLConnection) url11.openConnection();
                    connection1.setRequestProperty("Cookie", cookie);
                    InputStream inputStream1 = connection1.getInputStream();
                    byte[] bytes = toByteArray(inputStream1);
                    String base64Image = Base64.getEncoder().encodeToString(bytes);
                    inputStream.close();

                    JSONObject paramJson = new JSONObject();
                    paramJson.putOpt("msgtype", "image");

                    //url路径
                    URL url2 = new URL(url);
                    //获取连接
                    HttpURLConnection connection2 = (HttpURLConnection) url2.openConnection();
                    connection2.setConnectTimeout(3 * 1000);
                    //设置请求头
                    connection2.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.110 Safari/537.36");
                    connection2.setRequestProperty("Cookie", cookie);
                    InputStream inputStream2 = connection2.getInputStream();
                    String md5 = DigestUtils.md5Hex(inputStream2);

                    JSONObject image = new JSONObject().putOpt("base64", base64Image).putOpt("md5", md5);
                    paramJson.putOpt("image", image);
                    JSONObject sendRe = JSONUtil.parseObj(HttpUtil.post("https://qyapi.weixin.qq.com/cgi-bin/webhook/send?key=a5ad8503-dc80-4d0a-adb9-8421dc0d7e2e", paramJson.toString()));
                    System.out.println(sendRe);
                }else
                    inputStream.close();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                chromeDriver.quit();
                Thread.sleep(1000);
            }
        } while (!"退出".equals(oris));
    }

    private static byte[] toByteArray(InputStream inputStream) throws Exception {
        byte[] buffer = new byte[1024];
        int len;
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            ;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            return outputStream.toByteArray();
        }
    }

    private static String getFileNameFromUrl(URL url) {
        String urlString = url.toString();
        return urlString.substring(urlString.lastIndexOf('/') + 1);
    }

}
