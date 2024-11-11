public class assignment1 {
    public static void main(String[] args) {
        String s1 = "Pratyush";
        String s2 = new String("jasmeen");
        int n = s2.length();

        char arr[] = new char[n];
        for(int i = 0 ; i<n;i++)
        {
            arr[i] = s2.charAt(i);
        }
        for(int i = n-1 ; i>=0;i--)
        {
            System.out.print(arr[i]);
        }

    }
}
