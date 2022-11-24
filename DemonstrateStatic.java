public class DemonstrateStatic {
    
    static int num;
    static String myblock;
    //First Static block
    static{
        System.out.println("Static Block 1  ");
        num = 8;
        myblock = "Block1";

    }
    // Second static block
    static {
        System.out.println("Static Block 2");
        num = 888;
        myblock = "Block2";

    }
public static void main(String[] args) {
    System.out.println("Value of num = " + num);
    System.out.println( "Value of mystr = "+ myblock);
}
}
