package lesson4lambda.task4.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private Map<Person, List<Pet>> club;

    public ZooClub() {
        club = new HashMap<>();
    }

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }



}