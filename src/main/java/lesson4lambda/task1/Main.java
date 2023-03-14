package lesson4lambda.task1;

import lesson4lambda.task1.Models.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <User> users = new ArrayList<>(9);
        users.add(new User(1,"John",22,true));
        users.add(new User(2,"Jane", 18,true));
        users.add(new User(3,"Bill",27,false));
        users.add(new User(4,"Anna",35,true));
        users.add(new User(5,"Eva",22,false));
        users.add(new User(6,"Mike",33,true));
        users.add(new User(7,"Jack",44,false));
        users.add(new User(8,"Lena",32,false));
        users.add(new User(9,"Kokosssss",3,true));

//        System.out.println(users);

//             V1 ASC Age

//        users.sort((a,b)-> a.getAge()- b.getAge());
//        System.out.println(users);

//             V2 ASC Age
//        Comparator<User>userComparatorASC = (a,b)-> a.getAge()- b.getAge();
//        users.sort(userComparatorASC);
//        users.forEach(user -> System.out.println(user));

//
//             V1 DSC Age
//        users.sort((a,b)-> b.getAge()- a.getAge());
//        System.out.println(users);

//             V2 DSC Age

//        Comparator<User>userComparatorDSC = (a,b)-> b.getAge()- a.getAge();
//        users.sort(userComparatorDSC);
//        users.forEach(user -> System.out.println(user));

        //              ASC Name V1

//        List<User> filteredByName = users.stream()
//                .sorted(Comparator.comparing(user -> user.getName().length()))
//                .collect(Collectors.toList());
//        System.out.println(filteredByName);



        //              ASC Name V2

//        users.sort((u1,u2)->Integer.compare(u1.getName().length(),u2.getName().length()));
//        System.out.println(users);


        //              DSC Name V2

//        users.sort((u1,u2)->Integer.compare(u2.getName().length(),u1.getName().length()));
//        System.out.println(users);




    }
}
