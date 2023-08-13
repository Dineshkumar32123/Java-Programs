public class string {
        public static void main(String[] args) {
            java.lang.String text = "This is the Text";
            java.lang.String toUppercase = text.toUpperCase();
            System.out.println(toUppercase);
            System.out.println(text);
        }
    }

class Demo{
    public static void main(String[] args) {
//        java.lang.String Name_1 = " Hellooo Mfffff...";
//        java.lang.String Name_2 = " I am dk...";
//
//        System.out.println(Name_1.toUpperCase());
//        System.out.println(Name_2.toUpperCase());

        java.lang.String s1 = "hello";
        System.out.println(s1.toUpperCase());//---> FOR UPPER CASE CONVERSION
        java.lang.String s2 = " I am DINEDSH";
        System.out.println(s2.toLowerCase());//---> FOR LOWER CASE CONVERSION
        java.lang.String s3 = "aakdlolijefwegmwoierpjsm";
        System.out.println(s2.length()); //-------> FOR LENGTH
        java.lang.String s4 = "";
        System.out.println(s4.isEmpty()); //-----> FOR EMPTY
        java.lang.String s5 = " HTFS";
        System.out.println(s5.isBlank());  //-----> FOR BLANK
        System.out.println(s1.charAt(3));  //-----> FOR charAT
        System.out.println(s2.indexOf('D')); //------> FOR indexOf -- identifying position of the letter present in the String
        System.out.println(s2.lastIndexOf('D'));//------> FOR lastIndexOf--identifying position of the Last same char present in the given String
        java.lang.String s6 = " DINESH";
//        java.lang.String s7 = " KUMAR";
//        String s8 = s6.concat(s7);
//        System.out.println(s6.concat(s7)); // ---> FOR concat--used to add two strings s6 and s7.
        System.out.println(s6.concat(" KUMAR"));
    }
}

