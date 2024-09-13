package ss1_introduction.bai_tap;

public class test {
   public static void main(String[] args) {
       int sum = 0;
       int number[] = {1,4,7,8};
       for (int i=0;i<number.length;i++) {
           sum += number[i];
       }
       System.out.println("sum:"+sum);
       int sum2 = 0;
       int[][] arr = {
               {1,4,8},
               {2,6,8},
               {3,2,1}};

       for (int i = 0; i < arr.length; i++ ) {
           sum2 += arr[i][i];
       }
       System.out.println("Tổng đường chéo: "+sum2);
}
}
