package day05;

/*
* 1.枚举类的理解：类的对象只有有限个，确定的。我们称此类为枚举类
* 2.当需要定义一组常量时，强烈建议使用枚举类
* 3.如果枚举类中只有一个对象，则可以作为单例模式的实现方式。
* 二、如何定义枚举类
* 方式一：jdk5.0之前，自定义枚举类
* 方式二：jdk5.0时，可以使用enum关键字定义枚举类
* */
public class SeasonTest {
    Season season=Season.SPRING;
}
//自定义枚举类
class Season
{
    private final String seasonName;
    private final String seasonDesc;

//    私有化构造器
    private Season(String seasonName,String seasonDesc)
    {
        this.seasonDesc=seasonDesc;
        this.seasonName=seasonName;
    }
//    3.提供当前枚举类的多个对象
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏暖花开");
    public static final Season AUTUMN=new Season("秋天","秋暖花开");
    public static final Season WINTER=new Season("冬天","冬暖花开");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public static Season getSPRING() {
        return SPRING;
    }

    public static Season getSUMMER() {
        return SUMMER;
    }

    public static Season getAUTUMN() {
        return AUTUMN;
    }

    public static Season getWINTER() {
        return WINTER;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
