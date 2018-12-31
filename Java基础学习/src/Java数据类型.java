public class Java数据类型 {

    public static void main(String[] args) {
        /*
        Java基础数据类型分为4种8类
        整数型：
            byte：占一个字节，-128到127
            short：占2个字节，-2^15到2^15-1
            int：占4个字节，-2^31到2^31-1
            long：占8个字节，-2^63到2^63-1
        浮点型：
            float:占4个字节，-3.403E38~3.403E38，单精度
            double:占8个字节，-1.798E308~1.798E308，双精度
        字符型：
            char：占2个字节，0~65535
        布尔型：
            boolean：理论上只占1位(bit)，实际上做变量是占4个字节，在数组中占1个字节
         */

        float f1 = 12.3F;//float赋值时后面最好加f或F，因为12.3是double型的
        long d = 88888888888L;//long赋值时后面最好加l或L
    }
}
