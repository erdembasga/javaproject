package practices.practice09;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Family {
    private Map<String, String> firstnameLastname = new HashMap<>();
    private Map<Integer, List<String>> ageAndSiblings = new HashMap<>();
    private Map<Map<String, String>, Map<Integer, List<String>>> familyMap = new HashMap<>();

    public Family(String firstname, String lastname, Integer age, String... siblings) {

        firstnameLastname.put(firstname, lastname);
        ageAndSiblings.put(age, List.of(siblings));
        familyMap.put(firstnameLastname, ageAndSiblings);

    }

    public Map<Map<String, String>, Map<Integer, List<String>>> getFamilyMap() {
        return familyMap;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyMap=" + familyMap +
                '}';
    }
}
