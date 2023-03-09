package JavaSe4;

public class Main {
    public static void main(String[] args) {
//4章問1
        /*int a = 11;
        int b = 0;
        while (b < 5) {
           if (5 < a) {
              System.out.println(b);
           }
           a--;
           b++;
       }*/
       //0 1 2 3 4

//4章問2
      /* int a = 0;
       do {
         System.out.println(a++);
       } while (5 > a);*/
       //0 1 2 3 4
//4章問3
      /*int a = 0;
      while (a < 5)
         do
            a++;
            System.out.print(a);
        while (true);*/
      //コンパイルエラーが発生する

//4章問4
     /*for (int = 1, long j = 2; i < 5; i++) {
         System.out.println(i * J);
     }*/
     //コンパイルエラーが発生する

//4章問5
     /*int a = 1;
     for (int b = 2, total = 0; b <= 5; b++) {
         total = a * b;     
     }
     System.out.println(total);*/
     //コンパイルエラー

//4章問6
     /*for (int i = 0; i == 0; i++) {
      System.out.println(i);
     }*/
     //0

//4章問7
     /*for (int i = 0, j = 0; i < 3, j < 5; i++) {
        System.out.println(i++);
        j += i;
     }*/
     //コンパイルエラー

//4章問8
     /*for (int i = 0; i < 3; i++, period()) {
         System.out.print(i);
     }
     }
     private static void period() {
        System.out.print(" , ");*/
        //0 , 1 , 2 ,

//4章問9
     int array[][] = new int[][] { {1,2}, {2,3,4} };
     int total = 0;
     for (int i = 0; i < array.length; i++) {
         for (int j = i; j < array[i].length; j++) {
             total += array[i][j];
     }
     }
     System.out.println(total);
     //10

//4章問10
    /*for (int i = 0; true; i++) {
        System.out.println(i);
    }*/
    //無限ループになる

//4章問11
    
    }
    
}

