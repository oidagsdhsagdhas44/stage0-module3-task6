package lang.print.gaps.task6;

public class FloatTypeCasting {
//    You will be given a float number, and your task will be to find a correct way to round this variable to integer variable,
//    corresponding to Math rules (requires googling). Print that variable to console. Implement program inside a code snippet given below:
    public void roundNumber(float numberToBeRounded) {
//        int res = (int)numberToBeRounded;
        int base = (int)numberToBeRounded;
        float afterDecimal = numberToBeRounded - base;
        base = afterDecimal >= 0.5 ? base+1 : base;
        System.out.println(base);
    }
}
