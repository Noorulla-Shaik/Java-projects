/*  TYPE CASTING- Two types
 * 1 implicit tc
 * 2 explicit tc
 * implicit :
 *  - converting small to big datatype
 *  - no loss of data
 * explicit :
 *  - converting big to small datatype
 *  - loss of data
 */
// implicit typecasting source code :
class implicit{
    public static void main(String[] args) {
        byte n = 10;
        int m = 67+n; //implicit
        System.out.println("m="+m);
    }
}

//explicit typecasting source codd:
class explicit {
    public static void main(String[] args) {
        float a =10.5f;
        double d = 10.5+a;
        System.out.println("d ="+d);
    }
}