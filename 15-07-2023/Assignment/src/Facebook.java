public class Facebook {

      private  String user_name="Dinesh";
      private  int user_id =123;
      private  int password = 12345;

     /* Facebook(String user_name,int user_id,int password){
          this.user_name=user_name;
          this.user_id=user_id;
          this.password=password;
      }  */

      //Getter and setter
    public String getUser_name(){
        return user_name;
    }
    public void setUser_name(String user_name){
        this.user_name=user_name;
    }

    //Getter
    public int getUser_id(){
        return user_id;
    }

    //Getter and setter
    public int getPassword(){
        return password;
    }
    public void setPassword(int password){
        this.password=password;
    }
}