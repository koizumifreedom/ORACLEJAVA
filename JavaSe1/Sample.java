package JavaSe1;

//1章問8
public class Sample {
   public static void main(String... args) { //String...引数で使う
       //System.out.println(args[0]); コマンドラインの引数を取得する場合に使う
       //System.out.println(args[1]);
       //System.out.println(args[2]);
       //System.out.println(args[3]);
       System.out.println(args.length);
   }
}

//スペースに区切り記号として扱われる
//スペースを含む文字列はダブルクォーテーションで括る事で1つとして扱われる
//ダブルクォーテーションそのものは文字として扱われない


//コンパイル時　java JavaSe1/Sample a \" a\" "a "b c 　バックスラッシュを忘れずに
//5