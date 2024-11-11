public class consonants {
    
    public static String removeCons(String s)
    {
        String vowels = "aeiouAEIOU";
        String result = "";

        char c;
        for(int i = 0 ; i<s.length();i++)
        {
            c = s.charAt(i);
            if(vowels.indexOf(c) != -1)
            {
                result += c;
            }
        }

        return result;
    }
    

    public static void main(String[] args) {
        String s1 = new String("Hello have a good day");
        System.out.println("the final answer without consonants will be:" + removeCons(s1));
    }
}
