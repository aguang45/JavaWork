package work03;

import java.util.Scanner;

/***
 * 鸡兔同笼问题
 * 手动输入总腿数和头数，并给出相应的提示
 */
public class ChickenRabbit {
    public static void main(String[] args) {
        int leg, head, j , t ;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入共有多少条腿:");
        leg = sc.nextInt();
        System.out.println("输入共有多少个头:");
        head = sc.nextInt();
        for (j = 0; j <= head; j++)
            for (t = 0; t <= head; t++)
                if (leg == j * 2 + t * 4 && head == j + t) {
                    System.out.println("共有" + j + "只鸡\n" + t + "只兔");
                    return;
                }
        System.out.println("输入数据有误");
    }
}
