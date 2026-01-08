public class SearchINString {
    public static void main(String[] args) {
           String name = "Shree";
        char target = 'e';
        boolean ans = linearSearch(name,target);
        System.out.println(ans);
    }

    static boolean linearSearch(String name,char target){
        if(name.length()== 0){
            return false;
        }
        for(int index = 0;index<name.length();index++){
            if(target == name.charAt(index)){
                return true;
            }
        }
        return false;
    }
}
    
    