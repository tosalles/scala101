package nl.sogyo.fp;

import java.util.List;
import java.util.stream.Collectors;

public class StringNames {

    public static String namesImp(List<String> names) {
        StringBuilder result = new StringBuilder();
        for(String name: names) {
            if(name.length() > 3) {
                result.append(capitalizeName(name)).append(", ");
            }
        }
        return result.substring(0, result.length()-2);
    }

    private static String capitalizeName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static String namesFun(List<String> names) {
        return names.stream()
                .filter(n -> n.length() > 3)
                .map(StringNames::capitalizeName)
                .collect(Collectors.joining(", "));
    }
}
