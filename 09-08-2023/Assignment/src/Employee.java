public class Employee {
    String ename;
    int eid;
    double salary;
    public Employee(String ename, int eid, double salary){
        this.ename=ename;
        this.eid=eid;
        this.salary=salary;
    }

    //toString()
    @Override
    public String toString(){
        return ("The Employee name is: "+ename+"\nThe Employee id is: "+eid+"\nThe salary is: "+salary);
    }
    //equals()
    @Override
    public boolean equals(Object o){
        //Object o = new Employee()--->upcast(Implicitly)
        Employee obj = (Employee) o; //downcasting
        if (this.ename.equals(obj.ename)){
            return true;
        }
        else
            return false;
    }
    @Override
    public  int hashCode(){
        return 54321;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Dinesh",123,35000);
        Employee e1 = new Employee("jack",123,35000);
        //toString()
        System.out.println(e.toString());
        //equals()
        System.out.println(e.ename.equals(e1.ename));
        System.out.println(e.salary== e1.salary);
        System.out.println(e.eid== e1.eid);
        //hashcode()
        System.out.println(e.hashCode());
    }
}