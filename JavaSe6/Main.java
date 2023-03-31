package JavaSe6;

public class Main {
  public static void main(String[] args) {

//6章問1
      /*Item a = new Item();
      Item b = new Item();
      b.setNum(20);
      System.out.println(a.getNum());*/

      //一つ目のインスタンスの変数numはインスタンス生成時に10で初期化されたままなので、
      //(a.getNum())で出力される値も10になる
      //10

//6章問2
      /*Item a = new Item();
      Item b = new Item();
      a.name = "apple";
      b.price = 100;
      a.price = 200;
      b.name = "banana";
      a = b;
      a.printInfo();*/

      ///まずapple200とbanana100が作られて、a = b;によって同じインスタンスへの参照を持つ
      //bがaに代入される事によりbしか残らないことになりbanana,100になる
      
      //banana , 100




//6章問3
      Object obj = null;
      System.out.println(obj);

      //nullは変数が何も参照していない事を表すリテラル
      //nullと空文字""が事なる事に注意
      //null

//6章問4
      /*Object a = new Object();
      Object b = new Object();
      Object c = a;
      a = null;
      b = null;*/

      //ガーベージコレクターはメモリ上使わなくなったインスタンスを探して
      //見つかればそれを破棄してメモリを解放する
      //最終的に残るのがコピーされているObject b = new Object();になる
      //コンパイルはできたけど何も表示されない

//6章問5
     /*Sample.num  = 10;
     Sample s = new Sample();
     Sample s2 = new Sample();
     s.num += 10;
     s2.num =30;
     System.out.println(Sample.num);*/
     
     //ststicなメソッドは、staticメンバーにしかアクセスできない
     //s.num += 10;で10が加算されて20になり、その後s2.num =30;を代入する事によって
     ///そのまま30が残る
     //30

//6章問7
     /*Sample sample = new Sample();
     sample.hello();*/

     //メソッドを呼び出すには、メソッド名（引数）を記述しなければいけない。
     //インスタンスに定義されているメソッドの場合は、変数　メソッド名（引数）
     //staticメソッドの場合は、クラス名、メソッド名（引数）

     //hello

//6章問8
     /*Sample s = new Sample();
     System.out.println(s.add(10));*/
    
     //シグニチャとはメソッド名と引数のリストのセットの事
     //呼び出されているメソッドの確認が大事
     //呼び出されているメソッドのシグニチャと一致しているかの確認が必要
     //コンパイルエラー

//6章問9
    /*int a = 1;
    int b = 2;
    System.out.println(b + 2);
    int c = b;*/
    
    //メソッドは、記述した順に実行される事を順次処理という
    //ただクラスのメソッドが、記述順に実行されるわけではない。
    //(a)だと1(b + 2)だと2になる

//6章問11
    /*Sample s = new Sample();
    String val = s.setValue("hello");
    s.getValue();
    System.out.println(val);*/

   //戻り値を戻さないメソッドに対して、戻り値を受け取る変数を宣言して、受け取る事は出来ない。
   //戻り値を戻すメソッドを呼び出しても、その戻り値を受け取る必要はない。
   //s.setValue("hello");がコンパイルエラーになる

//6章問12
    /*Sample s = new Sample();
    double result = s.divide(10,2);
    System.out.println(result);*/

    //このメソットの場合はfloat型である為、float型と互換性のある型で、変数宣言しなければならない
    //double型はdivideメソッド＠の戻り値型と同じであるのでdouble型になる。
    //float　doubleなら実行結果は5.0になる
  


//6章問13
    /*Sample s = new Sample();
    int result = s.method(2);
    System.out.println(result);*/

    ///呼び出しメソッドの引数は、メソッドで宣言されている種類、数を一致させなければならない。
    //methodコンパイルエラー

//6章問17
    /*Main m  = new Main();
    System.out.prinrtln(m.calc(2, 3));
    }
    private double calc(double a, int b) {
        return (a + b) / 2;
    }
    private double calc(int a double b) {
        return (a + b) / 2;*/

        //calcメソッドはintとdouble両方受け取り可能な為
        //メソッドを呼び出す判断ができない為コンパイルエラーが発生してしまう。
        //4行目でコンパイルエラー

//6章問20
    /*Sample s = new Sample();
    s.Sample();*/

    //コンストラクタには、戻り値型を定義できない
    //ただクラス名と同名のメソッドを定義してはいけないというルールがない為エラーにはならない
    //hello

//6章問21
    //Sample s = new Sample();   

    //コンストラクタが実行される前に実行される為
    //Bと表示された後にAと表示される。
    //B A

//6章問22
    //System.out.println(Sample.num);

    //初期化子もコンストラクタもインスタンスを生成するタイミングでしか実行されない
    //Sampleクラスのクラス変数numはデフォルト値で初期化されたままなので0が表示される
    //0

//6章問23
   //Sample s = new Sample();

   //Sampleのインスタンスを生成する際に、引数なしのコンストラクタ使って準備しなさい
   //という意味になり、引数なしのコンストラクタは存在しないためエラーが発生する
   //コンパイルエラー

//6章問24
   //Sample s = new Sample();

   //オーバーロードされたコンストラクタから
   //別のコンストラクタを呼び出す時にはthisを使う
   //ok.

//6章問25
   //Sample s = new Sample();

   //thisを使ってコンストラクタを呼び出す場合は、
   //最初に記述しなければならない
   //コンパイルエラー

//6章問29
   /＊Sample s = new Sample(10);
   modify(s.num);
   System.out.println(s.num);
   }
   private static void modify(int num) {
      num *= 2;/*

      ///プリミティ型の値をメソッドに渡す時、その値はコピーされて渡されます。
      //その為呼び出しメソッドの変更されても値が変わる事はない

   //10

//6章問30
   /*Sample s = new Sample(10);
   modify(s);
   System.out.println(s.num);
   }
   private static void modify(Sample s) {
       s.num *= 2;*/

       //modifyメソッドでインスタンスのnumフィールドの値を2倍にする事により
       //出力されるのが、20になる

   //20

   }
}  






