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

/*public class Main {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.indexOf("abcdef"));
    }
} */

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
//substringメソッドは文字列を排出するメソッドです。
//|a|b|c|d|e|最初を0から数えて棒が5本2〜4なのでcdが正解

//cd

//2章問14
/*public class Main {
    public static void main(String[] args) {
        String str = "aaaa";
        System.out.println(str.replace("aa","b"));
    }
}*/

//最初の2文字のaaがbになり後ろのaaがbになるのでbb
//bb

//2章問15
/*public class Main {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.charAt(str.length()));
    }
}*/

//charAtは引数で指定された位置にある文字を抽出します。
//この時0〜4の数値で位置を特定します。
//現在5文字なので範囲外の位置と認識して実行時スローになる

//実行時に例外がスローされる

//2章問16
public class Main {
   public static void main(String[] args) {
      String str = "abc";
      System.out.println(str.substring(1,3).startsWith("b"));
   }    
}

//startsWithは、文字数が引数で指定された文字で始まるかどうかを調べるメソット
//調べた結果は真偽値で戻される
//|a|b|c|d|e|の1と3になるからbc文字があるからture

//true

//2章問18
/*public class Main {
  public static void main(String[] args) {
      System.out.println(10 + 20 + "30" + 40);
  }
  //(10 + 20 + "30" + 40);まず10と20が足されて30になり"30"を文字としてくっつけると3030になり
  //3030の文字に40をくっつけると303040になる
}*/

//303040

//2章問19
/*public class Main {
    public static void main(String[] args) {
        String str = null;
        str += "null";
        System.out.println(str);
    }
//+=演算子は文字列を連結します。
//str = "null"とstr += "null"は同じ意味になるので
//nullnullになる
}*/

//nullnull

//2章問20
/*public class Main {
   public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("abcde");
       System.out.println(sb.capacity());
   }
}*/
//文字列の長さ+16文字分で21になる
//StringBuilderが16文字の扱いにおなる

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

//appendメソッドは文字列に新しい文字列を追加するメソッド
//sb.reverse();で文字が反転してedcbaになる
//replaceは文字列を置き換える意味になり
//|e|d|c|b|a|(1,3,"a") 0から数えて1,3はdとcなのでaに置き換えると
//eabaになる

//eaba