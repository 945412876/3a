import javax.swing.*;

public class ifdemo1 {
    public static void main(String[] args) {
        //需求 心跳 60 到 100 之间是正常的，否则系统提示进一步检查
        //格式1 if （条件表达式）{代码……}
        int heartBeat=99;
        if (heartBeat <60||heartBeat>100){
            System.out.println("您的心跳数据是"+ heartBeat + ",您可能需要进一步检查");

        }
        else{
            System.out.println("心跳正常");
        }
        System.out.println("检查结束");
        //格式2： if（条件表达式）{代码}else（代码）
        //需求 发红包

        //格式3 ：if（条件表达式{代码} else if（很多个）{代码}
        //最后用else结尾
        //0-60是c 60-80 b 80- 90 a 90 -100 为s
        int score =99;
        System.out.println("您的绩效评分为");
        if( score >=0 &&score <=60){
            System.out.println("c");}
              else if   (score >=60 &&score<=80){
            System.out.println("d");}
              else {
            System.out.println("s");
}
}
}