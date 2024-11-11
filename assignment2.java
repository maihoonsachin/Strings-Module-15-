public class assignment2 {
    public static void main(String[] args) {
        String str = new String("tit");
        int n = str.length();

        char arr[] = new char[n];
        for(int i = 0;i<n; i++)
        {
            arr[i] = str.charAt(i);
        }
        int flag = 1;
        int mid = 0 + (n-1 -0)/2;
        for(int j = 0 ; j<=mid ; j++)
        {
            if(arr[j] != arr[n-j-1]){
                flag = 0;
            }
        }
        if(flag!=1)
        {
            System.out.println("it is not a palindrome string");

        }
        else{
            System.out.println("it is a palindrome string");
        }
    }
    
}
