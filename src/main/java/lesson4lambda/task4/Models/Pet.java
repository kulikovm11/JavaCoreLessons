package lesson4lambda.task4.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pet {

    String type;
    String name;
    int age;
    String breed;
}
