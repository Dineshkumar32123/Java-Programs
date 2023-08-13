public class E1 {
//        int age;
        // Create a checkAge() method with an integer variable called age
        static void checkAge(int age){
            if(age < 18){
                System.out.println("Access denied...you're not allowed...");
            } else if (age>=18) {
                System.out.println("Access granted...you're allowed...");
            }
        }
    public static void main(String[] args) {
            checkAge(18);
    }
}
