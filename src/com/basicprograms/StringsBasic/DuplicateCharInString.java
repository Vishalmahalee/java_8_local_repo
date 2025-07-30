package com.basicprograms.StringsBasic;

public class DuplicateCharInString {

    public static void main(String[] args) {
        String name="Great responsibility";


        char[] strings = name.toCharArray();

        System.out.println("Duplicate character in a string....");

        for (int i=0 ; i<strings.length; i++){

            int count=1;

            for (int j=i+1 ; j <strings.length; j++){

                if (strings[i]==strings[j] && strings[i]!=' '){

                    count++;

                    strings[j]='0';
                    //to mark it as already counted, so it won't be counted again in future iterations.
                }

            }

            if (count > 1 && strings[i]!='0'){

                System.out.println(strings[i]);
            }
        }
    }
}
