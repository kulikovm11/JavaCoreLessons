package Lesson3Interfaces.Models;

import Lesson3Interfaces.interfaces.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Magazine implements Printable{

    String title;
    int page_count;
    String brand;

    @Override
    public void print() {

        System.out.println("I'm a magazine!");

    }
}
