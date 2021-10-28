public class PersonClient {
    public static void main(String[] args) {
        Person john = new Person( "John", "Johnson");
        john.doSomething("playing fortnite");
        System.out.println(john.toString());
    }
}