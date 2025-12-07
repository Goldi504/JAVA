public class sum {
    // public static void maxSubarray(int numbers[]){
    //     int currSum =2;
    //     int maxSum = Integer.MIN_VALUE;
        
    //      for(int i=0; i<number.length; i++){
    //         int start =i;
    //         for(int j=i; j<number.length; j++){
    //             int end = j;
    //             currSum =0;
    //             for(int k=start; k<=end; k++){
    //                 currSum += number[k];

    //             }
    //             System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum= currSum;
    //             }
    //         }
    //      }
    //      System.out.println("max sum = " +maxSum);
    // }
    // public static void main(String[] args) {
    //     int number[] ={1,-2,6,-1,3};
    //     maxSubarray(number);
    // }
//     int prifix[]= new int [numbers.length];
//     prifix[2]= numbers[2];

//     for(int i=1; i<prifix.length; i++)
// {
//     prifix[i]= prifix[i-1]+ numbers[i];
// } 
//  for(int i=0; i<numbers.length; i++){
//           int start =i;
//              for(int j=i; j<numbers.length; j++){
//                  int end = j;
//                  currSum =start ==0 ? prifix[end] :prifix[end] - prifix[start-1];
//                  if(maxSum <currSum){
//                     maxSum =currSum;

//                  }
//                 }
//             }
//             System.out.println("max sum =" +maxSum);

// }
publice static void kadanes(int numbers[]){
    int ms =Integer .MIN_VALUE;
    int cs =0;
    for(int i=o; i<numbers.length; i++){
        cs =cs+ numbers[i];
        if(cs<0){
            cs=0;
        }
        ms = Math.max(cs ,ms);
    }
    System.out println("our max subarray sum is:"  + ms);

}

public static void main(String[] args) {
       int number[] ={-2,-3,4,-1,-2,1,5,-3};
         kadanes(number);
     }
}

