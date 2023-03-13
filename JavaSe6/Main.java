package JavaSe6;

public class Main {
  public static void main(String[] args) {

//6章問1
      /*Item a = new Item();
      Item b = new Item();
      b.setNum(20);
      System.out.println(a.getNum());*/

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

      //banana , 100

//6章問3
      /*Object obj = null;
      System.out.println(obj);*/

      //null

//6章問4
      /*Object a = new Object();
      Object b = new Object();
      Object c = a;
      a = null;
      b = null;*/

      //コンパイルはできたけど何も表示されない

//6章問5
     /*Sample.num  = 10;
     Sample s = new Sample();
     Sample s2 = new Sample();
     s.num += 10;
     s2.num =30;
     System.out.println(Sample.num);*/
      
     //30

//6章問7
     /*Sample sample = new Sample();
     sample.hello();*/

     //hello

//6章問8
     /*Sample s = new Sample();
     System.out.println(s.add(10));*/

     //コンパイルエラー

//6章問9
    /*int a = 1;
    int b = 2;
    System.out.println(b + 2);
    int c = b;*/

    //(a)だと1(b + 2)だと2になる

//6章問11
    /*Sample s = new Sample();
    String val = s.setValue("hello");
    s.getValue();
    System.out.println(val);*/

   //s.setValue("hello");がコンパイルエラーになる

//6章問12
    Sample s = new Sample();
    double result = s.divide(10,2);
    System.out.println(result);

    //float　doubleなら実行結果は5.0になる
  }
}

