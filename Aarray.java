public class Aarray {
//     public static void update(int marks[] ){
//         for(int i=0; i<marks.length; i++ ){
//             marks[i] = marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = {97,98,99};
//         update(marks);
//         for(int i=0; i<marks.length; i++)
//         {
//             System.out.print(marks[i]+ " ");
//         }
//     }
    
// }
// public static int linearSearch(String numbers[], String key){
//     for(int i=0; i<numbers.length; i++){
//         if(numbers[i]==key)
//         {
//             return i;
//         }
//     }
//     return -1;
// }
// public static void main(String args[]){
//     String numbers[]={"cake","sweet","mango"};
//     String key="cake";
//     int index=linearSearch(numbers, key);
//     if(index==-1){
//         System.out.println("Not found");
//     }
//     else{
//         System.out.println("Key is at index :" +index);
//     }
// }
// }
//public class Aarray {
    // public static void update(int marks [])
    // {
    //     for(int i=0; i<marks.length; i++){
    //         marks[i]= marks [i]+1;
    //     }
    // }
    // public static void main(String args[])
    // {
    //     int marks[]={23 , 34, 26};
    //     update(marks);
    //     for(int i=0; i<marks.length; i++)
    //     {
    //         System.out.print(marks[i] + " ");
    //     }
    // }
    // }
// public static int getLargest(int numbers){
//     int largest =Integer.MIN_VALUE;
//     for(int i=0; i< numbers.length; i++)
//     {
//         if(largest < numbers[i])
//         {
//             largest =numbers[i];

//         }
//     }
//     return largest;
// }
// public static void main(String args[]){
//     int numbers[] ={1 , 2,6,3,5};
//     System.out.println("largest value is : " +getLargest(numbers));
// }
// }    
public static int binarySearch(int numbers[] , int key )
{
    int start = 0, end =numbers.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if( numbers[mid] ==key)
        {
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;

        }
        else{
            end=mid-1;
        }
    }
    return -1;

}
public static void main(String args[])
{
    int numbers[]={12,3,8,7,10};
    int key=8;
    System.out.println ("index for key : " +binarySearch(numbers, 8));
}
}
