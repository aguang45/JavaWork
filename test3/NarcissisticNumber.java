public class NarcissisticNumber {
    public static void main(String[] args){
        int i,j,k,num,a=0;
        System.out.println("һǧ���ڵ�ˮ�ɻ���Ϊ��");
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
        System.out.println("\n����"+a+"��\n");
    }
}
