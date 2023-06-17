package brown.kaew.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

    List<Person> personList;

    @BeforeEach
    void setUp() {
        personList = new ArrayList<>();
        personList.add(new Person(43, "Jina", "Junja", "W"));
        personList.add(new Person(22, "Garet", "Bell", "M"));
        personList.add(new Person(18, "Anna", "Bell", "W"));
        personList.add(new Person(45, "Hanzo", "Lo", "M"));
        personList.add(new Person(23, "Jina", "Haa", "W"));
        personList.add(new Person(17, "Saena", "Susu", "W"));
        personList.add(new Person(30, "Ari", "Wuu", "W"));
        personList.add(new Person(22, "Kaew", "Ti", "M"));
    }

    @Test
    void sortByFirstNameAndLastname() {
        personList.sort(Comparator.comparing(Person::getFirstname)
                .thenComparing(Person::getLastname));

        for (Person e : personList) {
            System.out.println(e);
        }
    }

    @Test
    void groupingListByGender() {
        Map<String, List<Person>> collect = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        System.out.println(collect.get("W"));
        System.out.println("===========");
        System.out.println(collect.get("M"));
    }

    @Test
    void summaryAgeGroupingListByGender() {
        Map<String, IntSummaryStatistics> collect = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.summarizingInt(Person::getAge)));

        System.out.println(collect.get("W"));
        System.out.println("===========");
        System.out.println(collect.get("M"));
    }

    @Test
    void filterOnlyPersonOlderThanOrEqual30() {
        List<Person> collect = personList.stream()
                .filter(person -> person.getAge() >= 30)
                .collect(Collectors.toList());

        for (Person e : collect) {
            System.out.println(e);
        }
    }

}