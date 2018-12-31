public class Java数据类型转换 {
    public static void main(String[] args) {
        int a = 10;
        byte b = 5;
        /*
        隐式转换：
            进行混合运算时byte，short，char都会提升为int，
            其他类型小的类型会提升为大的类型
            (byte, short, char) -> int -> long -> float -> double
         */
        System.out.println("a+b = " + getType(a + b));//计算a+b时,b的类型转换成int，a+b结果为int

        float f = 12.3F;
        long l = 12345;
        System.out.println("type of float + long\t" + getType(f + l));

        /*
        强制转换
         */
        b = (byte) (10 + 4);
        System.out.println("b = " + b);
        /*
        数据溢出：
            Java中整形都用补码表示
            130的二进制表示为00000000 00000000 00000000 10000010
            反码为：00000000 00000000 00000000 10000010
            其补码（在java中的表示为）为 00000000 00000000 00000000 10000010
            转换成byte为10000010，对应原码为11111110即为-126
         */
        b = (byte) (126 + 4);
        System.out.println("byte 126 + 4 数据溢出\t" + b);


        byte a1 = 3;
        byte a2 = 4;
        //byte c = a1 + a2;//错误
        System.out.println("type of byte + byte\t" + getType(a1 + a2));//结果为int
        /*
        byte与byte,short,int进行运算都会提升为int
        所以byte c = a1 + a2可能超出
         */
        byte c = 3 + 4;//可行,相当于c=7，是把常量赋值给变量


        short x = 10000, y = 4653;
        System.out.println("type of short + short\t" + getType(x + y));//结果为int

    }

    public static String getType(Object o) {
        //获取一个变量的类型
        return o.getClass().toString();
    }
}
