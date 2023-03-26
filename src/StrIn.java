public class StrIn {
    void display(double a){
        System.out.println("Double");
    }
    void display(String b){
        System.out.println("String");
    }

    public static void main(String[] args) {
        StrIn s=new StrIn();
        s.display("Faahim");
        s.display(23.67);
    }
}
