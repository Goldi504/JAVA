public class palindrom {
    public static boolean isPalindrom(String str){
         int n = str.length();
        for(int i=0; i<n/2; i++){
            
            if(str.charAt(i) != str.charAt(n-1-i)){
                // not a palindrom
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrom(str));
    }
    
}
