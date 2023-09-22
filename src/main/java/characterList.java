import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 元数据：
 * 文档：
 * 内容描述：
 *
 * @Author 邓泽彬
 * @Date 2023/8/26 22:08
 */
public class characterList {
    private static List<String> otherCharacter = Arrays.asList(
            "girl",  // 女孩
            "loli",  // 萝莉
            "mesugaki",  // 目固め
            "adorable_girl",  // 可爱女孩
            "bishoujo",  // 美少女
            "gyaru",  // 出道女郎
            "sisters",  // 姐妹
            "ojousama",  // 千金小姐
            "female",  // 女性
            "mature_female",  // 成熟女性
            "mature",  // 成熟
            "female_pervert",  // 淫荡女性
            "milf"  // 辣妈
    );

    private static List<String> num = Arrays.asList(
            "1girl"  // 单个女孩
//            "2girls"  // 两个女孩
//            "3girls",  // 三个女孩
//            "multiple_girls" // 多个女孩
    );

    public static String character(){
        String character = "";
        Random random = new Random();
        int c = random.nextInt(otherCharacter.size());
        character += otherCharacter.get(c);
        int n = random.nextInt(num.size());
        character += num.get(n);
        return character;
    }

}
