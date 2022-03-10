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
        System.out.println("欢迎来到猜价格游戏!");
        Random r = new Random();
        //创建Random对象
        int num = r.nextInt(899) + 100;
        //创建大小为100-999的随机数，保存在num
        System.out.println("已生成随机价格！（100-999）");
        int i = 0;
        //i用于记录游戏循环次数

        Scanner sc = new Scanner(System.in);
        while (true) {
            //永真循环用于输入失败继续进行操作

            System.out.println("\n请输入你猜的价格:(输入0停止游戏):");
            int a = sc.nextInt();
            //键盘录入数据存放在a

            i++;
            //累加记录输入次数

            if (a >= 100 && a < 1000)

                //按照输入数据大小给出相应的提示

                if (a > num)
                    System.out.println("你输入的价格大了!");
                else if (a < num)
                    System.out.println("你输入的价格小了!");
                else {
                    System.out.println("恭喜你猜对了，本次游戏的随机价格为:" + num + "\n本次游戏你共输入了" + i + "次");
                    return;
                    //猜对执行，return，跳出程序
                }
            else if(a == 0) {
                System.out.println("本次游戏已停止，你共输入了" + i +"次");
                return;
            }

            else
                System.out.println("请正确输入100-999的整数！");
        }
    }
}
