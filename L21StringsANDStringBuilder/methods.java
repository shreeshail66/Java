import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name = "Shreeshail";
        System.out.println(name.length());//length of string
        //output is 10

        System.out.println(name.toLowerCase());//converts string to lowercase
        //output is shreeshail

        System.out.println(name.toUpperCase());//converts string to uppercase
        //output is SHREESHAIL

        System.out.println(name.trim());//removes leading and trailing spaces
       //output is Shreeshail

       System.out.println(name.substring(3));//substring from index 3 to end
       //output is eeshail

       System.out.println(name.substring(2,6));//substring from index 2 to 6
        //output is rees

        System.out.println(name.replace('a','x'));//replaces all 'a' with 'x'
        //output is Shreeshixl

        System.out.println(name.replace("Shree","Mr."));//replaces "Shree" with "Mr."
        //output is Mr.shail

        System.out.println(name.startsWith("Shree"));//checks if string starts with "Shree"
        //output is true

        System.out.println(name.endsWith("il"));//checks if string ends with "il"
        //output is true

        System.out.println(name.charAt(4));//char at index 4
        //output is s

        System.out.println(name.indexOf("e"));//first occurrence of 'e'
        //output is 3

        System.out.println(name.lastIndexOf("e"));//last occurrence of 'e'
        //output is 4

        System.out.println(name.strip());//removes leading and trailing spaces (similar to trim)
        //output is Shreeshail

        System.out.println(Arrays.toString(name.split("e")));//splits string by 'e'
        //output is [Shr, , shail]

        
    }

}
