package Recursion;

public class FirstOcc {
    public static int FirstOccurrence(int arr[] , int i,int key)
    {
        if(i==arr.length){
            return -1;
        }
    

    if(arr[i]== key){
        return i;
    }
    return FirstOccurrence(arr, i+1, key);
}
public static void main(String[] args) {
   int arr[] ={2,3,4,5,6,7,8};
   int key = 5;
   System.out.println(key);
}

    
}
