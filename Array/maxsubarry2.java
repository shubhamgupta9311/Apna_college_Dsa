public class maxsubarry2 {
    public static void maxsubarry(int numbers[]) {
        int start, end;
        int currsum;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculating prefix array
        for (int i = 1; i < prefix.length; i++) {

            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // finding start
        for (int i = 0; i < numbers.length; i++) {
            start = i;

            for (int j = i; j < numbers.length; j++) {
                end = j;

                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("the max sum is : " + maxsum);
    }

    public static void kadane(int numbers[]){
  int cs=0;
  int ms=Integer.MIN_VALUE;
  for(int i=0;i<numbers.length;i++){

    cs=cs+numbers[i];
    if(cs<0){
        cs=0;
    }
    ms=Math.max(ms,cs);
  }

System.out.println("our max subarray sum is : "+ ms);


    }

    public static void main(String args[]) {

        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        maxsubarry(numbers);
      kadane(numbers);

    }

}
