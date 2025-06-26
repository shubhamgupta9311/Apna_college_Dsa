

public class maxsubarry { // basic /brute force method here time complexity is very bad which is O(n^3).
    public static void maxsubarraysum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // code for subarry
        for (int i = 0; i < numbers.length; i++) {// finding start
            int start = i;

            for (int j = i; j < numbers.length; j++) { // finding end
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + numbers[k];
                }
                System.out.print(currSum);
                System.out.println();
               if(maxSum<currSum){
                maxSum=currSum;
               }
            }
        }
        System.out.println( "mas sum is : " +maxSum);
    }

    public static void main(String args[]) {

        int numbers[]={2,4,6,8,12};
        maxsubarraysum(numbers);

    }

}
