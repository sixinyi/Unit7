import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("D:\\OS\\Java project\\Unit7\\src\\file1.txt"));
        Scanner input2 = new Scanner(new File("D:\\OS\\Java project\\Unit7\\src\\file2.txt"));

        ArrayList<Integer> lis1 = new ArrayList<>();
        ArrayList<Integer> lis2 = new ArrayList<>();
        ArrayList<Integer> lis3 = new ArrayList<>();

        while (input1.hasNext()) {lis1.add(input1.nextInt());}
        while (input2.hasNext()) {lis2.add(input2.nextInt());}

        for (int i = 0; i < lis1.size(); i++) {
            for (int a = 0; a < lis2.size(); a++) {
                if (lis1.get(i).equals(lis2.get(a))) {
                    lis3.add(lis1.get(i));
                }
            }
        }
        return lis3;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:\\OS\\Java project\\Unit7\\src\\names.txt"));

        ArrayList<String> lis1 = new ArrayList<>();

        while (input.hasNext())
            lis1.add(input.next());

        System.out.println(lis1);
        for (int i = 0; i < lis1.size(); i++) {
            String current = lis1.get(i);

            for (int n = i + 1; n < lis1.size(); n++) {
                if (current.equals(lis1.get(n))) {
                    lis1.remove(n);
                    n--;
                    i--;
                }
            }
        }
        return lis1;
    }

    public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:\\OS\\Java project\\Unit7\\src\\file1.txt"));
        ArrayList<Integer> lis = new ArrayList<>();

        lis.add(input.nextInt());

        while (input.hasNext()) {
            int value = input.nextInt();

            for (int i = 0; i < lis.size(); i++) {
                if (value < lis.get(i)) {
                    lis.add(i, value);
                    break;
                }
                if(i == lis.size() - 1){
                    lis.add(value);
                    break;
                }
            }
        }
        return lis;
    }
}