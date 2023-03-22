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
     
     //配列変数の宣言方法大カッコ[]を使って宣言する。
     //データ型の後ろ変数名の後ろ両方に記述可能
     //なのでコンパイルエラーが発生する事はない
     //何も表示されない　コンパイルエラーはなし

//5章問5
     /*Item[] items = new Item[3];
     int total = 0;
     for (int i = 0; i < items.length; i++) {
         total += items[i].price;
     }
     System.out.println(total);*/

     //配列インスタンスと要素は別者のと考え
     //new Item[3]だとインスタンスのみの生成になるので
     //もし要素を初期化したい場合は{3}を使う
     //実行時に例外がスローされる

//5章問6
     /*String[] array = {"A","B","C","D"};
     array[0] = null;
     for (String str : array) {
         System.out.print(str);
     }*/

     //要素の値が変わっても配列には影響がない
     //0123でABCDと考えAの場所に要素arrayのnullが入ってくるのでnullBCDになる
     //nullBCD

//5章問8
     /*String[][] array = { { "A", "B" } , null, { "C", "D" , "E"}};
     int total = 0;
     for (String[] tmp : array) {
         total += tmp.length;
     } 
     System.out.println(total);*/
     
     //一次元目の二つ目の要素はnullで初期化されている為
     //lengthを使って要素数を数えようとしているがnullの為参照先が存在しないのでスローになる
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

     //cloneメソッドは同じ値を持った配列インスタンスが複製される。
     //2次元配列から値を一つずつ取り出して{ 1, 2 }, { 1, 2 }, { 1, 2, 3 }を足すと12になる。

     //12
     }
}




    