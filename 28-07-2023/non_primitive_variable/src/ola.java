public class ola {
    String customer_name;
    int password;
    long contact_num;

    ola(String customer_name, int password, long contact_num) {
        this.customer_name = customer_name;
        this.password = password;
        this.contact_num = contact_num;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public long getContact_num() {
        return contact_num;
    }

    public void setContact_num(long contact_num) {
        this.contact_num = contact_num;
    }

}

class mini extends ola{
    int mini_price ;
    mini(int mini_price,String customer_name,int password, long contact_num){
        super(customer_name,password,contact_num);
        this.mini_price=mini_price;
    }
}
class macro extends ola {
    int macro_price;

    macro(int macro_price, String customer_name, int password, long contact_num) {
        super(customer_name, password, contact_num);
        this.macro_price = macro_price;
    }
}
    class sedan extends ola {
        int sedan_price;

        sedan(int sedan_price, String customer_name, int password, long contact_num) {
            super(customer_name, password, contact_num);
            this.sedan_price = sedan_price;
        }

}
