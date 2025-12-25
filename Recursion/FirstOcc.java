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



public static int lastOccurrence(int arr[] , int i,int key){
    if (i == arr.length) {
        return -1;
        
    }
    int isFound = lastOccurrence(arr, i+1 , key);
    if(isFound == -1 && arr[i]==key){
        return i;        
    }
    return isFound;
}
    
  


public static void main(String[] args) {
   int arr[] ={2,3,4,5,6,7,5,8};
   int key = 5;
   System.out.println(lastOccurrence(arr, 0 ,5));
}

    
}
