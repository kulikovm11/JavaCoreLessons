package Lesson3Interfaces.Models;

import Lesson3Interfaces.interfaces.Instrument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trumpet implements Instrument {
    int diameter;

    @Override
    public void play() {

        System.out.println("Now playing trumpet with"+" "+ diameter +" "+"a diameter");

    }
}
