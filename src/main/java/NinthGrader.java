public class NinthGrader extends Student {
    public NinthGrader(String x, String y){
        super(x,y);
    }
    public NinthGrader(){
        super("Milan","Boga");
    }
    public void doSomething(String x){
        System.out.println("I am currently " + x);
    }
    public String toString(){
        (getFirstName() + getLastName())
    }


}
