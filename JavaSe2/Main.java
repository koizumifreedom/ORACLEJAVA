//2章問1
package JavaSe2;

/*public class Main {
    public static void main(String[] args) {
       int val = 7;
       bool flg = true;
       if (flg == true) {
           do {
              System.out.println(val);
           } while (val > 10);
       }
    }
}*/
 
//7行目で宣言しているデータ型が「bool]となってなっている為コンパイルエラーが発生します。
//真偽値を扱うためのデータ型は「boolean」です。

//コンパイルエラー

//2章問7
/*public class Main{
public static void main(String[] args) {
    Sample s = new Sample("sample");
    s.test();
}
}*/

//varによる型推論は、ローカル宣言にしか使えない
//Sampleクラスのコンストラクタの引数宣言にvarを使っている為コンパイルエラー

//コンパイルエラー

//2章問10
/*public class Main {
    public static void main(String[] args) {
        String str = "hoge, world.";
        hello(str);
        System.out.println(str);
    }
    private static void hello(String msg) {
       msg.replaceAll("hoge","hello");
    }
}*/

//hoge, world.

//2章問11
/*public class Main {
public static void main(String[] args) {
    String str = "abcde";
    System.out.println(str.charAt(5));
}
}*/
//charAt(5)を指定すると6番目の文字を取り出す意味になり実行時スローされる
// charAtメソッドは"abcde" 01234と0からスタートする

//実行時に例外がスローされる

//2章問12

public class Main {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.indexOf("abcdef"));
    }
}

//5文字の文字列の中に、6文字の文字列が存在しない為-1が戻される
//indexOfは文字列のどの位置に存在するか調べるメソット
//例えばcのみであれば3が表示bであれば2

//-1

//2章問13

/*public class Main {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.substring(2,4));  
    }
}*/

//cd

//2章問14
/*public class Main {
    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(str.replace("aa","b"));
    }
}*/

//bb

//2章問15
/*public class Main {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.charAt(str.length()));
    }
}*/

//実行時に例外がスローされる

//2章問16
/*public class Main {
   public static void main(String[] args) {
      String str = "abcde";
      System.out.println(str.substring(1,3).startsWith("b"));
   }    
}*/

//true

//2章問18
/*public class Main {
  public static void main(String[] args) {
      System.out.println(10 + 20 + "30" + 40);
  }
}*/

//303040

//2章問19
/*public class Main {
    public static void main(String[] args) {
        String str = null;
        str += "null";
        System.out.println(str);
    }
}*/

//nullnull

//2章問20
/*public class Main {
   public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("abcde");
       System.out.println(sb.capacity());
   }
}*/

//21

//2章問21
/*public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcde");
        sb.reverse();
        sb.replace(1,3,"a");
        System.out.println(sb);
    }
}*/

//eaba