
import java.util.*;

public class Cisco_Yslas_Project {

    public static void main (String[] args){
        System.out.println("Welcome to Pascal's Triangle generator");

        //boolean keepGoing = true;//working on a while loop to keep the program going
        //while(keepGoing == true) {

        System.out.println("Please enter an integer to get started.");
        Scanner userInput = new Scanner(System.in);
        int response = userInput.nextInt();
        Cisco_Yslas_PascalTriangle triangle = new Cisco_Yslas_PascalTriangle();
        List<List<Integer>> result = triangle.getChoices(response);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> current = result.get(i);
            System.out.println(Arrays.toString(current.toArray()));
        }
    }




}

