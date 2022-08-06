public class fortest2 {

    public static void main(String[] args) {
        //定义一个循环找到1-10 然后找出奇数
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum+=i;

            }

        }
        System.out.println(sum);
        //定义一个循环找到13579
        int b =0;
        for (int a = 1; a <=10; a+=2) {
         b+=a;

        }
        System.out.println(b);
    }
}
