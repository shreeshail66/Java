public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<26;i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());

        builder.deleteCharAt(0);//deletes char at index 0
        System.out.println(builder.toString());
        //output is bcdefghijklmnopqrstuvwxyz


        builder.insert(0,'a');//inserts char 'a' at index 0
        //output is abcdefghijklmnopqrstuvwxyz
        System.out.println(builder.toString());

        builder.replace(0, 3, "HELLO");//replaces chars from index 0 to 2 with "HELLO"
        System.out.println(builder.toString());
        //output is HELLOdefghijklmnopqrstuvwxyz
          
        
        System.out.println(builder.length());//length of string in builder
        
        System.out.println(builder.charAt(0));//char at index 0
        //output is H

        System.out.println(builder.indexOf("def"));//gives starting index of substring "def"
        //output is 5

        System.out.println(builder.reverse().toString());//reverses the string in builder
        //output is zyxwvutsrqponmlkjihgfedOLLEH

        System.out.println(builder.toString());//prints the current string in builder
        //output is zyxwvutsrqponmlkjihgfedOLLEH

        System.out.println(builder.capacity());//prints the current capacity of builder
        //output is 34

        System.out.println(builder.delete(0, 5));//deletes chars from index 0 to 4
        //output is wvutsrqponmlkjihgfedOLLEH
    }

}
