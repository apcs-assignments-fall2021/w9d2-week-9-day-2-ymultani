public class NinthGrader extends Student {
    public NinthGrader(String x, String y){
        super(x,y);
    }
    public NinthGrader(){
        super("Milan","Boga");
    }
    public String toString(){
        return (getFirstName() + " " + getLastName() + ", 2025(Ninth Grader)");
    }


}
