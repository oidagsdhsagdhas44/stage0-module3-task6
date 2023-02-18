package lang.print.gaps.task6;

public class PrePostIncrement {
//    You will be given a code snippet, and you task will be to get expected result by inserting correct pre/post increment
//    oprators to specified variables. Implement the task in the following code snippet:
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 12;
        int d = 15;

        // use post-increment operator in the mathematical expression  
        int x =   a   + b +   ++c   + d;
        System.out.println("Expected x is 40, x = " + x);
        // print the updated value of a, b, c, and d  
        System.out.println("The updated value of a = " + a + ", b = " + b + ", c = " + c + " and d = " + d);

    }
}
