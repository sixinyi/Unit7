import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws IOException {
        ArrayList<Integer> lis = new ArrayList<>();
        Scanner input = new Scanner(new File("D:\\OS\\Java project\\Unit7\\src\\sortedData.txt"));

        for(int n = 0; n < 9 ; n++)
            lis.add(input.nextInt());

        return lis;
    }
    public static boolean isSorted(ArrayList<Integer> lis){
        for(int n = 0; n < lis.size() - 1; n++){
            if(lis.get(n) > lis.get(n + 1))
                return false;
        }
        return true;
    }
}