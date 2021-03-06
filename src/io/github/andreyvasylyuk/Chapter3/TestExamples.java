package io.github.andreyvasylyuk.Chapter3;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestExamples {
    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE);
        System.out.println(new BigDecimal("2.0").subtract(new BigDecimal("1.1")));
        System.out.println("\u2122\u2122\u2124"); // \u000a

        String all = String.join(" * ", "1", "2", "3");
        System.out.println(all);

        String str = "Some text\u2122\u2124";
        int[] codePoints = str.codePoints().toArray();

        System.out.println(codePoints[0]);
        System.out.println(Arrays.toString(codePoints));

        System.out.println(str.indexOf("t"));
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.length());

        StringBuilder builder = new StringBuilder(); // for only one thread
        builder.append(str);
        builder.append(all);
        builder.insert(2, "INSERT");
        builder.delete(builder.length() - 3, builder.length());
        System.out.println("Capacity of builder : " + builder.capacity());
        String completedString = builder.toString();
        System.out.println(completedString);
        System.out.println("\n\n");

        int n;
        {
//            int n; // Exception in thread "main" java.lang.Error:
        }

        for (int i = 10; i > 0; i--)
            System.out.println("Counting down . . . " + i); // 10 times
        System.out.println("Blastoff!"); // 1 time
        
        /* Arrays */
        int[] luckyNumbers = {1, 3, 7, 12};
        luckyNumbers[3] = 17;
        
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        System.out.println("luckyNumbers array: " + Arrays.toString(luckyNumbers));
        System.out.println("copiedLuckyNumbers array: " + Arrays.toString(copiedLuckyNumbers));
    }
  
}
