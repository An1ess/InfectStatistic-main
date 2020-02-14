import java.util.HashMap;
import java.util.Map;

public class People {
    public int[] province=new int[36];
    public int[] province_deadpeople=new int[36];
    public int[] province_curepeople=new int[36];
    public int[] province_doubtpeople=new int[36];
    public int[] province_infectpeople=new int[36];
    String[] province2={
            "全国", "安徽", "北京", "重庆",
            "福建","甘肃","广东", "广西",
            "贵州", "海南", "河北", "河南",
            "黑龙江", "湖北", "湖南", "吉林",
            "江苏", "江西", "辽宁", "内蒙古",
            "宁夏", "青海", "山东", "山西",
            "陕西", "上海","四川", "天津",
            "西藏", "新疆", "云南", "浙江"
    };
    Map<String,Integer> map=new HashMap<String,Integer>();//创建哈希表
    People() {
        for (int i = 0; i < 36; i++) {
            province[i] = i;
            province_curepeople[i] = 0;
            province_deadpeople[i] = 0;
            province_doubtpeople[i] = 0;
            province_infectpeople[i] = 0;
        }
        for(int i=0;i<36;i++){//将省份以及对应数字连接起来
            map.put(province2[i],province[i]);
        }
    }
}
