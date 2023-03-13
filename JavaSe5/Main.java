package JavaSe5;

public class Main {
    public static void main(String[] args) {

//5章問1
    /*int[] array = new int[0];
      System.out.println(array);*/
      //ハッシュコードが表示される
      
//5章問2

     /*int [] a;
     int b[];
     int [][] c;
     int d[][];
     int [] e[];
     int [][] f[];*/
     
     //何も表示されない　コンパイルエラーはなし

//5章問5
     /*Item[] items = new Item[3];
     int total = 0;
     for (int i = 0; i < items.length; i++) {
         total += items[i].price;
     }
     System.out.println(total);*/

     //実行時に例外がスローされる

//5章問6
     /*String[] array = {"A","B","C","D"};
     array[0] = null;
     for (String str : array) {
         System.out.print(str);
     }*/
     //nullBCD

//5章問8
     /*String[][] array = { { "A", "B" } , null, { "C", "D" , "E"}};
     int total = 0;
     for (String[] tmp : array) {
         total += tmp.length;
     } 
     System.out.println(total);*/

     //実行時にスローされる

//5章問10
     int [][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 }};
     int [][] arrayB = arrayA.clone();
     int total = 0;
     for (int[] tmp : arrayB) {
         for (int val : tmp) {
             total += val;
         }
     }
     System.out.println(total);

     //12
     }
}




    