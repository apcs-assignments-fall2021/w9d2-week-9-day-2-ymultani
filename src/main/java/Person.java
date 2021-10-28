public class Person {
    private int age;
    private String firstname;
    private String activity;
    private String lastname;
    public Person( String f, String l){
        firstname = f;
        lastname = l;

    }

    public void set_firstname(String x){
        firstname = x;
    }
    public void set_lastname(String x){
        lastname = x;
    }
    public String doSomething(String x){
        activity = (firstname +" is currently " + x);
        System.out.println(activity);
        return activity;
    }
    public String toString(){
        return firstname + " " + lastname;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }


}
