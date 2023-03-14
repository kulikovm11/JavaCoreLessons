package lesson4lambda.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(15);
        strings.add("harbour");
        strings.add("trained");
        strings.add("booklet");
        strings.add("whereas");
        strings.add("pungent");
        strings.add("declare");
        strings.add("embassy");
        strings.add("athwart");
        strings.add("astride");
        strings.add("without");
        strings.add("against");
        strings.add("fourths");
        strings.add("unnerve");
        strings.add("huzzah");
        strings.add("passive");



        strings.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(strings);
    }


}
