package work02;

/***
 * 一百以内所有素数
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 1, i, j;
        System.out.print("一百以内的素数有：2");
        //2是第一个素数，判断2以后的素数
        for (i = 3; i <= 100; i++) {
            //从2以后的所有一百以内整数
            for (j = 2; j <= i; j++)
                //j用于判断是否能被i整除
                if (i % j == 0)
                    //如果能被i整除，跳出本次循环
                    break;
            if (j == i) {
                //判断是否累加到i本身才退出循环，若i==j，则i为素数
                System.out.print("、 " + i);
                num++;
            }
        }
        System.out.println("\n一百以内的素数总数为" + num);
    }
}
