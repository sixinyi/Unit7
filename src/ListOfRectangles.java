import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {
    public static ArrayList<Rectangle> getRectangles() throws FileNotFoundException {
        Scanner input = new Scanner(new File("D:\\OS\\Java project\\Unit7\\out\\production\\Unit7\\rectangle.txt"));
        ArrayList<Rectangle> List = new ArrayList<>();
        while(input.hasNextDouble()){
            double newLength = input.nextDouble();
            double newWidth = input.nextDouble();
            List.add(new Rectangle(newLength, newWidth));
        }
        return List;
    }

    public static double findAverage(ArrayList<Rectangle> rectangles) {
        double value = 0.0;
        for(Rectangle List : rectangles)
            value += List.getArea();

        double average = value/rectangles.size();
        return average;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Rectangle> List = getRectangles();
        System.out.println("The average area would be " + findAverage(List));
    }
}