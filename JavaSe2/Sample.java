package JavaSe2;
//2章問7
/*public class Sample {
  private var value;
  public Sample(var value) {
      this.value = value;
  }
  public void test() {
    System.out.println(value);
    }
  }*/

    //varによる型推論は、ローカル宣言にしか使えない
    //Sampleクラスのコンストラクタの引数宣言にvarを使っている為コンパイルエラー

    //コンパイルエラー
  

//2章問17
/*public class Sample {
    public static void main(String[] args) {
        String str = "Hello,".concat("Java!");
        System.out.println(str);
    }
}*/
    
        //concatメソッドはStringクラスに用意されているメソッド
        //Hello,Java!という文字を作るにはconcatメソッドを使っって連結する必要がある


        //Hello,Java!

//2章問22
public class Sample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb.indexOf("bcd"));
    }
}  

        //まずabcdeに番号を降ると01234になる
        //bcdと言う文字を調べている為bは1なので1になる

        //1
