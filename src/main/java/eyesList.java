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
    private static List<String> Eyes_corol = Arrays.asList(
            "blue eyes,",  // 蓝色的眼睛
            "red eyes,",  // 红色的眼睛
            "brown eyes,",  // 棕色的眼睛
            "green eyes,",  // 绿色的眼睛
            "purple eyes,",  // 紫色的眼睛
            "yellow eyes,",  // 黄色的眼睛
            "pink eyes,",  // 粉色的眼睛
            "gradient eyes,",  // 渐变色的眼睛
            "white eyes,",  // 白色的眼睛
            "multicolored eyes,",  // 多彩的眼睛
            "grey eyes,",  // 灰色的眼睛
            "orange eyes,",  // 橙色的眼睛
            "aqua eyes,",  // 水蓝色的眼睛
            "black eyes,",  // 黑色的眼睛
            "orange eyes,",  // 橙色的眼睛
            "grey eyes,",  // 灰色的眼睛
            "multicolored eyes,",  // 多彩的眼睛
            "white eyes,",  // 白色的眼睛
            "gradient eyes,",  // 渐变色的眼睛
            "crazy eyes,",  // 疯狂的眼睛
            "extra eyes,",  // 额外的眼睛
            "sparkling eyes,",  // 闪闪发光的眼睛
            "cephalopod eyes,", // 章鱼类动物的眼睛
            "no eyes,",  // 没有眼睛
            "sparkling eyes,",  // 闪闪发光的眼睛
            "extra eyes,",  // 额外的眼睛
            "crazy eyes,",  // 疯狂的眼睛
            "solid circle eyes,",  // 实心圆形眼睛
            "solid oval eyes,",  // 实心椭圆形眼睛
            "uneven eyes,",  // 不对称的眼睛
            "green eyeshadow,",  // 绿色眼影
            "pink eyeshadow,",  // 粉色眼影
            "purple eyeshadow,",  // 紫色眼影
            "blue eyeshadow,",  // 蓝色眼影
            "red eyeshadow,",  // 红色眼影
            "eyeshadow,",  // 眼影
            "blood from eyes,",  // 从眼睛流血
            "bags under eyes,",  // 眼袋
            "ringed eyes,",  // 眼睛周围有环状的图案
            "covered eyes,",  // 被遮盖的眼睛
            "covering eyes,",  // 遮住眼睛
            "shading eyes,",  // 给眼睛上色
            "devil eyes,",  // 恶魔眼睛
            "slit pupils,",  // 缝隙状瞳孔
            "pupils sparkling,",  // 瞳孔闪烁
            "snake pupils,",  // 蛇状瞳孔
            "devil pupils,",  // 恶魔瞳孔
            "constricted pupils,",  // 收缩的瞳孔
            "tareme,",  // 垂目
            "tsurime,",  // 弯曲目光
            "bloodshot eyes,",  // 充血的眼睛
            "flower-shaped pupils,",  // 花朵状瞳孔
            "heart-shaped pupils,",  // 心形瞳孔
            "heterochromia,",  // 异色瞳孔
            "color contact lenses,",  // 彩色隐形眼镜
            "longeyelashes,",  // 长睫毛
            "colored eyelashes,",  // 彩色睫毛
            "mole under eye,",  // 眼睛下的痣
            "water_eyes,",  // 水之眼
            "anime_style_eyes,",  // 动漫风格的眼睛
            "gradient_eyes,",  // 渐变色的眼睛
            "sparkling_eyes,",  // 闪闪发光的眼睛
            "shiny_eyes,",  // 闪亮的眼睛
            "glowing_eye,",  // 发光的眼睛
            "light_eyes,"  // 明亮的眼睛
    );
    private static List<String> Eyes_style = Arrays.asList(
            "button eyes,",  // 圆形凸起按钮状的眼睛
            "heart-shaped eyes,",  // 心形的眼睛
            "cephalopod eyes,",  // 章鱼类动物的眼睛
            "eyes visible through hair,",  // 透过头发可见的眼睛
            "glowing eyes,",  // 发光的眼睛
            "empty eyes,",  // 空洞的眼睛
            "rolling eyes,",  // 翻白眼
            "uneven eyes,"  // 不对称的眼睛

    );
    private static List<String> Eyes_action = Arrays.asList(
            "closed eyes,",  // 闭着的眼睛
            "half-closed eyes,",  // 半闭的眼睛
            "hidden eyes,",  // 隐藏的眼睛
            "narrowed eyes,",  // 眯起的眼睛
            "crying with eyes open,",  // 眼睛睁着哭泣
            "half-closed eyes,",  // 半闭的眼睛
            "closed eyes,",  // 闭着的眼睛
            "cross eyed,",  // 斜视
            "solid oval eyes,",  // 实心椭圆形眼睛
            "solid circle eyes," // 实心圆形眼睛
    );
    private static List<String> Eyes_emo = Arrays.asList(
            "blank eyes," // 茫然的眼睛
    );

    public static String eyes(){
        String eye = "";
        Random random = new Random();
        int corol = random.nextInt(Eyes_corol.size());
        eye += Eyes_corol.get(corol);
        int length = random.nextInt(Eyes_corol.size());
        eye += Eyes_corol.get(length);
        int style = random.nextInt(Eyes_corol.size());
        eye += Eyes_corol.get(style);
        int bangs = random.nextInt(Eyes_corol.size());
        eye += Eyes_corol.get(bangs);
        return eye;
    }

}
