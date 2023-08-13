public class FacebookDriver {
    public static void main(String[] args) {
//        Facebook f = new Facebook("Dinesh",122,32123);
        Facebook f = new Facebook();
        System.out.println("User name: "+f.getUser_name());
        f.setUser_name("Dinesh K");
        System.out.println("new user_name: "+f.getUser_name());

        //User_id
        System.out.println("user_id: "+f.getUser_id());
        //password
        System.out.println("password: "+f.getPassword());
        f.setPassword(54321);
        System.out.println("The new password is: "+f.getPassword());


    }
}
