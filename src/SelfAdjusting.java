import java.util.ArrayList;

/**
 * @author Wenxuan Yang
 * @since 3.10.2020
 * this method will check the numbers on the list and move to the front.
 * If the input number is not found, it is added to the front.
 */

public class SelfAdjusting {
    private ArrayList<Integer> lis;

    /**
     * Constructor for SelfAdjusting
     * @param lis Integer ArrayList input
     */

    public SelfAdjusting(ArrayList<Integer> lis){
        this.lis = lis;
    }

    /**
     * Simple accessor method for lis
     * @return lis Integer ArrayList input
     */

    public ArrayList<Integer> getlis(){
        return lis;
    }

    /**
     *  Scan even list from 2 to 20
     *  If it finds a number in the list, it moves it to the front of the list
     *  If no number is found in the list, add it to the front
     * */

    public void adjustList(){

        lis.remove(lis.size() - 1); // delete the 0 at the end

        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 2; i <= 20; i += 2)
            output.add(i); // adds all evens 2 to 20

        boolean findValue = false;
        for(int i = 0; i < lis.size(); i++){
            int num = lis.get(i);

            for(int n = 0; n < output.size(); n++){

                if(num == output.get(n)){
                    output.remove(n);
                    output.add(0, num);
                    findValue = true;//If it finds a number in the list, it moves it to the front of the list
                }
            }

            if(!findValue)
                output.add(0, num);//If no number is found in the list, add it to the front

            findValue = false;
        }

        lis = output;
    }
}