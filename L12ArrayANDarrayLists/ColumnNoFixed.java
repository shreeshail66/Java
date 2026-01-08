public class ColumnNoFixed {
    public static void main(String[] args) {
        int arr[][] = {{23,24,12,2},{34,4},{2342,4,56},{34}};

        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    }

