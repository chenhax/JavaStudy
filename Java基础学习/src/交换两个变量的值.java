public class 交换两个变量的值 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

//        //第一种方法
//        int temp;
//        temp = x;
//        x = y;
//        y = temp;
//
//        //第二种方法(可能会超出取值范围)
//        x = x + y; //x = 10 + 5
//        y = x - y; //y = 10 + 5 -5 = 10
//        x = x - y; //x = 10 + 5 - 10 = 5

        //第三种方法
        x = x ^ y; //x = 10 ^ 5
        y = x ^ y; //y = 10 ^ 5 ^ 5 = 10
        x = x ^ y; //x = 10 ^ 5 ^ 10 = 5
    }
}
