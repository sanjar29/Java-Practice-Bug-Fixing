public class Bugged {
    /*
     *
     * This one just prints some random stuff and does some random math
     *
     */
    public static boolean printer(String val, int num1, double num2){
        System.out.println(val + "is my favorite color!");
        int num3 = 42;

        double num4 = num1 + num2 * num3;
        System.out.println("Your number is" + num3);

        System.out.println();
        return num4 == num1 + num2 * num3;
    }

    /*
     *
     * A broken calculator with the number 3 permanently jammed and the remainder button also permanently jammed
     * This means the first value entered into the calculator is always 3
     * This also means the symbol used is always %
     * Returns True at the end no matter what
     *
     */
    public static boolean jammedCalculator(int val){
        int jammedVal = 3;
        System.out.println("Your result is " + jammedVal % val);
        return true;
    }

    /*
     *
     * This is where your program actually runs everything
     *
     */
    public static void main(String[] args){
        System.out.println(printer("Indigo", 1, 4.0));
        System.out.println(jammedCalculator(4));
        System.out.println("Done!");
    }
}
