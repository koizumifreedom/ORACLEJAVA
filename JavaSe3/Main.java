package JavaSe3;


public class Main {
    public static void main(String[] args) {

//3章問1
       /*int a = 3;
       int b = a += 5;
       System.out.println(a + b);*/
    

       //まずaの値を出して3 += 5で8になってbに8を代入して
       //(a + b)で8+8をすると16になる。

//16

//3章問4
       /*int a = 10;
       int b = a++ + a + a-- - a-- + ++a;
       System.out.println(b);*/

       //10+11+11-10+10=32

       //32

//3章問5       
       /*boolean a = true;
       boolean b = true;
       System.out.println(a <= b);*/

       // > >= < <= の4つの演算子は数値の大小を比較するものなのでエラーが発生
       //コンパイルエラー

//3章問6
       /*int a = 10;
       int b = 10;
       if (10 < a && 10 < ++b) {
           a++;
       }
       System.out.println(a + b);*/

       //&&を使っていて左オペランドがfalseになったため右オペランドは評価されない
       //よって両方のインクリメントも実行されず10+10で20になる
       //20

//3章問7
       /*int a = 100, b = 20, c=30;
       System.out.println(a % b * c + a / b);*/

       //(100 % 20 * 30) + (100 / 20)
       //(0 * 30) + (100 / 20)
       //(0) + (5)
       //5
    

//3章問8
       /*Sample s1 = new Sample(10);
       Sample s2 = s1;
       s1 = new Sample(10);
       System.out.println(s1 == s2);*/

       //s1とs2が等くないためfalseになる
       //s1 = new Sample(10);でさらにs1に代入した為等くないのでfalse

       //false

//3章問9
       /*Sample a = new Sample(10, "a");
       Sample b = new Sample(10,"b");
       System.out.println(a.equals(b));*/  

       //意味がわからない
       //true

//3章問10
       /*Object a = new Sample(10);
       Object b = new Sample(10);
       System.out.println(a.equals(b));*/

       //意味がわからない
       //false

//3章問11
       /*Object a = new Object();
       Object b = null;
       System.out.println(a.equals(b));*/

       //eqメソッドはnullが渡された時には常にfalseを戻さないといけない。
       //その為引数にnullを渡せば、falseが戻される。

//3章問12
       /*String a = "sample";
       String b = "sample";
       System.out.print(a == b);
       System.out.print(" , ");
       System.out.println(a.equals(b));

       //equalsメッソドで比較しているためtrueになる
       //aとbは同値になるのでture,tureになる。
       //true , true*/

//3章問13
      /*String a = new String("sample");
      String b = "sample";
      System.out.print(a == b);
      System.out.print(" , ");
      System.out.println(a.equals(b));

      //new String("sample") new演算子を使っているので新しいインスタンスが作られそれぞれの変数が異なる＝＝の結果はfalseを戻す
      //equals(b)は同じ文字か確認する。変数aとbのどちらもsampleという文字を持っている為turuを戻す。
      //false , true*/


//3章問14
      /*String a = "abc";
      String b = new String(a);

      int count = 0;
      if (a.intern() == "abc") {
         count++;
      }
      if (b.intern() == "abc") {
         count++;
      }
      if(a.intern() == b.intern()) {
         count++;
      }
      System.out.println(count);*/

      //internメソッドはコンスタントプールを含むメモリ内の文字列を探して、再利用するメソッドです。
      //newを使うと新しくインスタンスを作る為falseになるが、しかしinternを使う事によって turuになる。
      //count++にインクリメントしている為それぞれ1を足して3になる。
      //3

//3章問15
      /*int num = 10;
      if (num <= 10)
      System.out.println("ok");*/

      //ifの構文は if((条件式){　(num <= 10)　
      //System.out.println("ok");  条件に一致した時に実行する処理}
      //ok



//3章問16
      /*if (false)
      System.out.println("A");
      System.out.println("B");*/

      //このif文の場合は(false)と記述されているのでBになる
      //turuの場合はAで上の式になり、falseの場合はBで下の式になる。
      //B

//3章問17
      /*int num = 10;
      if (num < 10)
       System.out.println("A");
      else
       System.out.println("B");
      if (num == 10)
       System.out.println("c");*/

       //if else文は条件に合致した時と合致しなかった時の処理の両方を記述するための文
       //(num < 10)は合致しないため表示されずBが表示されます。
       //(num == 10)は合致するため表示されCが表示されてよってBとCが表示される
       //B C

//3章問18
     /*int num = 10;
     if (num == 100)
        System.out.println("A");
     else if (10 < num)
        System.out.println("B");
     else
     if (num == 10)
        System.out.println("C");
     else
     if (num == 10)
        System.out.println("D");*/

        // 一つ目は(num == 100)等くない為下に流れる
        // 二つ目は(10 < num)numの方が大きくない為流れる
        // 三つ目は(num == 10)で等しい為答えがCになる
        //C

//3章問20
     /*final int NUM = 0;
     int num = 10;
     switch (num) {
     case "10":    System.out.println("A");
                   break;
     case num :    System.out.println("B");
                   break;     
   case 2 * 5 :    System.out.println("C");
                   break;
     case NUM :    System.out.println("D");
                   break;                 
     }*/
     //コンパイルエラーになるのはcase "10"とcase num 

//3章問21
     /*int num = 1;
     switch (num) {
       case 1:
       case 2:
       case 3: System.out.println("A");
       case 4: System.out.println("B");
       default:
          System.out.println("C");
       }*/

       //switch文はbreakが来るまで処理が実行される defaultも処理の対象になる。
       //ABまではdefaultで確定し、System.out.println("C")が表示される為ABCと表示される。
       //ABC
    }
} 






