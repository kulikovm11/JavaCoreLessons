package lesson4lambda.task3;

import lesson4lambda.task3.Models.Skill;
import lesson4lambda.task3.Models.User;
import lesson4lambda.task3.enums.Gender;


import java.util.*;

public class Main {
    public static void main(String[] args) {



        User user1 = new User(1, "Jane", "Smith", "somemail@mail.com", 22,Gender.FEMALE,new ArrayList<>(),"Golf",2002,165);

        ArrayList<Skill> skills1 = user1.getSkills();
        skills1.add(new Skill("java",10));
        skills1.add(new Skill("js",5));


        User user2 = new User(2, "John", "Smith", "sqwertymail@mail.com", 30,Gender.MALE,new ArrayList<>(),"Jetta",2010,185);

        ArrayList<Skill> skills2 = user2.getSkills();
        skills2.add(new Skill("java",1));
        skills2.add(new Skill("js",3));


        User user3 = new User(3, "Leanne", "Graham", "sqweil@e.com", 45,Gender.MALE,new ArrayList<>(),"Polo",2000,75);

        ArrayList<Skill> skills3 = user3.getSkills();
        skills3.add(new Skill("python",7));
        skills3.add(new Skill("react",1));
        skills3.add(new Skill("php",4));

        User user4 = new User(4, "Ervin", "Howell", "asdddaa@email.com", 50,Gender.MALE,new ArrayList<>(),"T4",1999,95);

        ArrayList<Skill> skills4 = user4.getSkills();
        skills4.add(new Skill("js",1));
        skills4.add(new Skill("C#",1));
        skills4.add(new Skill("php",1));
        skills4.add(new Skill("python",3));
        skills4.add(new Skill("react",3));
        skills4.add(new Skill("vue",3));
        skills4.add(new Skill("C++",3));

        User user5 = new User(5, "Patricia", "Lebsack", "121dd@email.com", 26,Gender.FEMALE,new ArrayList<>(),"Cherry",2012,80);

        ArrayList<Skill> skills5 = user5.getSkills();
        skills5.add(new Skill("js",3));
        skills5.add(new Skill("C#",3));
        skills5.add(new Skill("java",1));
        skills5.add(new Skill("python",3));
        skills5.add(new Skill("react",3));

        User user6 = new User(6, "Chelsy", "Deitrich", "krmend@email.com", 20,Gender.FEMALE,new ArrayList<>(),"Volvo",2015,180);

        ArrayList<Skill> skills6 = user6.getSkills();
        skills6.add(new Skill("python",3));
        skills6.add(new Skill("C#",2));
        skills6.add(new Skill("java",3));

        User user7 = new User(7, "Glenna", "Reichert", "Sherwoodd@email.com.usa", 31,Gender.FEMALE,new ArrayList<>(),"Mazda",2005,90);

        ArrayList<Skill> skills7 = user7.getSkills();
        skills7.add(new Skill("qa/qc",1));


        User user8 = new User(8, "Nicholas", "Reichert", "charm223@email.com", 32,Gender.MALE,new ArrayList<>(),"Passat",1990,75);

        ArrayList<Skill> skills8 = user8.getSkills();
        skills8.add(new Skill("js",3));
        skills8.add(new Skill("C++",2));
        skills8.add(new Skill("java",3));

        User user9 = new User(9, "Clementina", "DuBuque", "padber@email.com", 40,Gender.FEMALE,new ArrayList<>(),"Lancer IX",2007,135);

        ArrayList<Skill> skills9 = user9.getSkills();
        skills9.add(new Skill("qa/qc",2));
        skills9.add(new Skill("C++",2));
        skills9.add(new Skill("java",3));
        skills9.add(new Skill("C#",3));
        skills9.add(new Skill("js",3));

        User user10 = new User(10, "Dennis", "Schulist", "karley465@email.com", 50,Gender.MALE,new ArrayList<>(),"Priora",2020,90);

        ArrayList<Skill> skills10 = user10.getSkills();
        skills10.add(new Skill("python",1));
        skills10.add(new Skill("php",2));











//        Set<User> users = new HashSet<>(10);
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//        users.add(user5);
//        users.add(user6);
//        users.add(user7);
//        users.add(user8);
//        users.add(user9);
//        users.add(user10);
//
////        System.out.println(users);
//
//       users.removeIf(user -> user.getGender().equals(Gender.MALE));
//        System.out.println(users);

   ///////////////////////////////////////////////////////////////////////////////////
   // Метод сравнения реализован в классе User

        Set<User> users = new TreeSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        System.out.println(users);


    }
}
