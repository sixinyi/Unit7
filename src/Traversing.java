import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {

    public static Scanner input  = new Scanner(System.in);

    public static ArrayList<String> getStates() {

        ArrayList<String> num = new ArrayList<>();

        System.out.print("Enter the name of a state or \"Stop\" to quit: ");

        String name = input.next();
        num.add(name);

        while (!name.equals("Stop")) {
            System.out.print("Next state or \"Stop\": ");
            name = input.next();
            if (name.equals("Stop"))
                break;
            num.add(name);
        }
        return num;
    }


    public static String createList(ArrayList<String> states) {
        String list = "";

        int listLength = states.size();
        for (int i = 0; i < listLength - 1; i++) { list += states.get(i) + " -> "; }
        list += states.get(listLength - 1);
        return list;
    }



    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        ArrayList<Integer> num = new ArrayList<Integer>();

        Scanner input = new Scanner(new File("D:\\OS\\Java project\\Unit7\\src\\numbers.txt"));

        while (input.hasNext()) { num.add(input.nextInt()); }

        //for (int x = 0; x < num.size(); x++)
          //  System.out.print(num.get(x) + " ");

        int sma = num.get(0);
        int big = num.get(0);

        for(int x = 0; x < num.size(); x++){
            if(num.get(x) < sma)
                sma = num.get(x);
            else if(num.get(x) > big)
                big = num.get(x);
        }

        num.remove(num.indexOf(big));
        num.add(big);

        num.remove(num.indexOf(sma));
        num.add(0, sma);

        return num;

    }


}