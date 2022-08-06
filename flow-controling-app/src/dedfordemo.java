import java.util.Scanner;

public class dedfordemo {
    public static void main(String[] args) {
        //1定义正确的密码
        int a =520;
        //2定义一个死循环让用户不断的输入密码认证
        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("请您输入正确的密码：");
            int password =sc.nextInt();
            if (password==a){
                System.out.println("登陆成功了");
                break;}
                else{
                System.out.println("密码错误！");
            }



        }
    }
}
