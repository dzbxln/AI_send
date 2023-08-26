import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 元数据：
 * 文档：
 * 内容描述：10
 *
 * @Author 邓泽彬
 * @Date 2023/8/25 9:39
 */
public class eyesList {
    private static List<String> eyeColors = Arrays.asList(
            "blue eyes,",        // 蓝色的眼睛
            "red eyes,",         // 红色的眼睛
            "brown eyes,",       // 棕色的眼睛
            "green eyes,",       // 绿色的眼睛
            "purple eyes,",      // 紫色的眼睛
            "yellow eyes,",      // 黄色的眼睛
            "pink eyes,",        // 粉色的眼睛
            "gradient eyes,",    // 渐变色的眼睛
            "white eyes,",       // 白色的眼睛
            "multicolored eyes,",// 多彩的眼睛
            "grey eyes,",        // 灰色的眼睛
            "orange eyes,",      // 橙色的眼睛
            "aqua eyes,",        // 水蓝色的眼睛
            "black eyes,",       // 黑色的眼睛
            "glowing_eye,",      // 发光的眼睛
            "shiny_eyes,",       // 闪亮的眼睛
            "sparkling_eyes,",   // 闪耀的眼睛
            "gradient_eyes,",    // 渐变色的眼睛
            "anime_style_eyes,", // 动漫风格的眼睛
            "water_eyes,",       // 水之眼
            "multicolored_eyes,",// 多彩的眼睛
            "aqua_eyes,",        // 水蓝色的眼睛
            "devil_eyes"         // 恶魔眼睛
    );

    private static List<String> eyeShadows = Arrays.asList(
            "green eyeshadow,",  // 绿色眼影
            "pink eyeshadow,",   // 粉色眼影
            "purple eyeshadow,", // 紫色眼影
            "blue eyeshadow,",   // 蓝色眼影
            "red eyeshadow,",    // 红色眼影
            "eyeshadow"          // 眼影
    );

    private static List<String> eyePatterns = Arrays.asList(
            "bags under eyes,",  // 眼袋
            "ringed eyes,",      // 环绕的眼睛
            "covered eyes,",     // 覆盖的眼睛
            "covering eyes,",    // 遮住的眼睛
            "shading eyes,",     // 遮蔽眼睛
            "devil eyes"         // 恶魔眼睛
    );

    private static List<String> pupilVariations = Arrays.asList(
            "slit pupils,",          // 缝隙瞳孔
            "pupils sparkling,",     // 闪闪发光的瞳孔
            "snake pupils,",          // 蛇瞳
            "devil pupils,",          // 恶魔瞳孔
            "constricted pupils,",    // 收缩瞳孔
            "tareme,",               // 垂れ目
            "tsurime,",               // ツリ目
            "flower-shaped pupils,", // 花形瞳孔
            "heart-shaped pupils,",  // 心形瞳孔
            "heterochromia,",        // 异色瞳孔
            "color contact lenses"   // 彩色隐形眼镜
    );

    private static List<String> eyelashStyles = Arrays.asList(
            "long eyelashes,",     // 长睫毛
            "colored eyelashes"    // 彩色睫毛
    );

    private static List<String> otherEyeFeatures = Arrays.asList(
            "mole under eye,",             // 眼睛下的痣
            "water eyes,",                 // 水眼
            "anime style eyes,",           // 动漫风格的眼睛
            "shiny eyes,",                 // 闪亮的眼睛
            "glowing eye,",                // 发光的眼睛
            "light eyes",                  // 光明的眼睛
            "beautiful detailed eyes,",    // 美丽的细节眼睛
            "solid oval eyes,",            // 实心椭圆眼睛
            "solid circle pupils,",        // 实心圆瞳孔
            "blush stickers,",             // 腮红贴纸
            "heart in eye,",               // 眼中的心形
            "eye reflection,",            // 眼睛映射
            "clock eyes,",                // 时钟眼睛
            "solid eyes,",                // 实心眼睛
            "sparkling anime eyes,",      // 闪亮的动漫眼睛
            "closed eyes,",               // 闭眼
            "crying with eyes open,",     // 睁开眼睛哭泣
            "eyeliner,",                  // 眼线
            "eye of horus,",              // 荷鲁斯之眼
            "glint,",                     // 闪光
            "half-closed eye,",           // 半闭的眼睛
            "flaming eye,",               // 火焰之眼
            "ahegao,",                    // 阿嘿脸
            "hair over eyes,",            // 遮住眼睛的头发
            "eyes visible through hair"   // 透过头发可见的
    );

    private static List<String> eyeActions = Arrays.asList(
            "closed eyes,",               // 闭眼
            "half-closed eyes,",          // 半闭的眼睛
            "hidden eyes,",               // 隐藏的眼睛
            "narrowed eyes,",             // 眯起的眼睛
            "crying with eyes open,",     // 睁开眼睛哭泣
            "half-closed eyes,"          // 半闭的眼睛
    );

    public static String eyes() {
        String eye = "";
        Random random = new Random();
        int num = random.nextInt(eyeColors.size());
        eye += eyeColors.get(num);
        if ((Math.random() < 0.5)) {
            num = random.nextInt(eyeShadows.size());
            eye += eyeShadows.get(num);
        }
        if ((Math.random() < 0.5)) {
            num = random.nextInt(eyePatterns.size());
            eye += eyePatterns.get(num);
        }
        num = random.nextInt(pupilVariations.size());
        eye += pupilVariations.get(num);
        if ((Math.random() < 0.5)) {
            num = random.nextInt(eyelashStyles.size());
            eye += eyelashStyles.get(num);
        }
        if ((Math.random() < 0.5)) {
            num = random.nextInt(otherEyeFeatures.size());
            eye += otherEyeFeatures.get(num);
        }
        if ((Math.random() < 0.5)) {
            num = random.nextInt(eyeActions.size());
            eye += eyeActions.get(num);
        }
        return eye;
    }

}
