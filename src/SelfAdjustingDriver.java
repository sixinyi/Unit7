import java.util.ArrayList;
// driver for SelfAdjusting

public class SelfAdjustingDriver {
    public static void main(String[] args){
        ArrayList<Integer> lis1 = new ArrayList<>();
        lis1.add(12);
        lis1.add(14);
        lis1.add(8);
        lis1.add(2);
        lis1.add(0);

        SelfAdjusting op1 = new SelfAdjusting(lis1);
        System.out.println("Test 1 Input: " + op1.getlis());

        op1.adjustList();
        System.out.println("Test 1 Output: " + op1.getlis());
        System.out.println();


        ArrayList<Integer> lis2 = new ArrayList<>();
        lis2.add(11);
        lis2.add(14);
        lis2.add(11);
        lis2.add(8);
        lis2.add(13);
        lis2.add(0);

        SelfAdjusting output2 = new SelfAdjusting(lis2);
        System.out.println("Test 2 Input: " + output2.getlis());

        output2.adjustList();
        System.out.println("Test 2 Output: " + output2.getlis());
    }
}