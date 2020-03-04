import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {
    public static ArrayList<Donor> readFile()throws FileNotFoundException {
        ArrayList<Donor> list = new ArrayList<>();
        Scanner input = new Scanner(new File("D:\\OS\\Java project\\Unit7\\src\\donors.txt"));

        while(input.hasNextLine()){
            String line = input.nextLine();
            String name = line.substring(0, line.indexOf(" "));
            String number = line.substring(line.indexOf(" "));

            Donor result = new Donor(name,Double. parseDouble(number) );
            list.add(result);
        }
        return list;
    }
    public static void sortDonors(ArrayList<Donor> list) {
        for (int i = 0; i < list.size(); i++) {
            int max = i;
            for (int a = i + 1; a < list.size(); a++) {
                if (list.get(max).getAmount() < list.get(a).getAmount()) {
                    max = a;
                }
            }
            Donor name = list.get(i);
            list.set(i, list.get(max));
            list.set(max, name);
        }
    }
}