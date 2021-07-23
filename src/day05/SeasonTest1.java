package day05;

/*
* 使用enum关键字定义
* */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer=Season1.SUMMER;
        System.out.println(summer);
    }


}
interface Info{
    void show();
}
enum Season1 implements Info
{
    SPRING("春天","1"),
    SUMMER("夏天","1"),
    AUTUMN("秋天","1"),
    WINTER("冬天","1");
    //    私有化构造器
    private final String seasonName;
    private final String seasonDesc;
    private Season1(String seasonName,String seasonDesc)
    {
        this.seasonDesc=seasonDesc;
        this.seasonName=seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public static Season1 getSPRING() {
        return SPRING;
    }

    public static Season1 getSUMMER() {
        return SUMMER;
    }

    public static Season1 getAUTUMN() {
        return AUTUMN;
    }

    public static Season1 getWINTER() {
        return WINTER;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    public void show() {
        System.out.println("这是一个季节");
    }
}
