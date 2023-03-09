package JavaSe3;

//3章問1
public class Main {
    public static void main(String[] args) {
       /*int a = 3;
       int b = a += 5
       System.out.println(a + b);*/
    
//16

//3章問4
       /*int a = 10;
       int b = a++ + a + a-- - a-- + ++a;
       System.out.println(b);*/
       //32

//3章問5       
       /*boolean a = true;
       boolean b = true;
       System.out.println(a <= b);*/
       //コンパイルエラー

//3章問6
       /*int a = 10;
       int b = 10;
       if (10 < a && 10 < ++b) {
           a++;
       }
       System.out.println(a + b);*/
       //20

//3章問7
       /*int a = 100, b = 20, c=30;
       System.out.println(a % b * c + a / b);*/
       //5
    

//3章問8
       /*Sample s1 = new Sample(10);
       Sample s2 = s1;
       s1 = new Sample(10);
       System.out.println(s1 == s2);*/
       //false

//3章問9
       /*Sample a = new Sample(10, "a");
       Sample b = new Sample(10,"b");
       System.out.println(a.equals(b));*/     
       //true

//3章問10
       /*Object a = new Sample(10);
       Object b = new Sample(10);
       System.out.println(a.equals(b));*/
       //false

//3章問11
       /*Object a = new Object();
       Object b = null;
       System.out.println(a.equals(b));*/

//3章問12
       /*String a = "sample";
       String b = "sample";
       System.out.print(a == b);
       System.out.print(" , ");
       System.out.println(a.equals(b));
       //true , true*/

//3章問13
      /*String a = new String("sample");
      String b = "sample";
      System.out.print(a == b);
      System.out.print(" , ");
      System.out.println(a.equals(b));
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
      //3

//3章問15
      /*int num = 10;
      if (num <= 10)
      System.out.println("ok");*/
      //ok

//3章問16
      /*if (false)
      System.out.println("A");
      System.out.println("B");*/
      //B

//3章問17
      /*int num = 10;
      if (num < 10)
       System.out.println("A");
      else
       System.out.println("B");
      if (num == 10)
       System.out.println("c");*/
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
       //ABC
    }
} 





