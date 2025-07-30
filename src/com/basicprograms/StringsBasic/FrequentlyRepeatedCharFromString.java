package com.basicprograms.StringsBasic;

public class FrequentlyRepeatedCharFromString {

    public static void main(String[] args) {
        String str = "picture perfect";
        int i,j;

        int [] freq = new int[str.length()];

        char[] strings = str.toCharArray();

        for (i=0 ;i<strings.length;i++){

            freq[i]=1;
            for (j=i+1;j<strings.length;j++){

                if (strings[i]==strings[j]){
                    freq[i]++;
                    strings[j]='0';
                }
            }
        }
        System.out.println("Display the character in the strings and its frequency");
        for (i=0; i<strings.length;i++){

            if (strings[i]!=' '&& strings[i]!='0'){
                System.out.println(strings[i]+"-"+freq[i]);
            }
        }

    }
}
