public class forfor {
    public static void main(String[] args) {
        //理解嵌套循环的执行流程
        //场景：假如我有老婆，然后我犯错了，我要每天都说三句我爱你，五天重复
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("我爱你");

            }
            System.out.println("-----------------------");
        }
    }
}
