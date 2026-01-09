public class CalculatorTest {

    public static void testSabiranje(){

        String first = "4";
        String second = "2";

        String expectedResultAddition = "6.0";

        String actualResultAddition = Calculator.Run(first + "+" + second);

        if (!expectedResultAddition.equals(actualResultAddition)) {
            System.out.println("Test failed for operation addition. Expected " + expectedResultAddition + " but got " + actualResultAddition);
        } else {
            System.out.println("Test is successful for operation addition");
        }

    }

    public static void main(String[] args) {

        testSabiranje();

    }

}