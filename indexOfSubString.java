public class indexOfSubString {
    public static int index(String str , String substr ){
       
        int indexx = str.indexOf(substr);
        return indexx;

    }
    public static void main(String[] args) {
        String str = new String("jasmeen");
        String substr  = new String("meen");

        if(index(str, substr)==-1)
        {
            System.out.println("String does not contain the following substring");

        }
        else{
            System.out.println("the given substring :" + substr + "is found at index:" + index(str, substr));
        }

    }
}
