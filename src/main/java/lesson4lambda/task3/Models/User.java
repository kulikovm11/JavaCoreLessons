package lesson4lambda.task3.Models;


import lesson4lambda.task3.enums.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class User implements Comparable<User>{

    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    ArrayList<Skill> skills = new ArrayList<>();
    Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skill> skills, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model, year, power);
    }

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.getSkills().size();
    }
}
