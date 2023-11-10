import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Jugling {
    //It works, but it takes to long to compile, sadly
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String OGcombination = s.next();
        String ConcatCombination = "";
        if(OGcombination.length() <= 50){
            ConcatCombination = OGcombination + OGcombination + OGcombination + OGcombination + OGcombination + OGcombination;
        }else{
            ConcatCombination = OGcombination;
        }

        //Check if combination repeats

        if (!repeatingCheck(OGcombination)) {
            Set<Integer> hm = new HashSet<>();

            String result = "";

            Integer[] t = getDigits(Integer.parseInt(ConcatCombination));
            for (int i = 0; i < ConcatCombination.length(); i++) {
                int temp = t[i];
                if(hm.contains(i+temp)){
                    result= "INVALID";
                    break;
                }
                hm.add(i+temp);
                result="VALID";
            }
            System.out.println(result);
        }else{
            System.out.println("INVALID");
        }

    }

    /**
     * 
     */
    static boolean repeatingCheck(String string) {
        if (string.length() < 2) {
            return false;
        }
    
        StringBuilder substr = new StringBuilder();
        for (int i = 0; i < string.length() / 2; i++) {
            substr.append(string.charAt(i));
    
            String clearedFromSubstrings 
              = string.replaceAll(substr.toString(), "");
    
            if (clearedFromSubstrings.length() == 0) {
                return true;
            }
        }
    
        return false;
        
    }

    public static Integer[] getDigits(int num) {
        if (num < 0) { return new Integer[0]; }
        List<Integer> digits = new ArrayList<Integer>();
        collectDigits(num, digits);
        Collections.reverse(digits);
        return digits.toArray(new Integer[]{});
    }

    private static void collectDigits(int num, List<Integer> digits) {
        if(num / 10 > 0) {
            collectDigits(num / 10, digits);
        }
        digits.add(num % 10);
    }
}
