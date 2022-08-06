public class whiledemo2 {
    public static void main(String[] args) {
        //需求 珠穆朗玛峰是8848860 纸张厚度0.1 求折叠几次
        double a =8848860;
        double b= 0.1;
        int c=0;
        //定义一个while循环控制纸张进行折叠
         while(b<a){
             b*=2;
             c++;
         }
        System.out.println(c);
        System.out.println("纸张的最终高度"+b);
    }
}