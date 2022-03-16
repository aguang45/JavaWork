package work04;
/***
 * 猜价格游戏
 * Random一个随机数，键盘输入范围内数据，判断是否正确
 * 并给出相应的提示
 */

import java.util.Random;
import java.util.Scanner;

public class GuessPrice {
    public static void main(String[] args) {
        System.out.println("\t***欢迎来到猜价格游戏!***");
        Random r = new Random();
        //创建Random对象
        int num = r.nextInt(899) + 100;
        //创建大小为100-999的随机数，保存在num
        System.out.println("\t已生成随机价格！（100-999）");
        int i = 0, max = 999, min = 100;
        //i用于记录游戏循环次数,max、min分别记录最大值最小值，用于输入错误时给出范围提示

        Scanner sc = new Scanner(System.in);
        while (true) {
            //永真循环用于输入失败继续进行操作

            i++;
            //累加记录输入次数

            System.out.println("\n"+i+"、请输入你猜的价格(输入0停止游戏):");
            int a = sc.nextInt();
            //键盘录入数据存放在a

            if (a >= 100 && a < 1000) {

                //按照输入数据大小给出相应的提示
                if (a > num) {
                    if (a < max)
                        max = a;
                    System.out.println("\t你输入的价格大了!答案的范围在: " + min + "-" + max+" !");

                } else if (a < num) {
                    if (a > min)
                        min = a;
                    System.out.println("\t你输入的价格小了!答案的范围在: " + min + "-" + max+" !");
                } else {
                    System.out.println("\n\n\t\t\t***恭喜你猜对了***\n\t本次游戏的随机价格为:" + num + ",你共输入了" + i + "次");
                    return;
                    //猜对执行，return，跳出程序
                }
            }
            else if (a == 0) {
                    System.out.println("本次游戏已停止，你共输入了" + i + "次");
                    return;
                }
             else
                System.out.println("请正确输入"+min+" - "+max+"的整数！");
        }
    }
}
