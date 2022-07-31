package week5;

import java.util.Arrays;

public class week5 {
    static int []index;
    static String compo;

    public static void checkSubset(String target, String[] set) {
        String visited = "";
        int ans = 0;
        int first =0;
        int second =0;
        int third =0;
        index = new int[target.length()];

        for (int i = 0; i < target.length(); i++) {

            for (int j = 0; j < set.length; j++) {
                for (int k = 0; k < set[j].length(); k++) {

                    if (target.toUpperCase().charAt(i) == set[j].toUpperCase().charAt(k)
                            && !visited.contains(target.charAt(i) + ""))
                    {
                        visited += target.charAt(i);


                        String some = set[j].toUpperCase();
                        if(set[j].toUpperCase().equals(set[0].toUpperCase())){
                            first ++;
                        }else if(set[j].toUpperCase().equals(set[1].toUpperCase())) {
                            second++;
                        }else if(set[j].toUpperCase().equals(set[2].toUpperCase())) {
                            third++;

                        }

                        if (ans <= j + 1) {
                            ans++;
                        }



                    }


                }
            }
        }
        if (first==target.length()) {
            System.out.println("All characters were found in " + set[0].toUpperCase() + "  '1'");
        }else if(second==target.length()) {
            System.out.println("All characters were found in FOR"  + set[1].toUpperCase() + "  '2'");
        }else if(third==target.length()) {
            System.out.println("All characters were found in PROGRAMMING"  + set[2].toUpperCase()+ "  '3' ");
        }else if((first+second)==target.length()) {
            System.out.println(2);
        }else if((first+third)==target.length()) {
            System.out.println(2);
        }else if((second+third)==target.length()) {
            System.out.println(3);
        } else {
            System.out.println(3);
        }





    }

    public static void main(String[] args) {
        String target = "frog";

        String[] set = { "programming", "For", "developers" };

        checkSubset(target, set);


    }
}
