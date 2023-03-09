package Lesson2Extends.task1;

import Lesson2Extends.task1.Models.Address;
import Lesson2Extends.task1.Models.Company;
import Lesson2Extends.task1.Models.User;

public class Main {
    public static void main(String[] args) {

        User user = new User(
                1,
                "John Smith",
                "painkiller",
                "1232@gmail.com",
                new Address("Lva Tolstoho", "11-22", "Kyiv", "79000", "1212", "33333"),
                "11-222333-33",
                "site.com",
                new Company("company","bla-bla-bla","sdsds")
        );

        System.out.println(user);

    }
}

