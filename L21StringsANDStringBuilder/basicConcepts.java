public class basicConcepts {
      public static void main(String[] args) {
            String a = "shree";
            String b = "shree";
            System.out.println(a);
            a= "Sangolge";
            System.out.println(a);//not changeed bcz strong is immutable
            //output will be "Sangolge"
            System.out.println(b);
            String x = "hii";
            String y = "hii";
            System.out.println(x==y);//output will be true


            //how to create different object of string of same name
            String p = new String("hello");
            String q = new String("hello");
            System.out.println(p==q);//output will be false
            System.out.println(p.equals(q));//output will be true
             


}
}
