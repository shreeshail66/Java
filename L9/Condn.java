package L9;

public class Condn {
    public static void main(String[] args) {
        int salary = 5000;
        if(salary > 10000){
            salary = salary + 2000;
        }
        // else{
        //     salary = salary +1000;
        // }
        // System.out.println(salary);
        else if(salary>20000){
            salary += 3000;
        }else{
            salary +=1000;
        }
        System.out.println(salary);
    }
}
