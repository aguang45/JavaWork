//package NarcissisticNumber;

import java.util.Scanner;

/***
 * ��λ��ˮ�ɻ���
 *
 * ��չ������¼�����ݣ��жϲ����������֮�ڵ�����ˮ�ɻ���
 */

public class NarcissisticNumber2 {
    /*
    public static void main(String[] args){
        int i,j,k,num,a=0;
        System.out.println("һǧ���ڵ�ˮ�ɻ���Ϊ��");
        for(num = 100; num < 1000; num ++)
        {
            i = num % 10;
            j = num / 10 %10;
            k = num / 100;
            if(i*i*i+j*j*j+k*k*k==num){
                System.out.println(num);
                a++;
            }
        }
        System.out.println("\n����"+a+"��\n");
    }
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //����¼��ˮ�ɻ����ķ�Χ

        System.out.println("\n������Ҫ�����ˮ�ɻ��������Χ��");
        int num = sc.nextInt();

        //��������Ƿ����
        if (num < 100) {
            System.out.println("����ȷ�������ݣ���λ��������");
            return;
        }

        //n����������ݵ�λ���� num3��š�i*i*i+j*j*j+k*k*k���� a������¼ˮ�ɻ�����Ŀ
        int n, num3, a = 0;

        System.out.print("\n"+num + "���ڵ�ˮ�ɻ����У�");

        //num2����������100����������ֵ���������
        for (int num2 = 100; num2 <= num; num2++) {
            n = wei(num2);
            num3 = jisuan(num2, n);

            //�жϴ����ǲ���ˮ�ɻ���
            if (num3 == num2) {
                if (a != 0)
                    System.out.print("�� ");
                if (a % 8 == 0)
                    System.out.println("\n");
                System.out.print(num3);
                a++;
            }
        }
        if (a == 0) {
            System.out.println("\b\b\b\b\b\b\bû��ˮ�ɻ���!");
            return;
        }
        System.out.println("\n\n\t����" + a + "��ˮ�ɻ���!");
    }

    //�ж�sum�Ǽ�λ��
    public static int wei(int sum) {
        int n = 0;
        while (sum > 0) {
            sum = sum / 10;
            n++;
        }
        return n;
    }

    //numΪ��ֵ��n��num��λ��������ˮ�ɻ���ֵ
    public static int jisuan(int num, int n) {
        int sum = num, num2 = 1, number = 0;
        int arr[] = new int[n];

        //��ÿ��λ��������ȡ���������arr[]��
        for (int i = 0; i < n; i++) {
            arr[i] = sum % 10;
            sum = sum / 10;
        }

        //���㡰i*i*i+j*j*j+k*k*k��
        for (int i = 0; i < n; i++) {
            num2 = arr[i];
            for (int j = 1; j < n; j++) {
                num2 = arr[i] * num2;
            }
            //����ͬλ�ġ�i*i*i��������
            number += num2;
        }
        return number;
    }
}
