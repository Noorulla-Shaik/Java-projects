public class Scopevariable06 {
    int myvalue =100; //instance variable
    static  int mynumber=100; //calss variable
    public static void main(String[] args) {
        int local_variable =20; //loacal variable
        Scopevariable06 s = new Scopevariable06();
        System.out.println(" Local variable =" +local_variable);
        System.out.println(" Instance variable =" +s.myvalue);
        System.out.println("Class variable =" +s.mynumber);
    }
}
