package Lesson3Interfaces.Models;

import Lesson3Interfaces.interfaces.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable {

    String title;
    int page_count;
    String genre;


    @Override
    public void print() {

        System.out.println("I'm a book!");

    }
}
