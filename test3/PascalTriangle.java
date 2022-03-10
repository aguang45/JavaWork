import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要显示杨辉三角的行数：");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n ; i++){
                for(int k = 0; k <= n-i; k++)
                    System.out.print("  ");
                    arr[i][0]=1;
                    if(i>0) {
                        arr[i][i] = 1;
                        System.out.print(" 1 ");
                    }
                for(int j = 0; j <= i; j++) {
                    if(i > 1 && j >= 1 && j <= i-1){
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                        System.out.print(" "+arr[i][j]+" ");
                    }
                }
                System.out.print(" 1 ");
                System.out.println();
        }
    }
}