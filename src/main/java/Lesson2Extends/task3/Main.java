package Lesson2Extends.task3;

import Lesson2Extends.task3.Models.Skill;
import Lesson2Extends.task3.Models.User;
import Lesson2Extends.task3.enums.Gender;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user = new User(1,"John","Smith","email.com",22, Gender.MALE,new ArrayList<>(),"Golf",2002,150);

        ArrayList<Skill> skills = user.getSkills();

        skills.add(new Skill("java", 10));
        skills.add(new Skill("js", 5));
        skills.add(new Skill("python", 10));

        System.out.println(user);

    }

}
