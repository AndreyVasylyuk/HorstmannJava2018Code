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
        builder.delete(builder.length()-3, builder.length());
        System.out.println("Capacity of builder : " + builder.capacity());
        String completedString = builder.toString();
        System.out.println(completedString);
     }

}
