public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts= {{213,324,234},
                              {2,53,1},
                              {7,98,4}};
System.out.println(maxWealth(accounts));
    }
        static int maxWealth(int[][] accounts){
            int ans = Integer.MIN_VALUE;
            for(int person = 0;person<accounts.length;person++){
                int sum = 0;
                for(int account =0;account<accounts[person].length;account++){
                    sum = sum+accounts[person][account];
                }
                if(sum>ans){
                    ans = sum;
                }
            }
            return ans;
        
    }
}
