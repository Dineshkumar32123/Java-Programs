public class Palindrome_Count {

        public static int countPalindrome(String s,String temp,int count){
            for (int i = 0;i <= s.length();i++){
                for (int j = i+1; j<=s.length(); j++){
                    temp = s.substring(i,j);
                    if (temp.length()>=2){
                        StringBuffer ref = new StringBuffer(temp);
                        ref.reverse();
                        if (ref.toString().equals(temp)){
                            count++;
                        }
                    }
                }
            }
//            System.out.println("The count of given palindrome is :"+count);
            return count;
        }

        public static void main(String[] args) {
            String s = "abaab";
            String temp="";
            int count = 0;
            System.out.println("The count of given palindrome is : "+countPalindrome(s,temp,count));
        }


}
