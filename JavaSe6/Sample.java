package JavaSe6;


public class Sample {   


//6章問5
    //static int num = 0;

    //30

//6章問7
      /*public void hello() {
          System.out.println("hello");*/

          //hello

//6章問8
        /*public int add (Integer a, Integer b) {
          return a + b;*/

          //コンパイルエラー
      
//6章問11
        /*private String value;
        public void setValue(String value) {
            this.value = value;
        }
        public String getValue() {
            return this.value;*/

          //コンパイルエラー

//6章問12
       /*float divide(int a, int b) {
        return (float) a / (float) b;*/

//6章問13
        /*public int method(int a, int b) {
            return a + b;*/
        
        //methodコンパイルエラー

//6章問15
       /*public void method(int num) {
           if (num < 0) return;
           System.out.println("A");
           return;
           System.out.println("B");*/

           //6行目でコンパイルエラー

//6章問20
       /*void Sample() {
           System.out.println("hello");*/
           //hello

//6章問21
       /*Sample() {
          System.out.println("A"); 
       }
       {
          System.out.println("B");*/

          //B A

//6章問22
       /*static int num;
       {
        num = 10;
       }
       public Sample () {
          num = 100;*/

          //0
          
//6章問23
       /*void Sample() {
          System.out.println("A");
       }
       Sample(String str) {
          System.out.println(str);*/

          //コンパイルエラー

//6章問24
      /*public Sample() {
          this(null, 0);
      }
      public Sample(String str, int num) {
          System.out.println("ok.");*/

          //ok.

//6章問25
    /*  public Sample() {
        System.out.println("A");
        this("B");
     }
     public Sample(String str) {
        System.out.println(str);*/

    //コンパイルエラー

//6章問29
       int num;
       public Sample(int num) {
           this.num = num;

           //10

//6章問30
       /*int num ;
       public Sample(int num) { 
           this.num = num;*/

           //20
       }
}





