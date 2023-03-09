package Lesson3Interfaces.Models;

import Lesson3Interfaces.interfaces.Instrument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Drum implements Instrument {
    int size;

    @Override
    public void play() {

        System.out.println("now playing drum with a"+" "+ size +" "+"size");

    }
}
