public class NarcissisticNumber {
    public static void main(String[] args){
        int i,j,k,num,a=0;
        System.out.println("一千以内的水仙花数为：");
        for(num = 100; num < 1000; num ++)
        {
            i = num % 10;
            j = num / 10 %10;
            k = num / 100;
            if(i*i*i+j*j*j+k*k*k==num)
            {
                System.out.println(num);
                a++;
            }
        }
        System.out.println("\n共有"+a+"个\n");
    }
}
