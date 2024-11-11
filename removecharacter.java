public class removecharacter {
    public static String remove(String str , char c){
       return str.replace(Character.toString(c),"");

    }

    public static void main(String[] args) {
        String str = new String("jasmeen");
        char c = 'e';
     str =    remove(str , c);
     System.out.println(str);
    }
}
