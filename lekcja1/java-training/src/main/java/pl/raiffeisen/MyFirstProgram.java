package pl.raiffeisen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by rb21776 on 2016-07-14.
 */
public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello world");
        List<String> names = getNames();
        System.out.println("Names: " + names.toString());
        System.out.println("Names: " + formatList(names));
        System.out.println("Names: " + format3(names));
        System.out.println("Names: " + format4(names));

        System.out.println("Imiona: " + myFormat(names));

    }



    private static String format4(List<String> names) {
        StringJoiner stringJoiner = new StringJoiner("///", "<", ">");
        for (String name : names) {
            stringJoiner.add(name);
        }
        return stringJoiner.toString();
    }

    private static String format3(List<String> names) {
       return "(" + String.join(";",names) + ")";
    }

    private static String formatList(List<String> names) {
        return formatList(names, "(",")","-");
    }


    private static String formatList(List<String> names, String open, String close, String delimiter) {
        String result = open;
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            result+=iterator.next();
            if(iterator.hasNext()) {
                result+= delimiter;
            }
        }
        result += close;
        return result;
    }


    private static List<String> getNames() {
        List<String> names = new ArrayList<String>();
        names.add("Karol");
        names.add("Jan");
        names.add("Mateusz");
        return names;
    }


    private static String myFormat(List<String> lista) {
        String a = "(";
        for(int i=0; i< lista.size();i++) {
            a+= lista.get(i)+";";
        }
        String b = a.substring(0, a.length() - 1);
        b += ")";
        return b;
    }
}
