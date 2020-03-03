import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    private static Scanner input = new Scanner(System.in);

    public static ArrayList<Integer> numberList(){
        ArrayList<Integer> lisnum = new ArrayList<>();
        lisnum.add(0);lisnum.add(-5);lisnum.add(7);lisnum.add(12);lisnum.add(-1);
        lisnum.add(2,10);
        lisnum.set(1,9);
        System.out.println(lisnum);
        lisnum.remove(4);
        System.out.println(lisnum);
        return lisnum;
    }

    public static ArrayList<Double> firstAndLast(){
        ArrayList<Double> list = new ArrayList<Double>();
        int n = 1;  
        while(n != 0) {
            System.out.println("Enter a number: ");
            double x = input.nextDouble();
            if(x == 0)
                n = 0;
            else
                list.add(x);
        }
        ArrayList<Double> output = new ArrayList<>();
        output.add((double)list.size());
        output.add(list.get(0));
        output.add(list.get(list.size() - 1));
        return output;
    }

    /*public static ArrayList<Double> firstAndLast() {
        ArrayList<Double> list = new ArrayList<>();
        double n = 2;
        System.out.println("Enter your number: ");
        while (n != 0){
            n = input.nextDouble();
            list.add(n);
        }
        ArrayList<Double> outcome = new ArrayList<>();
        outcome.add(list.size()-1.0);
        outcome.add(list.get(0));
        outcome.add(list.get(list.size()-2));
        return outcome;
    }
*/
    public static ArrayList<Double> getNumbers() {
        ArrayList<Double> List = new ArrayList<Double>(3);
        double one = input.nextDouble(); double two = input.nextDouble(); double three = input.nextDouble();
        List.add(one);List.add(two);List.add(three);
        return List;
    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {
        double one = numbers.get(0);
        double two = numbers.get(0);
        double thr = numbers.get(0);

        for (int i = 0; i < 3; i++) {
            if (numbers.get(i) < one) {
                one = numbers.get(i);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (numbers.get(i) > thr) {
                thr = numbers.get(i);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (one < numbers.get(i) && numbers.get(i) < thr) {
                two = numbers.get(i);
            }
        }
        numbers.set(0, one);
        numbers.set(1, two);
        numbers.set(2, thr);
        return numbers;
    }

}