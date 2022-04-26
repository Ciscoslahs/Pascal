//Cisco Yslas
/*This class has a method called getChoices that calculates the combination of two integers.*/

import java.util.*;

public class Cisco_Yslas_PascalTriangle {
    public List<List<Integer>> getChoices(int nRows){
        List<List<Integer>> allRows = new ArrayList <List<Integer>>();
        ArrayList<Integer> thisRow = new ArrayList<Integer>();

        for(int i=0;i<nRows;i++){
            thisRow.add(0,1); //add element 1 at index 0

            //iterate rows, by adding elements in pair, starting from j = 1
            //setting the sum index at j
            for(int j=1;j<thisRow.size()-1;j++)
                thisRow.set(j, thisRow.get(j)+ thisRow.get(j+1));

            //Copying thisRow and storing it in allRows
            allRows.add(new ArrayList<Integer>(thisRow));
            //System.out.println(allRows);
        }
        return allRows;
    }


}
