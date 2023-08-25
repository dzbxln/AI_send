import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 元数据：
 * 文档：
 * 内容描述：
 *
 * @Author 邓泽彬
 * @Date 2023/8/24 16:56
 */
public class hairList {
    private static List<String> Hair_corol = Arrays.asList(
            "white hair,",
            "blonde hair,",
            "silver hair,",
            "grey hair,",
            "purple hair,",
            "red hair,",
            "yellow hair,",
            "green hair,",
            "blue hair,",
            "black hair,",
            "brown hair,",
            "two-tone hair,",
            "multicolored hair,",
            "light brown hair,",
            "grey gradient hair,",
            "hair pink flowers,",
            "streaked hair,");

    private static List<String> Hair_length = Arrays.asList(
            "short hair,",
            "long hair,",
            "medium hair,",
            "very long hair,"
    );

    private static List<String> Hair_style = Arrays.asList(
            "straight hair,",
            "curly hair,",
            "pony-tail,",
            "bunches,",
            "high ponytail,",
            "twintails,",
            "braided ponytail,",
            "ponytail,",
            "short ponytail,",
            "twin braids,",
            "hair wings",
            "disheveled hair,",
            "wavy hair,",
            "Side ponytail,",
            "hair in takes,",
            "drill hair,",
            "hair bun,",
            "double bun,",
            "messy hair,",
            "hair_flaps,"
    );

    private static List<String> Hair_bangs = Arrays.asList(
            "braided bangs,",
            "swept bangs,",
            "hair between eyes,",
            "bob cut,",
            "hime cut,",
            "crossed bangs,",
            "bangs,",
            "blunt bangs,",
            "air bangs,",
            "long bangs,",
            "side_blunt_bangs,",
            "centre parting bangs,",
            "asymmetric bangs,",
            "ahoge,antenna hair,",
            "forehead,"
    );

    public static String hair(){
        String Hair = "";
        Random random = new Random();
        int corol = random.nextInt(Hair_corol.size());
        Hair += Hair_corol.get(corol);
        int length = random.nextInt(Hair_length.size());
        Hair += Hair_length.get(length);
        int style = random.nextInt(Hair_style.size());
        Hair += Hair_style.get(style);
        int bangs = random.nextInt(Hair_bangs.size());
        Hair += Hair_bangs.get(bangs);
        return Hair;
    }
}
