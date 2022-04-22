public class App {
    /**
     * modifying methods to computeSum()
     */
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }

    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /**
     * Method to return greater int value
     */
    public static int greaterValue(int Num1, int Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }
    /**
     * Method to return greater double value
     */
    public static double greaterValue(double Num1, double Num2) {

        if (Num1 > Num2) {
            return Num1;
        } else {
            return Num2;
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Using overloading
         */

        System.out.println("Sum of two numbers 15 and 14: " + computeSum(15, 14));
        System.out.println("Sum of three numbers 80, 60 , 50: " + computeSum(80, 60, 50));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 28 and 15 is " + greaterValue(28,15));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 2.6 and 8.5 is " + greaterValue(2.6,8.5));

    }
}