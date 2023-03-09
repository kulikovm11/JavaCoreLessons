package Lesson3Interfaces.Models;

import Lesson3Interfaces.interfaces.Instrument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements Instrument {
    int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Now playing guitar with a count"+" "+ numberOfStrings +" "+"of strings");
    }
}
