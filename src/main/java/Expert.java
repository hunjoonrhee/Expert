import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Expert {

    public static void main(String[] args) {

    }

    public static String reverse(String string){
        String result = "";
        if(string == null){
            result = "Die Eingabe darf nicht null sein!";
        }else{
            char[] c = string.toCharArray();
            if(c.length == 1){
                result = string;
            }else{
                for(int i = c.length-1; i>=0 ; i--){
                    result += c[i];
                }
            }
        }
        return result;
    }

    public static String sortAsc(int[] intArray){
        ArrayList<Integer> IntArray = new ArrayList<>();
        for (int i = 0; i<intArray.length; i++){
            IntArray.add(intArray[i]);
        }
        Collections.sort(IntArray);
        int [] sortedIntArray = new int[IntArray.size()];
        for (int i=0; i<IntArray.size(); i++){
            sortedIntArray[i] = IntArray.get(i);
        }
        return Arrays.toString(sortedIntArray);
    }

    public static String splitStringbyComma(String myString){

        if(!myString.contains(",")){
            String [] myStringArray = new String[1];
            myStringArray[0] = myString;
            return Arrays.toString(myStringArray);
        }else{
            return Arrays.toString(myString.split(","));
        }
    }

    public static int calDigitSum(int number){
        String numString = String.valueOf(number);
        char[] c = numString.toCharArray();
        int sum = 0;
        for(int i = 0; i<c.length; i++){
            sum+=Character.getNumericValue(c[i]);
        }
        return sum;
    }
}
